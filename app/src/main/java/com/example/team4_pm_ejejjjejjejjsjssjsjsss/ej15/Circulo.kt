package com.example.team4_pm_ejejjjejjejjsjssjsjsss.ej15

import android.graphics.Color
import com.example.team4_pm_ejejjjejjejjsjssjsjsss.ej14.Circunferencia
import kotlin.time.times

class Circulo(radio : Float, var color : Color) : Circunferencia(radio) {

    constructor(centro : Pair<Float, Float>, puntoCircunferencia : Pair<Float, Float>, color : Color) : this (
        (puntoCircunferencia.first - centro.first) * (puntoCircunferencia.first - centro.first) +
                (puntoCircunferencia.second - centro.second) * (puntoCircunferencia.second - centro.second), color)

    fun area() : Float{
        return (super.PI * Math.pow(radio.toDouble(), 2.0)).toFloat()
    }

    override fun toString(): String {
        return "El circulo tiene como radio $radio, como longitud ${longitud()} y como area ${area()}"
    }


}