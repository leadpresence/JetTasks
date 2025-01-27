package com.bhavnathacker.jettasks.ui.model

import com.bhavnathacker.jettasks.UserPreferences.SortOrder
import com.bhavnathacker.jettasks.data.model.Task

data class TasksUiModel(
    val tasks: List<Task>,
    val showCompleted: Boolean,
    val sortOrder: SortOrder
)
