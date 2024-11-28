package com.example.team4_pm_ejejjjejjejjsjssjsjsss.ej17

class NotaAlarma (id : Int, texto : String, var alarma : String) : Nota (id, texto) {

    constructor(nota: Nota, alarma : String) : this (nota.id, nota.texto, alarma)

}