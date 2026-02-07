package com.example.lib.opg03

import com.example.lib.opg03.Book
import com.example.lib.opg03.Shoe
import com.example.lib.opg03.TShirt

fun main() {

        val shoe = Shoe("Sneakers", 899.0, 10)
        val tshirt = TShirt("Basic Tee", 199.0, 25)
        val book = Book("Kotlin Basics", 349.0, 5)

        shoe.identifyProductCategory()
        tshirt.identifyProductCategory()
        book.identifyProductCategory()
    }
