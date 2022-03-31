package com.binar.ariefaryudisyidik.recyclerviewsample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.binar.ariefaryudisyidik.recyclerviewsample.data.User

class UserAdapter(private val user: List<User>) :
    RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    class UserViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val userNameTextView: TextView = view.findViewById(R.id.username_text_view)
        val phoneNumberTextView: TextView = view.findViewById(R.id.phone_number_text_view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.userNameTextView.text = user[position].username
        holder.phoneNumberTextView.text = user[position].phoneNumber.toString()
        holder.itemView.setOnClickListener {
            val username = user[position].username.toString()
            val phoneNumber = user[position].phoneNumber.toString()
            val toDetailFragment =
                HomeFragmentDirections.actionHomeFragmentToDetailFragment(username, phoneNumber)
            it.findNavController().navigate(toDetailFragment)
        }
    }

    override fun getItemCount(): Int {
        return user.size
    }
}