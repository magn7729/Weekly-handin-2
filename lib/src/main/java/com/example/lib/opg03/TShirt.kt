package com.example.lib.opg03

// TShirt-klassen arver fra Product
class TShirt(
    name: String,
    price: Double,
    quantity: Int
) : Product(name, price, quantity) {

    override fun identifyProductCategory() {  // Overrider metoden for at give en produktspecifik besked
        println("I am a T-shirt")
    }
}