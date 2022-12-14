package com.example._01_creational_patterns._03_abstract_factory.kt._02_after

import com.example._01_creational_patterns._02_factory_method.kt._02_after.ShipFactory

fun main() {
    val shipFactory1: ShipFactory = WhiteShipFactory(WhiteShipPartsFactory())
    val ship1 = shipFactory1.createShip()
    println(ship1)
    println(ship1.anchor.javaClass)
    println(ship1.wheel.javaClass)

    val shipFactory2: ShipFactory = WhiteShipFactory(WhitePartsProFactory())
    val ship2 = shipFactory2.createShip()
    println(ship2)
    println(ship2.anchor.javaClass)
    println(ship2.wheel.javaClass)
}
