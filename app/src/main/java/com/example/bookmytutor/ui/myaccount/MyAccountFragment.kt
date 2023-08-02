package com.example.bookmytutor.ui.myaccount

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.bookmytutor.R
import com.example.bookmytutor.databinding.FragmentMyaccountBinding

class MyAccountFragment : Fragment() {

    private var _binding: FragmentMyaccountBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMyaccountBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Profile Picture (Replace the placeholder with actual image)
        binding.imageViewProfilePicture.setImageResource(R.drawable.default_profile_picture)

        // Full Name
        binding.textViewFullName.text = "John Doe"

        // Email Address
        binding.textViewEmail.text = "john.doe@example.com"

        // About Me
        binding.textViewAboutMe.text = "Hello, I'm John Doe. I love Android development!"

        // Address
        binding.textViewAddress.text = "123 Main Street, City, Country"

        // Edit Profile Button
        val editProfileButton: Button = binding.buttonEditProfile
        editProfileButton.setOnClickListener {
            // Handle the click event for "Edit Profile" button here
            // For example, navigate to the profile editing screen
        }

        // Add Resume Button
        val addResumeButton: Button = binding.buttonAddResume
        addResumeButton.setOnClickListener {
            // Handle the click event for "Add Resume" button here
            // Start the AddResumeActivity
            val intent = Intent(activity, AddResumeActivity::class.java)
            startActivity(intent)
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
