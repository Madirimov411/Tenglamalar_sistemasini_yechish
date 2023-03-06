package com.uzb7.tenglamalarsistemasiniyechish

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.uzb7.tenglamalarsistemasiniyechish.databinding.FragmentHomeBinding
import com.uzb7.tenglamalarsistemasiniyechish.utils.viewBinding


class HomeFragment : Fragment(R.layout.fragment_home) {

    private val binding by viewBinding { FragmentHomeBinding.bind(it) }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    private fun initViews() {
        binding.apply {
            btnIkki.setOnClickListener {
                findNavController().navigate(R.id.action_homeFragment_to_ikkiFragment2)
            }
            btnUch.setOnClickListener {
                findNavController().navigate(R.id.action_homeFragment_to_uchFragment)
            }
            btnTort.setOnClickListener {
                findNavController().navigate(R.id.action_homeFragment_to_tortFragment)
            }
        }
    }

}