package com.lucascabral.todocomposeapp.navigation.destinations

import androidx.compose.material.ExperimentalMaterialApi
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import com.lucascabral.todocomposeapp.ui.screens.list.ListScreen
import com.lucascabral.todocomposeapp.ui.viewmodels.SharedViewModel
import com.lucascabral.todocomposeapp.util.Constants.LIST_ARGUMENT_KEY
import com.lucascabral.todocomposeapp.util.Constants.LIST_SCREEN

@ExperimentalMaterialApi
fun NavGraphBuilder.listComposable(
    navigateToTaskScreen: (taskId: Int) -> Unit,
    sharedViewModel: SharedViewModel
) {
    composable(
        route = LIST_SCREEN,
        arguments = listOf(navArgument(LIST_ARGUMENT_KEY){
            type = NavType.StringType
        })
    ) { navBackStackEntry ->


        ListScreen(
            navigateToTaskScreen = navigateToTaskScreen,
            sharedViewModel = sharedViewModel
        )
    }
}