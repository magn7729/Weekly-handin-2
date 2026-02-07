package com.example.lib.opg03

// Book-klassen arver fra Product
class Book(
    name: String,
    price: Double,
    quantity: Int
) : Product(name, price, quantity) {

    override fun identifyProductCategory() {  // Overrider metoden for at give en produktspecifik besked
        println("I am a book")
    }
}