package com.binar.ariefaryudisyidik.recyclerviewsample.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.binar.ariefaryudisyidik.recyclerviewsample.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {

    private lateinit var _binding: FragmentDetailBinding
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val dataUsername =
            DetailFragmentArgs.fromBundle(
                arguments as Bundle
            ).username
        val dataPhoneNumber =
            DetailFragmentArgs.fromBundle(
                arguments as Bundle
            ).phoneNumber

        binding.tvDetail.text = """
            Username: $dataUsername
            Phone Number: $dataPhoneNumber
        """.trimIndent()

    }
}