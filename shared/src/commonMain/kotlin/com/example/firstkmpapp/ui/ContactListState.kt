package com.example.firstkmpapp.ui

import com.example.firstkmpapp.data.Contact

data class ContactListState(
    val contacts: List<Contact> = emptyList(),
    val recentlyAdded: List<Contact> = emptyList(),
    val selectedContact: Contact? = null,
    val isAddContactSheetOpen: Boolean = false,
    val isSelectedContactSheetOpen: Boolean = false,
    val firstNameError: String? = null,
    val lastNameError: String? = null,
    val emailError: String? = null,
    val phoneNumberError: String? = null,
)