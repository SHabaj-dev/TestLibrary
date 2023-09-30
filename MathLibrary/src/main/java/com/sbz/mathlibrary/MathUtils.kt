package com.sbz.mathlibrary

import kotlin.math.pow
import kotlin.math.sqrt

data class Points(val x: Double, val y: Double)

fun Points.calculateDistanceTo(points: Points): Double {
    return sqrt((x - points.x).pow(2) + (y - points.y).pow(2))
}