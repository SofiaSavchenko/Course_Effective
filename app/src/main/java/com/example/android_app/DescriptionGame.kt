package com.example.android_app

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android_app.ui.theme.AppTheme

@Composable
fun DescriptionGame() {

    val context = LocalContext.current

    Text(
        text = context.getString(R.string.description_game),
        modifier = Modifier
            .padding(top = 24.dp, start = 24.dp, end = 24.dp)
            .alpha(0.7f),
        style = AppTheme.TextStyle.Regular_12,
        color = AppTheme.TextColors.lightWhite,
        lineHeight = 19.sp
    )
}

@Preview
@Composable
fun DescriptionGamePreview() {

    Surface(
        color = AppTheme.BgColors.primary,
    ) {
        DescriptionGame()
    }
}
