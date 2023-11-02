package com.example.android_app

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun DotaScreen(){

    val lazyListState = rememberLazyListState()

    LazyColumn(state = lazyListState,
            modifier = Modifier.fillMaxSize(),
            content = {

        item { DotaScreenHeader() }
        item { KeyWords() }
        item { DescriptionGame() }
        item { ScenesGame() }
        item { ReviewRating() }
        item { Comments()}
        item { InstallButton() }

    })
}