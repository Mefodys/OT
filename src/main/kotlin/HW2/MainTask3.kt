package HW2_

import kotlin.math.sqrt

fun main() {
//    Task3 - https://github.com/otuskotlin/202209-okb-homework/blob/main/HW-2/Task-2.md
//    На вход подается два натуральных числа: A и B. Они являются сторонами прямоугольника.
//    Требуется вычислить квадрат диагонали прямоугольника.
//    Ответ должен содержать одно действительное число, округленное до 3 знаков после запятой.



    val sidea = 10F
    val sideb = 3F
    val ab = sidea * sidea + sideb * sideb
    val diagonal = sqrt(ab)
    println( String.format("%.3f", diagonal) )

}