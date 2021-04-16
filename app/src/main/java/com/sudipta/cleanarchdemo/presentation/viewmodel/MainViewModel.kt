package com.sudipta.cleanarchdemo.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.sudipta.cleanarchdemo.base.RxViewModel
import com.sudipta.cleanarchdemo.domain.Post
import com.sudipta.cleanarchdemo.domain.PostUseCase
import com.sudipta.cleanarchdemo.extensions.with
import com.sudipta.cleanarchdemo.presentation.model.PostUI
import com.sudipta.cleanarchdemo.presentation.viewmodel.state.*

class MainViewModel(private val postUseCase: PostUseCase) : RxViewModel() {

    private val _uiState = MutableLiveData<UIState>().apply {
        value = DefaultState
    }

    val uiState: LiveData<UIState>
        get() = _uiState

    fun loadPosts() {
        addToDisposable(
            postUseCase.getPosts().with()
                .doOnSubscribe { handleLoadingState() }
                .doOnSuccess { handlePostList(it) }
                .doOnError { handleFailure(it) }
                .subscribe())
    }

    private fun handleLoadingState() {
        _uiState.value = LoadingState
    }

    private fun handlePostList(postList: List<Post>) {
        _uiState.value = RetrievedPostState(postList.map(postDomainToUIMapper))
    }

    private fun handleFailure(t: Throwable) {
        _uiState.value =
            ErrorState(
                t.message.toString()
            )
    }

    private val postDomainToUIMapper: (Post) -> PostUI = { postDomain ->
        PostUI(postDomain.id, postDomain.title, postDomain.body)
    }
}