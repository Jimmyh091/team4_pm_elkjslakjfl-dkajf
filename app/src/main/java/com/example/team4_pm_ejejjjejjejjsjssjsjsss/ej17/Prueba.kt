package com.example.team4_pm_ejejjjejjejjsjssjsjsss.ej17

class Prueba (var blocNotas : BlocNotas){

    fun probarTodo(){

        blocNotas.introducirNota(Nota(blocNotas.contarNotas(), "Esto es una prueba"))
        blocNotas.listarNotas()
        println("Hay ${blocNotas.contarNotas()} notas")
        blocNotas.eliminarNota(2)
        blocNotas.listarNotas()

    }

}