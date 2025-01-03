package com.example.firstkmpapp.ui

import com.example.firstkmpapp.data.Contact

sealed interface ContactListEvent {
    data object OnAddNewContactClick : ContactListEvent
    data object DismissContact : ContactListEvent
    data class OnFirstNameChanged(val value: String) : ContactListEvent
    data class OnLastNameChanged(val value: String) : ContactListEvent
    data class OnEmailChanged(val value: String) : ContactListEvent
    data class OnPhoneNumberChanged(val value: String) : ContactListEvent
    class OnPhotoPicked(val bytes: ByteArray) : ContactListEvent
    data object OnAddPhotoClicked : ContactListEvent
    data object OnSaveObject : ContactListEvent
    data class SelectContact(val contact: Contact) : ContactListEvent
    data class EditContact(val contact: Contact) : ContactListEvent
    data object DeleteContact : ContactListEvent
}