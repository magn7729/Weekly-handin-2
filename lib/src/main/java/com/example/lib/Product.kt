package com.example.lib

open class Product(
    val name: String,
    var price: Double,
    val quantity: Int
) {
    open fun identifyProductCategory(){
println("I am a product")
    }
}