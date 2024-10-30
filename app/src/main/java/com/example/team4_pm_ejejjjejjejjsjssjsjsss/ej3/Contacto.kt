package com.example.team4_pm_ejejjjejjejjsjssjsjsss.ej3

class Contacto (var nombre: String = "", var numTelefono: Int = 9, var email: String = ""){

    constructor(nombre: String) : this(nombre, numTelefono = 111111111, email = "")
    constructor() : this("", 0, "")
}