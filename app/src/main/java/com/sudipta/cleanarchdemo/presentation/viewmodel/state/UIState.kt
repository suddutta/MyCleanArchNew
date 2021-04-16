package com.sudipta.cleanarchdemo.presentation.viewmodel.state

import com.sudipta.cleanarchdemo.presentation.model.PostUI

sealed class UIState

object DefaultState : UIState()
object LoadingState : UIState()
data class ErrorState(internal val errorMessage: String) : UIState()
data class RetrievedPostState(internal val postList: List<PostUI>) : UIState()