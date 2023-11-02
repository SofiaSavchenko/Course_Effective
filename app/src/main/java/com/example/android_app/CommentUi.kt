package com.example.android_app

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android_app.ui.theme.AppTheme

data class CommentUi(val author: String, val image: Int, val date: String, val text: String)

@Composable
fun CommentUi(commentUi: CommentUi) {

    Column(Modifier.padding(start = 24.dp, top = 30.dp)) {
        Row {
            val image = painterResource(commentUi.image)
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .size(36.dp)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.width(16.dp))

            Column {
                Text(
                    text = commentUi.author,
                    color = AppTheme.TextColors.lightWhite,
                    letterSpacing = 0.5.sp,
                    style = AppTheme.TextStyle.Regular_12
                )
                Spacer(modifier = Modifier.height(7.dp))

                Text(
                    text = commentUi.date,
                    color = Color.White.copy(0.4f),
                    letterSpacing = 0.5.sp,
                    style = AppTheme.TextStyle.Regular_12
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            commentUi.text,
            modifier = Modifier
                .padding(end = 24.dp),
            color = AppTheme.TextColors.darkWhite,
            letterSpacing = 0.5.sp,
            style = AppTheme.TextStyle.Regular_12
        )

    }

}

@Composable
fun CommentUiList(comments: List<CommentUi>) {
    for ((index, comment) in comments.withIndex()) {

        CommentUi(comment)

        if (index != comments.size - 1) {
            Spacer(modifier = Modifier.height(24.dp))
            Divider(
                color = AppTheme.BgColors.darkGray,
                thickness = 1.dp,
                modifier = Modifier
                    .padding(horizontal = 38.dp)
                    .height(1.dp)
            )
        }
    }
}


@Preview
@Composable
fun CommentUiPreview() {

    val context = LocalContext.current

    val commentUiList = listOf(
        CommentUi(
            image = R.drawable.avatar_1,
            author = context.getString(R.string.avatar1_name),
            date = context.getString(R.string.avatar1_date),
            text = context.getString(R.string.avatar1_text)
        )
    )
    Surface(
        color = AppTheme.BgColors.primary,
    ) {
        CommentUiList(commentUiList)
    }

}