package com.example.lib

class TShirt(
    name: String,
    price: Double,
    quantity: Int
) : Product(name, price, quantity) {

    override fun identifyProductCategory() {
        println("I am a T-shirt")
    }
}