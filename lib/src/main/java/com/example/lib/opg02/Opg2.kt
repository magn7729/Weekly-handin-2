package com.example.lib.opg02

import com.example.lib.opg02.Computer
import com.example.lib.opg02.Laptop
import com.example.lib.opg02.Smartphone

fun main(){
    // Opretter et Computer-objekt (parent class)
    val computer = Computer("Apple", 1.8, "Silver")

    // Kalder metoder fra Computer-klassen
    computer.turnOn()
    computer.getSpecs()

    // Opretter et Laptop-objekt (child class af Computer)
    val laptop = Laptop("HP", 2.4, "Black", false)

    // Kalder laptop-specifik metode og arvet metode fra Computer
    laptop.openLaptop()
    laptop.getSpecs()

    // Opretter et Smartphone-objekt (child class af Computer)
    val smartphone = Smartphone("Apple", 0.3, "Gold", 6.7)

    // Kalder smartphone-specifik metode
    smartphone.sendMessage()
}