package com.example.lib.opg02

import com.example.lib.opg02.Computer
import com.example.lib.opg02.Laptop
import com.example.lib.opg02.Smartphone

fun main(){

    val computer = Computer("Apple", 1.8, "Silver")

    computer.turnOn()
    computer.getSpecs()


    val laptop = Laptop("HP", 2.4, "Black", false)

    laptop.openLaptop()
    laptop.getSpecs()

    val smartphone = Smartphone("Apple", 0.3, "Gold", 6.7)
    smartphone.sendMessage()
}