package com.example.bookmytutor.ui.Logout2

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.bookmytutor.R

class LogoutFragment2 : Fragment() {

    private lateinit var logoutButton2: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_logout2, container, false)

        logoutButton2 = root.findViewById(R.id.logoutButton2)

        logoutButton2.setOnClickListener {
            showLogoutConfirmationDialog()
        }

        return root
    }

    private fun showLogoutConfirmationDialog() {
        val builder = AlertDialog.Builder(requireContext())
        builder.setTitle("Logout")
            .setMessage("Are you sure you want to logout?")
            .setPositiveButton("Logout") { dialog, which ->
                // Perform logout actions here if needed
                // For example, you can clear user session or preferences.

                // Close the app
                requireActivity().finishAffinity()
            }
            .setNegativeButton("Cancel") { dialog, which ->
                // User clicked the "Cancel" button, do nothing.
            }
            .show()
    }
}
