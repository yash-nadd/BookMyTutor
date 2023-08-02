package com.example.bookmytutor.ui.Logout

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.bookmytutor.R

class LogoutFragment : Fragment() {

    private lateinit var logoutButton: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_logout, container, false)

        logoutButton = root.findViewById(R.id.logoutButton)

        logoutButton.setOnClickListener {
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
