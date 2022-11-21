package hw5

import java.util.*
import kotlin.math.sqrt

/*
https://github.com/otuskotlin/202209-okb-homework/blob/main/HW-5/Task-2.md

На вход подается 4 целых числа x1, x2, y1, у2, где (-10000<x1,x2,y,1,у2<10000).
Напишите метод, который будет возвращать вещественное число типа double - длину
отрезка с концами в точках (x1,y1) и (x2,y2).
Ответ должен содержать одно вещественное число с шестью знаками после запятой.

Входные данные:
45 6 3 23

Ответ:
45.310043

 */

fun main() {

    val myMinRange:Int = -10000
    val myMaxRange:Int = 10000
    //val a = setOf(-10000..10000)

    try{
        val input = Scanner(System.`in`)
        val x1 = input.nextInt()
        val x2 = input.nextInt()
        val y1 = input.nextInt()
        val y2 = input.nextInt()

        if (
            (x1 >= myMinRange && x1 <=myMaxRange) &&
            (x2 >= myMinRange && x2 <=myMaxRange) &&
            (y1 >= myMinRange && y1 <=myMaxRange) &&
            (y2 >= myMinRange && y2 <=myMaxRange)
        ){
            val result = lengthOfLine(x1, x2, y1, y2)
            val stringResult = String.format("%.6f", result)
            println(stringResult)
        }
        else{
            println("incorrect range of input. input should be the following: -10000<x1,x2,y1,у2<10000")
        }


    } catch(e:Exception){
        print("catched exception: incorrect input")
    }

}

//|AB|² = (y2 - y1)² + (x2 - x1)²
fun lengthOfLine(x1: Int, x2: Int, y1: Int, y2: Int): Double {
    val temp1 = (y2 - y1) * (y2 - y1)
    val temp2 = (x2 - x1) * (x2 - x1)

    return sqrt(temp1.toDouble() + temp2.toDouble())
}