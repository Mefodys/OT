package hw4

/*
https://github.com/otuskotlin/202209-okb-homework/blob/main/HW-4/Task-2.md

На вход подается натуральное число N. Напишите код, который будет вычислять факториал числа N.
Важный момент: функционал по вычислению факториала должен быть вынесен в отдельную функцию,
принимающую на вход N и возвращающую факториал числа

Ответ должен содержать одно число.

Входные данные:
9

Ответ:
362880
*/


fun main() {
    try{
        println("please input an integer number and the programm will show a factorial result for this number:")
        val number = readln().toInt()
        println(factorial(number))

    } catch(e:Exception){
        println("a problem with input occured. seems you have entered not a digit or not integer digit")
    }
}

fun factorial(number:Int): Int {
    if (number <= 1) return 1
    return number * factorial(number - 1)
}