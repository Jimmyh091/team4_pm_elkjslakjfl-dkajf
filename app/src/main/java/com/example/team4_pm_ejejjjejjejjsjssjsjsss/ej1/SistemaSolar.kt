package com.example.team4_pm_ejejjjejjejjsjssjsjsss.ej1

/*Crea la clase sistema solar la cual tendrá una lista de planetas y los métodos .planetaMayor() que
devuelve el planeta de mayor masa, .planetaMenor() que devuelve el planeta de menor
masa y .masaMedia() que devuelve la masa media de los planetas del sistema solar*/

class SistemaSolar (var planetas: List<Planeta>){

    fun planetaMayor() : Float{

        var resultado = planetas.get(0)

        for (planeta in planetas){
            if (planeta.masa > resultado.masa) resultado = planeta
        }

        return resultado.masa
    }

    fun planetaMenor() : Float{

        var resultado = planetas.get(0)

        for (planeta in planetas){
            if (planeta.masa < resultado.masa) resultado = planeta
        }

        return resultado.masa
    }

    fun masaMedia() : Float{

        var masaMedia = 0f

        for (planeta in planetas){
            masaMedia += planeta.masa
        }

        return masaMedia / planetas.size
    }
}