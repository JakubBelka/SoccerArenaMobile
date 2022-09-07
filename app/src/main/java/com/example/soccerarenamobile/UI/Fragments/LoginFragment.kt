package com.example.soccerarenamobile.UI.Fragments

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.navigation.fragment.findNavController
import com.example.soccerarenamobile.R
import com.example.soccerarenamobile.databinding.FragmentLoginBinding
import com.google.android.material.snackbar.Snackbar

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class LoginFragment : Fragment() {

    private var _binding: FragmentLoginBinding?= null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root

    }

    @SuppressLint("ResourceType")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.logoImageview.startAnimation(AnimationUtils.loadAnimation(this.context, R.anim.animation_fade_in))
//        binding.sloganTextview.startAnimation(AnimationUtils.loadAnimation(this.context, R.drawable.animation_bounce))
        binding.loginButton.startAnimation(AnimationUtils.loadAnimation(this.context, R.anim.animation_bounce))

        binding.createAccountTextview.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }

        binding.loginButton.setOnClickListener{
            Snackbar.make(view, "LOGIN", Snackbar.LENGTH_LONG).show();
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}