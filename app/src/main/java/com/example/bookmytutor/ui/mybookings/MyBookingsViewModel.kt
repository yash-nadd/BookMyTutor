package com.example.bookmytutor.ui.mybookings

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyBookingsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Class : \tClass XI\n" +
                "Subject :\t" +
                "Physics\n" +
                "Area\t" +
                "Sahibabad, Rajendra Nagar, Ghaziabad, Uttar Pradesh, India\n" +
                "Posted on\t30-07-2023 21:17:20\n" +
                "Contact No:\t8130XXXXXX"
    }
    val text: LiveData<String> = _text
}