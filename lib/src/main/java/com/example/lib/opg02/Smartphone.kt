package com.example.lib.opg02

// Smartphone-klassen arver fra Computer og tilføjer ekstra funktionalitet
class Smartphone(
    brand: String,
    weight: Double,
    color: String,
    val screenSize: Double  // Ekstra property, specifik for Smartphone
) : Computer(brand, weight, color) {

    fun sendMessage() {             // Smartphone-specifik metode
        println("Sending a message from the smartphone")
    }
}