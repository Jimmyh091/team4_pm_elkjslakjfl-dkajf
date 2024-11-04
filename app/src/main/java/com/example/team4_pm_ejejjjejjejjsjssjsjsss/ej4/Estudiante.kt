package com.example.team4_pm_ejejjjejjejjsjssjsjsss.ej4

class Estudiante (var nombre: String = "Nombre", var edad: Int = 0, var calificaciones: MutableList<Float> = mutableListOf<Float>()) {


    override fun toString() : String{
        return "Nombre: $nombre\nEdad: $edad\nCalificaciones: ${calificaciones.toString()}"
    }

    fun media() : Float{
        var res = 0f
        calificaciones.forEach {
            res += it
        }

        return res / calificaciones.size
    }
}
