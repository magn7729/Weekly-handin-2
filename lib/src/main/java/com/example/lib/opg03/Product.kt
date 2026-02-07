package com.example.lib.opg03

// Parent class som repræsenterer et generelt produkt
open class Product(
    val name: String,
    var price: Double,
    val quantity: Int
) {
    open fun identifyProductCategory(){    // Metode der kan overrides af child classes
                                           // (fordi vi skriver "open" foran funktionen)
println("I am a product")
    }
}