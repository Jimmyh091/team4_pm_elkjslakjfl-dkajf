package com.example.team4_pm_ejejjjejjejjsjssjsjsss.ej11hasta13

fun main (){

    // ej12
    var listaEquipos = listOf(
        EquipoFutbol("Real Madrid", "España"),
        EquipoFutbol("Barcelona", "España"),
        EquipoFutbol("Atlético de Madrid", "España"),
        EquipoFutbol("Sevilla", "España"),
        EquipoFutbol("Manchester United", "Reino Unido"),
        EquipoFutbol("Manchester City", "Reino Unido"),
        EquipoFutbol("Liverpool", "Reino Unido"),
        EquipoFutbol("Juventus", "Italia"),
        EquipoFutbol("Inter de Milán", "Italia"),
        EquipoFutbol("Roma", "Italia"),
        EquipoFutbol("Napoli", "Italia"),
        EquipoFutbol("Boca Juniors", "Argentina"),
        EquipoFutbol("River Plate", "Argentina"),
        EquipoFutbol("PSG", "Francia"),
        EquipoFutbol("Bayern de Múnich", "Alemania"),
        EquipoFutbol("Porto", "Portugal")
    )

    // ej13
    println(championsLeage(listaEquipos))
}

fun championsLeage(listaEquipos : List<EquipoFutbol>) : MutableList<EquipoFutbol>{
    var listaEquiposGanadores = mutableListOf<Int>()

    for (it in 0 until 8){
        var num : Int

        do {
            num = (0 until 16).random()
        }while (listaEquiposGanadores.contains(num))

        listaEquiposGanadores.add(num)
    }

    var listaEquiposFinalistas = mutableListOf<EquipoFutbol>()

    listaEquiposGanadores.forEach {
        listaEquiposFinalistas.add(listaEquipos[it])
    }

    return listaEquiposFinalistas
}