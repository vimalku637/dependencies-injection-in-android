package com.example.dependencyinjectionandroid.repository

import com.example.dependencyinjectionandroid.data.User
import javax.inject.Inject

class UserRepository @Inject constructor() {
    fun getUsers(): List<User> {
        return listOf(
            User(1, "Vimal"),
            User(2, "Karan"),
            User(3, "Pooja")
        )
    }
}