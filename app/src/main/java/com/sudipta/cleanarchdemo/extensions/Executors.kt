package com.sudipta.cleanarchdemo.extensions

import java.util.concurrent.Executors

private val IO_EXECUTOR = Executors.newSingleThreadExecutor()

//Room purposes
fun ioThread(f: () -> Unit) {
    IO_EXECUTOR.execute(f)
}