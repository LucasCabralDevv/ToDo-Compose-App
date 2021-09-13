package com.lucascabral.todocomposeapp.data.models

import androidx.compose.ui.graphics.Color
import com.lucascabral.todocomposeapp.ui.theme.HighPriorityColor
import com.lucascabral.todocomposeapp.ui.theme.LowPriorityColor
import com.lucascabral.todocomposeapp.ui.theme.MediumPriorityColor
import com.lucascabral.todocomposeapp.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}