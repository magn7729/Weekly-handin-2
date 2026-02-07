package com.example.lib

open class Computer (
    val brand: String,
    val weight: Double,
    val color: String
){
    fun getSpecs(){
        println("Brand: $brand")
        println("Weight: $weight")
        println("Color: $color")
    }

    fun turnOn(){
println("Loading computer information")
    }
}