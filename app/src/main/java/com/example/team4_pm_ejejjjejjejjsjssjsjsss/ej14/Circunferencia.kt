package com.example.team4_pm_ejejjjejjejjsjssjsjsss.ej14

class Circunferencia (radio : Float ) {

    constructor(centro : Pair<Float, Float>, puntoCircunferencia : Pair<Float, Float>) : this((puntoCircunferencia.first - centro.first) * (puntoCircunferencia.first - centro.first) + (puntoCircunferencia.second - centro.second) * (puntoCircunferencia.second - centro.second))

}