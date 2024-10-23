package com.example.team4_pm_ejejjjejjejjsjssjsjsss

fun main(){
    val mercurio = Planeta("Mercurio", "Rocoso", 3.2f)
    val venus = Planeta("Venus", "Rocoso", 4.8f)
    val tierra = Planeta("Tierra", "Rocoso", 5.9f)
    val marte = Planeta("Marte", "Rocoso", 6.3f)

    val listaPlanetas = listOf(mercurio, venus, tierra, marte)

    val sistemaSolar = SistemaSolar(listaPlanetas)

    println("La mayor masa es ${sistemaSolar.planetaMayor()}")
    println("La menor masa es ${sistemaSolar.planetaMenor()}")
    println("La masa media es ${sistemaSolar.masaMedia()}")
}