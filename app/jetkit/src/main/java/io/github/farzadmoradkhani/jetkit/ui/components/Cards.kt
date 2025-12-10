package io.github.farzadmoradkhani.jetkit.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.github.farzadmoradkhani.jetkit.ui.theme.Black
import io.github.farzadmoradkhani.jetkit.ui.theme.JetKitTheme
import io.github.farzadmoradkhani.jetkit.ui.theme.White

@Composable
fun BasicCard(
    title: String?,
    buttonText: String? = null,
    buttonClick: () -> Unit = {},
    content: @Composable () -> Unit = {}
) {
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp, vertical = 12.dp)
            .background(Color.White, RoundedCornerShape(20.dp))
,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        if (!title.isNullOrEmpty()) {
            _root_ide_package_.io.github.farzadmoradkhani.jetkit.ui.components.BasicTitle(title)
        }

        Spacer(modifier = Modifier.height(8.dp))

        content()

        if (!buttonText.isNullOrEmpty() && buttonClick != null) {
            Spacer(modifier = Modifier.height(8.dp))
            Button(
                onClick = buttonClick,
                colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.primary),
                shape = RoundedCornerShape(11.dp),
                modifier = Modifier.fillMaxWidth().padding(horizontal = 11.dp, vertical = 5.dp)
            ) {
                Text(buttonText)
            }
        }
    }
}
