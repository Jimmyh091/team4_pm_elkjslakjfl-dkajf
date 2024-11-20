package com.example.team4_pm_ejejjjejjejjsjssjsjsss.ej6hasta10

import com.example.team4_pm_ejejjjejjejjsjssjsjsss.ej1.Planeta

fun main(){

    // ej6
    val sistemaSolar = listOf(
        Planeta("Mercurio", "Rocoso", 3.2f),
        Planeta("Venus", "Rocoso", 4.8f),
        Planeta("Tierra", "Rocoso", 5.9f),
        Planeta("Marte", "Rocoso", 6.3f),
        Planeta("Jupiter", "Gaseoso", 189.8f),
        Planeta("Saturno", "Gaseoso", 50.6f),
        Planeta("Urano", "Gaseoso", 8.6f),
        Planeta("Neptuno", "Gaseoso", 1.4f)
    )

    // ej7
    sistemaSolar.toString()

    // ej8
    sistemaSolar.forEach {
        if (it.nombre.toString().get(0) == 'M'){
            it.toString()
        }
    }

    // ej9
    val tierra = sistemaSolar.get(2)
    sistemaSolar.forEach { planeta ->
        if (planeta.tipo == "Gaseoso"){
            if (planeta.masa >= tierra.masa * 20){
                planeta.toString()
            }
        }
    }

    // ej10
    var masaTotal = 0.0
    sistemaSolar.forEach{
        masaTotal += it.masa
    }
    val media = masaTotal / sistemaSolar.size


}