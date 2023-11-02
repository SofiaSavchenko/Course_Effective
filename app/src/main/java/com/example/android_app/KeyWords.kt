package com.example.android_app

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.android_app.ui.theme.AppTheme

@Composable
fun KeyWords() {

    val context = LocalContext.current

    Row(Modifier.padding(start = 24.dp, top = 16.dp)) {
        Box(
            modifier = Modifier
                .height(22.dp)
                .width(53.dp)
                .clip(RoundedCornerShape(100))
                .background(AppTheme.BgColors.turquoise.copy(alpha = 0.24f)),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = context.getString(R.string.word1),
                color = AppTheme.BgColors.darkTurquoise,
                style = AppTheme.TextStyle.RegularMedium_10
            )
        }
        Spacer(modifier = Modifier.width(10.dp))
        Box(
            modifier = Modifier
                .width(93.dp)
                .height(22.dp)
                .clip(RoundedCornerShape(100))
                .background(AppTheme.BgColors.turquoise.copy(alpha = 0.24f)),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = context.getString(R.string.word2),
                color = AppTheme.BgColors.darkTurquoise,
                style = AppTheme.TextStyle.RegularMedium_10
            )
        }
        Spacer(modifier = Modifier.width(10.dp))

        Box(
            modifier = Modifier
                .width(73.dp)
                .height(22.dp)
                .clip(RoundedCornerShape(100))
                .background(AppTheme.BgColors.turquoise.copy(alpha = 0.24f)),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = context.getString(R.string.word3),
                color = AppTheme.BgColors.darkTurquoise,
                style = AppTheme.TextStyle.RegularMedium_10
            )
        }
    }
}


@Preview
@Composable
fun KeyWordsPreview() {

    Surface(
        color = AppTheme.BgColors.primary,
    ) {
        KeyWords()
    }
}
