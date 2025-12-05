package io.github.farzadmoradkhani.jetkit

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Snackbar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.farzadmoradkhani.jetkit.ui.components.BasicCard
import io.github.farzadmoradkhani.jetkit.ui.components.PairedRow
import io.github.farzadmoradkhani.jetkit.ui.components.ToggleButton
import io.github.farzadmoradkhani.jetkit.ui.components.ToggleState
import io.github.farzadmoradkhani.jetkit.ui.theme.Gray
import io.github.farzadmoradkhani.jetkit.ui.theme.JetKitTheme
import io.github.farzadmoradkhani.jetkit.ui.theme.Pink40
import io.github.farzadmoradkhani.jetkit.ui.theme.White

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()


        setContent {
            JetKitTheme {
                val scrollState = rememberScrollState()

                val stateStack = remember {
                    ArrayDeque(
                        listOf(
                            ToggleState("Play", "Play",Pink40),
                            ToggleState("Pause", "Pause",Gray),
                            ToggleState("Stop", "Stop",Color.Red)
                        )
                    )
                }

                Column(modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 40.dp)
                    .background(color = Color.Gray)
                    .verticalScroll(scrollState)) {
                    BasicCard("hey" ,"click me", {}){
                        PairedRow(key = "key", value = "value")
                        PairedRow(key="key", toggleButton = {ToggleButton(stateStack,{
                            Log.d("DEVV", "onCreate: POPPED"+ stateStack.last())
                        })
                        })
                    }



                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetKitTheme {
        Greeting("Android")
    }
}