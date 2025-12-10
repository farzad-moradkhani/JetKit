package io.github.farzadmoradkhani.jetkit.ui.components

import android.util.Size
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BasicTextField(
    text : MutableState<String>,
    label : String,
    placeholder: String
){
    Box(
        modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp),
        contentAlignment = Alignment.Center){
        OutlinedTextField(
            value = text.value,
            onValueChange = { text.value = it },
            label = { Text(label) },
            placeholder = { Text(placeholder) },
            singleLine = true
        )
    }

}

@Composable
fun BasicTitle(
    text : String
){
    Box(modifier = Modifier
        .fillMaxWidth()
        .padding(top = 10.dp),
        contentAlignment = Alignment.Center){
        Text(text, fontWeight = FontWeight.Bold, fontSize = 17.sp )

    }
}