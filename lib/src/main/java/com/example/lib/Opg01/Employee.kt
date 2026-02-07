package com.example.lib.opg01

// Employee-class indeholder information om en medarbejder
class Employee (
    val firstName: String,
    val lastName: String,
    var monthlySalary: Double
) {
    // init-blokken kører, når et Employee-objekt oprettes
    // Den sikrer, at månedslønnen aldrig er negativ eller 0
    init {
        if (monthlySalary <= 0.0) {
            monthlySalary = 0.0
        }
    }

    // Beregner og returnerer medarbejderens årsløn
    fun getYearlySalary(): Double {
        return monthlySalary * 12
    }



}