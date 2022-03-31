package com.binar.ariefaryudisyidik.recyclerviewsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class DetailFragment : Fragment() {
    lateinit var tvDetail: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tvDetail = view.findViewById(R.id.tv_detail)

        val dataUsername = DetailFragmentArgs.fromBundle(arguments as Bundle).username
        val dataPhoneNumber = DetailFragmentArgs.fromBundle(arguments as Bundle).phoneNumber

        tvDetail.text = """
            Username: $dataUsername
            Phone Number: $dataPhoneNumber
        """.trimIndent()

    }
}