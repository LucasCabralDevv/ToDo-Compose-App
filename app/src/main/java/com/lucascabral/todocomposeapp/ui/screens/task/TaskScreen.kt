package com.lucascabral.todocomposeapp.ui.screens.task

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import com.lucascabral.todocomposeapp.util.Action

@Composable
fun TaskScreen(
    navigateToListScreen: (Action) -> Unit
) {
    
    Scaffold(
        topBar = {
            TaskAppBar(navigateToListScreen = navigateToListScreen)
        },
        content = {}
    )
}