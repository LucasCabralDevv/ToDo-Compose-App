package com.lucascabral.todocomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.navigation.NavHostController
import com.google.accompanist.navigation.animation.rememberAnimatedNavController
import com.lucascabral.todocomposeapp.navigation.SetupNavigation
import com.lucascabral.todocomposeapp.ui.theme.ToDoComposeAppTheme
import com.lucascabral.todocomposeapp.ui.viewmodels.SharedViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
@ExperimentalAnimationApi
@ExperimentalMaterialApi
class MainActivity : ComponentActivity() {

    private lateinit var navController: NavHostController
    private val sharedViewModel: SharedViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ToDoComposeAppTheme {
                navController = rememberAnimatedNavController()
                SetupNavigation(
                    navController = navController,
                    context = this,
                    sharedViewModel = sharedViewModel
                )
            }
        }
    }
}