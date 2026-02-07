package com.example.lib.opg01

class Employee (
    val firstName: String,
    val lastName: String,
    var monthlySalary: Double
) {
    init {
        if (monthlySalary <= 0.0) {
            monthlySalary = 0.0
        }
    }

    fun getYearlySalary(): Double {
        return monthlySalary * 12
    }



}