package com.uzb7.tenglamalarsistemasiniyechish

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.uzb7.tenglamalarsistemasiniyechish.databinding.FragmentTortBinding
import com.uzb7.tenglamalarsistemasiniyechish.utils.viewBinding


class TortFragment : Fragment(R.layout.fragment_tort) {
    private val binding by viewBinding { FragmentTortBinding.bind(it) }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    private fun initViews() {
        binding.apply {
            ivBack.setOnClickListener{
                findNavController().navigate(R.id.action_tortFragment_to_homeFragment)
            }

            btnHisobash.setOnClickListener {
                var a = oraliq1.text.toString().toDouble()
                var b = oraliq2.text.toString().toDouble()
                var x: Double
                if (hisobla(a) * hisobla(b) < 0) {
                    while (true) {

                        x = (a + b) / 2
                        if (hisobla(a) * hisobla(x) < 0) {
                            b = x
                        } else if (hisobla(a) * hisobla(x) > 0) {
                            a = x
                        } else {
                            if (hisobla(a) == 0.0) {
                                tvNatija.text = a.toString()
                            } else if (hisobla(x) == 0.0) {
                                tvNatija.text = x.toString()
                            }
                            break
                        }

                    }
                }
            }
        }

    }

    private fun hisobla(x: Double): Double {
        binding.apply {
            val a = et1Had.text.toString().toDouble()
            val b = et2Had.text.toString().toDouble()
            val c = et3Had.text.toString().toDouble()
            val d = et4Had.text.toString().toDouble()
            val e = et5Had.text.toString().toDouble()

            return a * x * x * x * x + b * x * x * x + c * x * x + d * x + e
        }

    }
}