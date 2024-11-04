package com.example.team4_pm_ejejjjejjejjsjssjsjsss.ej5

fun main(){
    var lista = mutableListOf(
        Producto("Pizza", 100.00f, 100),
        Producto("Bocatas", 10.00f, 1000),
        Producto("Movil", 1.99f, 3),
        Producto("Tiempo", 99.99f, 500),
    )

    lista.add(Producto("Dignidad", 0.98f, 8))
    lista.removeAt(2)

    print(lista)
}