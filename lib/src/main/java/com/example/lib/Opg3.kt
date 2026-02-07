package com.example.lib

    fun main() {

        val shoe = Shoe("Sneakers", 899.0, 10)
        val tshirt = TShirt("Basic Tee", 199.0, 25)
        val book = Book("Kotlin Basics", 349.0, 5)

        shoe.identifyProductCategory()
        tshirt.identifyProductCategory()
        book.identifyProductCategory()
    }
