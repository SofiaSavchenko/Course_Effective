package com.example.android_app

import android.widget.Toast
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android_app.ui.theme.AppTheme

@Composable
fun InstallButton() {

    val context = LocalContext.current

    Button(
        onClick = {
            Toast.makeText(
                context,
                "",
                Toast.LENGTH_SHORT
            ).show()
        },
        colors = ButtonDefaults.buttonColors(AppTheme.ButtonColors.yellow),
        modifier = Modifier
            .padding(horizontal = 24.dp, vertical = 40.dp)
            .fillMaxWidth()
            .height(70.dp),
        shape = RoundedCornerShape(12.dp)
    ) {
        Text(
            text = context.getString(R.string.installButton_name),
            color = AppTheme.TextColors.darkBlue,
            modifier = Modifier.wrapContentSize(Alignment.Center),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Preview
@Composable
fun InstallButtonPreview() {
    Surface(
        color = AppTheme.BgColors.primary,
    ) {
        InstallButton()
    }

}