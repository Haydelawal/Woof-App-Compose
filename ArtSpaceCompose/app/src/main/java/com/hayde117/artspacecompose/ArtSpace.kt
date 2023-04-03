package com.hayde117.artspacecompose

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class ArtSpace(
    @DrawableRes val image: Int,
    val artTitle: String,
    val artist: String,
)
