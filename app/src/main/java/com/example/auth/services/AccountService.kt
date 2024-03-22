package com.example.auth.services

import com.google.firebase.Firebase
import com.google.firebase.auth.auth

class AccountService {
    fun authenticate(email: String, password: String, onSuccess: () -> Unit, onFailure: () -> Unit) {
        Firebase.auth.createUserWithEmailAndPassword(email, password)
            .addOnSuccessListener {
                onSuccess()
            }
            .addOnFailureListener {
                onFailure()
            }
    }

    fun login(email: String, password: String, onResult: () -> Unit) {
        Firebase.auth.signInWithEmailAndPassword(email, password)
            .addOnSuccessListener {
                /*TODO*/
            }
    }
}