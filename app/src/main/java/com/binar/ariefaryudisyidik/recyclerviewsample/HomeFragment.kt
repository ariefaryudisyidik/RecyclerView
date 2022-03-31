package com.binar.ariefaryudisyidik.recyclerviewsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.binar.ariefaryudisyidik.recyclerviewsample.data.User

class HomeFragment : Fragment() {
    private lateinit var userRecyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        userRecyclerView = view.findViewById(R.id.user_recycler_view)

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
        userRecyclerView.layoutManager = layoutManager
        userRecyclerView.adapter = userAdapter
    }

}