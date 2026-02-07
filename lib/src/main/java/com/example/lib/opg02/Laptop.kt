package com.example.lib.opg02

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