// JUNIOR LØSNING START

/*
package com.example.lib

import kotlin.math.PI
import kotlin.math.sqrt

abstract class Shape(
    val color: String,
    val isTransparent: Boolean
) {
    abstract fun calculatePerimeter(): Double
    abstract fun calculateArea(): Double
}

class Circle(
    private val radius: Double,
    color: String,
    isTransparent: Boolean
) : Shape(color, isTransparent) {

    override fun calculatePerimeter(): Double {
        return 2 * PI * radius
    }

    override fun calculateArea(): Double {
        return PI * radius * radius
    }
}

class Triangle(
    private val sideA: Double,
    private val sideB: Double,
    private val sideC: Double,
    color: String,
    isTransparent: Boolean
) : Shape(color, isTransparent) {

    override fun calculatePerimeter(): Double {
        return sideA + sideB + sideC
    }

    override fun calculateArea(): Double {
        val s = calculatePerimeter() / 2
        return sqrt(s * (s - sideA) * (s - sideB) * (s - sideC))
    }
}

fun main() {
    val circle = Circle(radius = 5.0, color = "Red", isTransparent = false)
    val triangle = Triangle(sideA = 3.0, sideB = 4.0, sideC = 5.0, color = "Blue", isTransparent = true)

    println("Circle | color=${circle.color}, transparent=${circle.isTransparent}")
    println("Perimeter: ${circle.calculatePerimeter()}")
    println("Area: ${circle.calculateArea()}")

    println()

    println("Triangle | color=${triangle.color}, transparent=${triangle.isTransparent}")
    println("Perimeter: ${triangle.calculatePerimeter()}")
    println("Area: ${triangle.calculateArea()}")
}

 */
// JUNIOR LØSNING SLUT


       // --- //

// SENIOR LØSNING START
/*
package com.example.lib

import kotlin.math.PI
import kotlin.math.sqrt

abstract class Shape(
    val color: String,
    val isTransparent: Boolean
) {
    init {
        require(color.isNotBlank()) { "Color must not be blank" }
    }

    abstract fun calculatePerimeter(): Double
    abstract fun calculateArea(): Double
}

class Circle(
    private val radius: Double,
    color: String,
    isTransparent: Boolean
) : Shape(color, isTransparent) {

    init {
        require(radius > 0) { "Radius must be positive" }
    }

    override fun calculatePerimeter(): Double = 2 * PI * radius

    override fun calculateArea(): Double = PI * radius * radius
}

class Triangle(
    private val a: Double,
    private val b: Double,
    private val c: Double,
    color: String,
    isTransparent: Boolean
) : Shape(color, isTransparent) {

    init {
        require(a > 0 && b > 0 && c > 0) { "Triangle sides must be positive" }
        require(a + b > c && a + c > b && b + c > a) { "Invalid triangle sides (triangle inequality failed)" }
    }

    override fun calculatePerimeter(): Double = a + b + c

    override fun calculateArea(): Double {
        val s = calculatePerimeter() / 2
        return sqrt(s * (s - a) * (s - b) * (s - c))
    }
}

fun main() {
    val circle = Circle(radius = 5.0, color = "Red", isTransparent = false)
    val triangle = Triangle(a = 3.0, b = 4.0, c = 5.0, color = "Blue", isTransparent = true)

    println("Circle | color=${circle.color}, transparent=${circle.isTransparent}")
    println("Perimeter: ${circle.calculatePerimeter()}")
    println("Area: ${circle.calculateArea()}")

    println()

    println("Triangle | color=${triangle.color}, transparent=${triangle.isTransparent}")
    println("Perimeter: ${triangle.calculatePerimeter()}")
    println("Area: ${triangle.calculateArea()}")
}

 */
// SENIOR LØSNING SLUT

// Mit svar:

