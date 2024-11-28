package com.example.team4_pm_ejejjjejjejjsjssjsjsss.ej17

fun main(){
    var bn = BlocNotas(
        mutableListOf(
            Nota(0, "Esto es la primera nota"),
            Nota(1, "Esto es la segunda nota"),
            Nota(2, "Esto es la es la es la nota"),
            NotaAlarma(3, "skadlhfksalj", "DESPIERTA A LAS 04:21"),
        )
    )

    var p = Prueba(bn)
    p.probarTodo()
}