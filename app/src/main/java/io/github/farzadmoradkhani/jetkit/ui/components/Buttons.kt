package io.github.farzadmoradkhani.jetkit.ui.components

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import io.github.farzadmoradkhani.jetkit.ui.theme.Black

@Composable
fun ToggleButton(
    stack: ArrayDeque<ToggleState>,
    onPop: (ToggleState) -> Unit = {}
){
    //keep internal state
    var current by remember { mutableStateOf(stack.last())}
    Button(
        colors = ButtonDefaults.buttonColors(containerColor = current.color),
        onClick = {
        val popped = stack.removeLast()
        stack.addFirst(popped)
        current = stack.last()
        onPop(current)
    }) {
        Text(current.label)
    }



}

data class ToggleState(
    val value : String,
    val label : String,
    val color : Color
)