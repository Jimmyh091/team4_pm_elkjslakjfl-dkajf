package com.example.team4_pm_ejejjjejjejjsjssjsjsss.ej14

open class Circunferencia (var radio : Float ) {

    val PI = 3.141592

    constructor(centro : Pair<Float, Float>, puntoCircunferencia : Pair<Float, Float>) : this(
        (puntoCircunferencia.first - centro.first) * (puntoCircunferencia.first - centro.first) +
                (puntoCircunferencia.second - centro.second) * (puntoCircunferencia.second - centro.second))

    fun longitud() : Float {
        return (radio * 2 * PI).toFloat()
    }

    override fun toString(): String {
        return "La circunferencia tiene como radio $radio y como longitud ${longitud()}"
    }
}