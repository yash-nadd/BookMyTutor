package com.example.bookmytutor.ui.MyRequests

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyRequestViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Instructor Details :\n" +
                "Subject: \n" +
                "Teaches which subjects. Different subjects may have different prices.\n" +
                "Location: Teaches Online/Offline\n" +
                "Work hours\n" +
                "WeekdayM\n" +
                "Monday\n" +
                "Timmings :11 AM-6:30 PM\n" +
                "Times are shown in your local timezone (UTC+05:30) Asia/Kolkata\n" +
                "Pricing\n" +
                "Ex : 60 minutes ₹100"
    }
    val text: LiveData<String> = _text
}