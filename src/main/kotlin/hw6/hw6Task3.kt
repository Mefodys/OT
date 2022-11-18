package hw6

import java.util.*

/*
https://github.com/otuskotlin/202209-okb-homework/blob/main/HW-6/Task-3.md

На вход подается массив чисел, содержащий минимум одно число.
Нужно вывести через пробел: минимальное, среднее и максимальное числа из этого массива.
Ответ три числа через пробел.

Входные данные:
7 54 56 23 4 45 8 10 9
Ответ:
4 24 56
*/
//[7, 54, 56, 23, 4, 45, 8, 10, 9]
fun main() {

    try{
        val input = Scanner(System.`in`)
        val list = input.nextLine().split(" ").map{it.toInt()}

        val min = list.min()
        val max = list.max()
        val avg = list.average()
        println("$min $avg $max")
    }
    catch(e:Exception){
        println("incorrect input")
    }

}