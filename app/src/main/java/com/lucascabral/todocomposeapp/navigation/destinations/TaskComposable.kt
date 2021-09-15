package com.lucascabral.todocomposeapp.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import com.lucascabral.todocomposeapp.util.Action
import com.lucascabral.todocomposeapp.util.Constants.TASK_ARGUMENT_KEY
import com.lucascabral.todocomposeapp.util.Constants.TASK_SCREEN

fun NavGraphBuilder.taskComposable(
    navigateToListScreen: (Action) -> Unit
) {
    composable(
        route = TASK_SCREEN,
        arguments = listOf(navArgument(TASK_ARGUMENT_KEY){
            type = NavType.IntType
        })
    ) {

    }
}