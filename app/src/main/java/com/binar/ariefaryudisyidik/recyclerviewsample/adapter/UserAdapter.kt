package com.binar.ariefaryudisyidik.recyclerviewsample.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.binar.ariefaryudisyidik.recyclerviewsample.data.User
import com.binar.ariefaryudisyidik.recyclerviewsample.databinding.ItemUserBinding
import com.binar.ariefaryudisyidik.recyclerviewsample.ui.HomeFragmentDirections

class UserAdapter(private val user: List<User>) :
    RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    class UserViewHolder(var binding: ItemUserBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val binding = ItemUserBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return UserViewHolder(binding)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.binding.usernameTextView.text = user[position].username
        holder.binding.phoneNumberTextView.text = user[position].phoneNumber.toString()
        holder.itemView.setOnClickListener {
            val username = user[position].username.toString()
            val phoneNumber = user[position].phoneNumber.toString()
            val toDetailFragment =
                HomeFragmentDirections.actionHomeFragmentToDetailFragment(username, phoneNumber)
            it.findNavController().navigate(toDetailFragment)
        }
    }

    override fun getItemCount() = user.size
}