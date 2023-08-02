package com.example.bookmytutor.ui.myaccount

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.example.bookmytutor.R

class AddResumeActivity : AppCompatActivity() {

    // ActivityResultLauncher to handle file picker result
    private lateinit var filePickerLauncher: ActivityResultLauncher<Array<String>>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_resume)

        // Set up the file picker launcher
        filePickerLauncher =
            registerForActivityResult(ActivityResultContracts.OpenDocument()) { uri: Uri? ->
                // Process the selected file
                if (uri != null) {
                    val fileName = uri.lastPathSegment
                    val fileSize = getFileSize(uri)
                    // Update the UI with the selected file details
                    updateFileInfo(fileName, fileSize)
                }
            }

        // Set click listener for the Upload button
        val uploadButton = findViewById<Button>(R.id.button_upload)
        uploadButton.setOnClickListener {
            // Launch the file picker to allow the user to select a file
            filePickerLauncher.launch(arrayOf("*/*"))
        }
    }

    // Helper method to get the file size from the Uri
    private fun getFileSize(uri: Uri): String {
        // Add code to get the file size from the Uri
        // For simplicity, we'll just return a placeholder value here
        return "2.5 MB"
    }

    // Helper method to update the UI with the selected file details
    private fun updateFileInfo(fileName: String?, fileSize: String?) {
        findViewById<TextView>(R.id.textView_fileName)?.text = fileName
        findViewById<TextView>(R.id.textView_fileSize)?.text = "Size: $fileSize"
    }
}
