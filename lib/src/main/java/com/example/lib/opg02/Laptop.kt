package com.example.lib.opg02

// Laptop-klassen arver fra Computer og tilføjer ekstra funktionalitet
class Laptop(
    brand: String,
    weight: Double,
    color: String,
    val foldable: Boolean // Ekstra property, specifik for Laptop
): Computer(brand, weight, color) {
    fun openLaptop(){            // Laptop-specifik metode
println("Welcome to my Laptop")
    }
}