package hw2_

import kotlin.math.sqrt

fun main() {
//    Task3 - https://github.com/otuskotlin/202209-okb-homework/blob/main/HW-2/Task-2.md
//    На вход подается два натуральных числа: A и B. Они являются сторонами прямоугольника.
//    Требуется вычислить квадрат диагонали прямоугольника.
//    Ответ должен содержать одно действительное число, округленное до 3 знаков после запятой.
    //    val sidea = 10F
    //    val sideb = 3F
    // result should be 10.440

    println("You need to enter 2 digits - lengths of side A and side B or rectangle. \n" +
            "As a result you will receive a length of diagonal of this rectangle.")
    try {
        println("Enter side a:")
        val sidea = readln().toFloat()
        println("Enter side b:")
        val sideb = readln().toFloat()

        if (sidea >= 0 && sideb >=0){
            val ab = sidea * sidea + sideb * sideb
            val diagonal = sqrt(ab)
            println( String.format("%.3f", diagonal) )
        }
        else{
            println("you entered incorrect digits. this rectangle does not exist")
        }

    } catch (e: Exception){
        println("you entered non a valid digit")
    }

}
