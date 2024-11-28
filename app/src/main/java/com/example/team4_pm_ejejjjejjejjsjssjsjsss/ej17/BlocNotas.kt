package com.example.team4_pm_ejejjjejjejjsjssjsjsss.ej17

class BlocNotas (var notas : MutableList<Nota>){

    fun introducirNota(nota:Nota){
        notas.add(nota)
        println("Nota con id ${nota.id} aniadida")
    }

    fun listarNotas(){
        println(notas.toString())
    }

    fun eliminarNota(pos:Int){
        notas.removeAt(pos)
        println("Nota con posicion $pos eliminada")
    }

    fun contarNotas():Int{
        return notas.size
    }
}