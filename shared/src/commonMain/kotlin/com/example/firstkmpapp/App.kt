package com.example.firstkmpapp

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.firstkmpapp.core.ContactTheme
import com.example.firstkmpapp.ui.ContactListScreen
import com.example.firstkmpapp.ui.ContactListViewModel

@Composable
fun App(modifier: Modifier = Modifier) {
    ContactTheme {
        val viewModel = viewModel { ContactListViewModel() }
        val state by viewModel.state.collectAsState()

        Surface(
            modifier = modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            ContactListScreen(
                state = state,
                newContact = viewModel.newContact,
                onEvent = viewModel::onEvent
            )
        }
    }
}