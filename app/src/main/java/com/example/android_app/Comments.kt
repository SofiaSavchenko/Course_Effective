package com.example.android_app

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

@Composable
fun Comments(){

    val context = LocalContext.current
    val commentsList = mutableListOf<CommentUi>()

    commentsList.add(
        CommentUi(
            image = R.drawable.avatar_1,
            author = context.getString(R.string.avatar1_name),
            date = context.getString(R.string.avatar1_date),
            text = context.getString(R.string.avatar1_text)
        )
    )

    commentsList.add(
        CommentUi(
            image = R.drawable.avatar_2,
            author = context.getString(R.string.avatar2_name),
            date = context.getString(R.string.avatar2_date),
            text = context.getString(R.string.avatar2_text)
        )
    )

    CommentUiList(commentsList)
}
