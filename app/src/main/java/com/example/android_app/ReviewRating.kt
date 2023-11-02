package com.example.android_app

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android_app.ui.theme.AppTheme

@Composable
fun ReviewRating() {

    val context = LocalContext.current

    Column {
        Text(
            text = context.getString(R.string.reviewRating),
            color = AppTheme.TextColors.lightWhite,
            modifier = Modifier.padding(start = 24.dp, top = 24.dp),
            style = AppTheme.TextStyle.Bold_16
        )
        Spacer(modifier = Modifier.height(12.dp))
        Row(
            modifier = Modifier.padding(start = 24.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                text = context.getString(R.string.rating),
                color = Color.White,
                style = AppTheme.TextStyle.Bold_48
            )

            Column(Modifier.padding(start = 16.dp)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    repeat(4) {
                        Image(
                            painter = painterResource(R.drawable.star),
                            contentDescription = null,
                            modifier = Modifier
                                .padding(end = 4.dp)
                                .width(12.dp)
                                .height(12.dp)
                        )
                    }
                    Image(
                        painter = painterResource(R.drawable.half_star),
                        contentDescription = null,
                        modifier = Modifier
                            .padding(end = 4.dp)
                            .width(12.dp)
                            .height(12.dp)
                    )
                }
                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = context.getString(R.string.reviews),
                    color = AppTheme.TextColors.darkWhite,
                    style = AppTheme.TextStyle.Regular_12,
                    letterSpacing = 0.5.sp
                )
            }
        }
    }
}

@Preview
@Composable
fun ReviewRatingPreview() {

    Surface(
        color = AppTheme.BgColors.primary,
    ) {
        ReviewRating()
    }
}