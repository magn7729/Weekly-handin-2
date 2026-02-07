package com.example.lib.opg03

import com.example.lib.opg03.Book
import com.example.lib.opg03.Shoe
import com.example.lib.opg03.TShirt

fun main() {

    // Opretter tre forskellige produkter, som alle er child classes af  klasssen Product
        val shoe = Shoe("Sneakers", 899.0, 10)
        val tshirt = TShirt("Basic Tee", 199.0, 25)
        val book = Book("Kotlin Basics", 349.0, 5)

    // Kalder den overridede metode på hvert objekt
    // Metoden har samme navn, men forskellig implementering (polymorphism)
        shoe.identifyProductCategory()
        tshirt.identifyProductCategory()
        book.identifyProductCategory()
    }
