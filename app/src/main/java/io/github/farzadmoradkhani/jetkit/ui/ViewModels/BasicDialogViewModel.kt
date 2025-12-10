package io.github.farzadmoradkhani.jetkit.ui.ViewModels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class BasicDialogViewModel : ViewModel(){
    var dialogState by mutableStateOf(false)
    fun open(){ dialogState=true}
    fun close(){ dialogState = false}
}