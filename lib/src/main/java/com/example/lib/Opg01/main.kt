package com.example.lib.opg01

import com.example.lib.Opg01.Employee


fun main(){
    val employeeOne = Employee(firstName = "Adam", lastName = "Sørensen", monthlySalary = 30000.0)
    val employeeTwo = Employee(firstName = "Søren", lastName = "Nielsen", monthlySalary = 35000.0)

    println("Employee one´s yearly salary before raise")
    println("${employeeOne.firstName} ${employeeOne.lastName}:")
    println(employeeOne.getYearlySalary())

    println("Employee one´s yearly salary after raise ")
    employeeOne.monthlySalary *= 1.10

    println(employeeOne.getYearlySalary())

    println("Employee two´s yearly salary before raise")
    println("${employeeTwo.firstName} ${employeeTwo.lastName}:")
    println(employeeTwo.getYearlySalary())

    println("Employee two's yearly salary after raise ")
    employeeTwo.monthlySalary *= 1.10

    println(employeeTwo.getYearlySalary())
}
