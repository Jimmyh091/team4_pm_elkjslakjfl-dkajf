package com.example.team4_pm_ejejjjejjejjsjssjsjsss

/*Crear la clase triangulo. Propiedades: longitud de los tres lados, perímetro,
tipo de triángulo (isósceles, escaleno o equilátero). Implementar el método
.rectangulo():Boolean que calcula si el triángulo es rectángulo. Nota*/

class Triangulo (var longitud: List<Int> = listOf(0), var perimetro: Int = 0, var tipo: String = "") {

    constructor() : this(listOf(0), 0, "Equilatero")

    fun rectangulo() : Boolean{
        val a = longitud.get(0)
        val b = longitud.get(1)
        val c = longitud.get(2)

        return a * a + b * b == c * c
    }
}