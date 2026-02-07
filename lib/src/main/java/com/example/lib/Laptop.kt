package com.example.lib

class Laptop(
    brand: String,
    weight: Double,
    color: String,
    val foldable: Boolean
): Computer(brand, weight, color) {
    fun openLaptop(){
println("Welcome to my Laptop")
    }
}