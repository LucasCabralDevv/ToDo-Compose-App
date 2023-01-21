package com.lucascabral.todocomposeapp.navigation.animation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally

@OptIn(ExperimentalAnimationApi::class)
fun enterTransitionAnimation() =
    slideInHorizontally(
        initialOffsetX = { it },
        animationSpec = tween(350)
    )


@OptIn(ExperimentalAnimationApi::class)
fun exitTransitionAnimation() =
    slideOutHorizontally(
        targetOffsetX = { it },
        animationSpec = tween(350)
    )