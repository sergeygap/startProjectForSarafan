package com.sergey_gap.startprojectforsarafan.ui.splash

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sergey_gap.startprojectforsarafan.R
import com.sergey_gap.startprojectforsarafan.databinding.FragmentMainBinding
import com.sergey_gap.startprojectforsarafan.databinding.FragmentSplashBinding


class SplashFragment : Fragment() {


    private lateinit var binding: FragmentSplashBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSplashBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

}