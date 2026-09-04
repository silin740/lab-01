package com.example.petshop

abstract class Mood(val date: String) {
    abstract fun getMood(): String

    fun getDescription(): String {
        return "Mood recorded on $date: ${getMood()}"
    }
}