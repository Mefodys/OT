package hw5

import java.util.*

/*
https://github.com/otuskotlin/202209-okb-homework/blob/main/HW-5/Task-1.md

На вход подается 4 целых числа A, B, C, D. Напишите метод, который будет возвращать минимальное из этих чисел.
Ответ должен содержать одно из чисел.

Входные данные:
5 756 45 39

Ответ:
5

 */

fun main() {
    try{
        val input = Scanner(System.`in`)
        val digit1 = input.nextInt()
        val digit2 = input.nextInt()
        val digit3 = input.nextInt()
        val digit4 = input.nextInt()

        val result = findMinimumDigit(digit1, digit2, digit3, digit4)
        println(result)

    } catch(e:Exception){
        print("catched: incorrect input")
    }

}

fun findMinimumDigit( a:Int,b:Int,c:Int,d:Int):Int{
    val arrOfDigits = intArrayOf(a, b, c, d)
    var minVal = arrOfDigits[0]
    var i = 0
    while(i < arrOfDigits.size){
        if(arrOfDigits[i] < minVal) minVal = arrOfDigits[i]
        i+= 1
    }
    return minVal
}