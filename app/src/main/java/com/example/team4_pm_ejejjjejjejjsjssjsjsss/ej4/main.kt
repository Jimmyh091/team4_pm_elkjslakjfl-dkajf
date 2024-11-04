package com.example.team4_pm_ejejjjejjejjsjssjsjsss.ej4

fun main(){
    var listaAlumnos = mutableListOf(
        Estudiante("Jaime", 19, mutableListOf(7f,3f,2f,10f,2f,1f,1f,10f)),
        Estudiante("Nahuel", 25, mutableListOf(7f,3f,2f,10f,2f,1f,1f,10f)),
        Estudiante("Gaspar", 250, mutableListOf(7f,3f,2f,10f,2f,1f,1f,10f))
    )

    print(listaAlumnos[0].toString())
    println(calcularPromedio(listaAlumnos))
}

fun calcularPromedio(listaAlumnos: MutableList<Estudiante>) : Float{
    var res = 0f
    listaAlumnos.forEach{
        res += it.media()
    }
    return res / listaAlumnos.size
}