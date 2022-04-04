package com.binar.ariefaryudisyidik.recyclerviewsample.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.binar.ariefaryudisyidik.recyclerviewsample.adapter.UserAdapter
import com.binar.ariefaryudisyidik.recyclerviewsample.data.User
import com.binar.ariefaryudisyidik.recyclerviewsample.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var _binding: FragmentHomeBinding
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val userList = listOf(
            User(
                "Arief Aryudi Syidik",
                +628131313
            ), User(
                "Fazri Chairul Hafidz",
                +628212121
            ), User(
                "Rangga Setiaji",
                +628969696
            )
        )

        val userAdapter = UserAdapter(userList)
        val layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        binding.userRecyclerView.layoutManager = layoutManager
        binding.userRecyclerView.adapter = userAdapter
    }

}