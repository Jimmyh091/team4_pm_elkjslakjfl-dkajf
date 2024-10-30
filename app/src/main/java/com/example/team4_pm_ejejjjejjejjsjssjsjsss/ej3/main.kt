package com.example.team4_pm_ejejjjejjejjsjssjsjsss.ej3

fun main(){
    var listaContactos = mutableListOf(
        Contacto("Nahuel", 24332874, "nahuel@gmail.com"),
        Contacto("Manuel", 987345832, "manu@gmail.com"),
        Contacto()
    )

    listaContactos.add(Contacto())
    listaContactos.removeAt(1)
}