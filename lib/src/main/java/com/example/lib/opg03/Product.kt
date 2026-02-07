package com.example.lib.opg03

open class Product(
    val name: String,
    var price: Double,
    val quantity: Int
) {
    open fun identifyProductCategory(){
println("I am a product")
    }
}