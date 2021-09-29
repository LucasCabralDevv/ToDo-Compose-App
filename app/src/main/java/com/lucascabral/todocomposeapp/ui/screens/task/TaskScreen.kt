package com.lucascabral.todocomposeapp.ui.screens.task

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import com.lucascabral.todocomposeapp.data.models.Priority
import com.lucascabral.todocomposeapp.data.models.ToDoTask
import com.lucascabral.todocomposeapp.ui.viewmodels.SharedViewModel
import com.lucascabral.todocomposeapp.util.Action

@Composable
fun TaskScreen(
    selectedTask: ToDoTask?,
    sharedViewModel: SharedViewModel,
    navigateToListScreen: (Action) -> Unit
) {
    val title: String by sharedViewModel.title
    val description: String by sharedViewModel.description
    val priority: Priority by sharedViewModel.priority

    Scaffold(
        topBar = {
            TaskAppBar(
                selectedTask = selectedTask,
                navigateToListScreen = navigateToListScreen
            )
        },
        content = {
            TaskContent(
                title = title,
                onTitleChange = { title ->
                    sharedViewModel.title.value = title
                },
                description = description,
                onDescriptionChange = { description ->
                    sharedViewModel.description.value = description
                },
                priority = priority,
                onPrioritySelected = { priority ->
                    sharedViewModel.priority.value = priority
                }
            )
        }
    )
}