package com.example.lib.opg02

class Smartphone(
    brand: String,
    weight: Double,
    color: String,
    val screenSize: Double
) : Computer(brand, weight, color) {

    fun sendMessage() {
        println("Sending a message from the smartphone")
    }
}