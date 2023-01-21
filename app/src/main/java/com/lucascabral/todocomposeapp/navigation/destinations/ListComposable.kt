package com.lucascabral.todocomposeapp.navigation.destinations

import android.content.Context
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import com.google.accompanist.navigation.animation.composable
import androidx.navigation.compose.navArgument
import com.lucascabral.todocomposeapp.ui.screens.list.ListScreen
import com.lucascabral.todocomposeapp.ui.viewmodels.SharedViewModel
import com.lucascabral.todocomposeapp.util.Constants.LIST_ARGUMENT_KEY
import com.lucascabral.todocomposeapp.util.Constants.LIST_SCREEN
import com.lucascabral.todocomposeapp.util.toAction

@ExperimentalAnimationApi
@ExperimentalMaterialApi
fun NavGraphBuilder.listComposable(
    navigateToTaskScreen: (taskId: Int) -> Unit,
    context: Context,
    sharedViewModel: SharedViewModel
) {
    composable(
        route = LIST_SCREEN,
        arguments = listOf(navArgument(LIST_ARGUMENT_KEY){
            type = NavType.StringType
        })
    ) { navBackStackEntry ->

        val action = navBackStackEntry.arguments?.getString(LIST_ARGUMENT_KEY).toAction()
        
        LaunchedEffect(key1 = action) {
            sharedViewModel.action.value = action
        }

        ListScreen(
            navigateToTaskScreen = navigateToTaskScreen,
            context = context,
            sharedViewModel = sharedViewModel
        )
    }
}