package com.example.android_app

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.android_app.ui.theme.AppTheme

@Composable
fun DotaScreenHeader() {

    val context = LocalContext.current

    Box(modifier = Modifier.fillMaxWidth()) {
        Image(
            painter = painterResource(R.drawable.bg_header),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(1f),
            alignment = Alignment.TopCenter

        )

        Row(Modifier.padding(start = 24.dp, top = 360.dp)) {

            Box(
                modifier = Modifier
                    .width(88.dp)
                    .height(88.dp)
                    .background(color = Color.Black, shape = RoundedCornerShape(13.5.dp))
                    .border(
                        width = 2.dp,
                        color = AppTheme.BgColors.darkGray_1,
                        shape = RoundedCornerShape(13.5.dp)
                    )

            ) {
                Image(
                    painter = painterResource(R.drawable.dota_logo),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(17.dp)
                )
            }
            Spacer(modifier = Modifier.width(12.dp))

            Box(Modifier.padding(top = 34.dp)) {
                Column {
                    Text(
                        text = context.getString(R.string.name_game),
                        style = AppTheme.TextStyle.Bold_20,
                        color = Color.White
                    )

                    Row(verticalAlignment = Alignment.CenterVertically) {
                        repeat(5) {
                            Image(
                                painter = painterResource(R.drawable.star),
                                contentDescription = null,
                                modifier = Modifier
                                    .padding(end = 4.dp)
                                    .width(12.dp)
                                    .height(12.dp)
                            )
                        }
                        Spacer(modifier = Modifier.width(10.dp))

                        Text(
                            text = context.getString(R.string.usage_level),
                            style = AppTheme.TextStyle.Regular_12,
                            color = AppTheme.TextColors.gray,
                            modifier = Modifier.padding(top = 10.dp, bottom = 12.dp)
                        )
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun DotaScreenPreview() {

    Surface(
        color = AppTheme.BgColors.primary,
    ) {
        DotaScreenHeader()
    }
}
