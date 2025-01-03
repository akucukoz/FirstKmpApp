package com.example.firstkmpapp.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.firstkmpapp.data.Contact
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class ContactListViewModel : ViewModel() {

    private val _state = MutableStateFlow(ContactListState(
        contacts = contacts
    ))
    val state = _state.asStateFlow()

    var newContact: Contact? by mutableStateOf(null)
        private set

    fun onEvent(event: ContactListEvent) {}
}

private val contacts = (1..50).map { 
    Contact(
        it.toLong(),
        firstName = "First$it",
        lastName = "Last$it",
        email = "test@test$it.com",
        phoneNumber = "123456789",
        photoByte = null,
    )
}