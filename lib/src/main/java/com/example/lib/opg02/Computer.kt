package com.example.lib.opg02

// Parent class som repræsenterer en generel computer
open class Computer (
    val brand: String,
    val weight: Double,
    val color: String
){
    // Printer computerens specifikationer
    fun getSpecs(){
        println("Brand: $brand")
        println("Weight: $weight")
        println("Color: $color")
    }

    // Simpel metode der simulerer, at computeren tændes
    fun turnOn(){
println("Loading computer information")
    }
}