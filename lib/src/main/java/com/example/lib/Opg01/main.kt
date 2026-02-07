package com.example.lib.opg01

import com.example.lib.opg01.Employee


fun main(){
    // // Opretter to Employee-objekter med fornavn, efternavn og månedsløn
    val employeeOne = Employee(firstName = "Adam", lastName = "Sørensen", monthlySalary = 30000.0)
    val employeeTwo = Employee(firstName = "Søren", lastName = "Nielsen", monthlySalary = 35000.0)

    // Printer årsløn for employeeOne før lønforhøjelse
    println("Employee one´s yearly salary before raise")
    println("${employeeOne.firstName} ${employeeOne.lastName}:")
    println(employeeOne.getYearlySalary())

    // Giver employeeOne en lønforhøjelse på 10 %
    println("Employee one´s yearly salary after raise ")
    employeeOne.monthlySalary *= 1.10

    // Printer årsløn for employeeOne efter lønforhøjelse
    println(employeeOne.getYearlySalary())

    // Printer årsløn for employeeTwo før lønforhøjelse
    println("Employee two´s yearly salary before raise")
    println("${employeeTwo.firstName} ${employeeTwo.lastName}:")
    println(employeeTwo.getYearlySalary())

    // Giver employeeTwo en lønforhøjelse på 10 %
    println("Employee two's yearly salary after raise ")
    employeeTwo.monthlySalary *= 1.10

    // Printer årsløn for employeeTwo efter lønforhøjelse
    println(employeeTwo.getYearlySalary())
}
