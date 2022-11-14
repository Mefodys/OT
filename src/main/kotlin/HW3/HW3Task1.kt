package HW3

import java.util.Scanner

/*
Напишите программу, которая вводит с клавиатуры номер месяца и день,
и определяет, сколько дней осталось до Нового Года.
При вводе неверных данных должно быть выведено сообщение об ошибке.
Считается, что год невисокосный.
1 -> 31
2 -> 28
3 -> 31
4 -> 30
5 -> 31
6 -> 30
7 -> 31
8 -> 31
9 -> 30
10 -> 31
11 -> 30
12 -> 31




На вход подается два натуральных числа: месяц и день.
Ответ должен содержать натуральное число - кол-во дней до Нового Года.

Пример:
Входные данные:
8 1

Ответ:
152
 */
fun main() {
    try{
        println("Enter two digits. The first digit is a month, the second digit is a day.\n" +
                "The progamm will show how many days left till New Year! :)\n" +
                "Example: \n" +
                "8 1")

        val input = Scanner(System.`in`)
        val months = input.nextInt()
        val days = input.nextInt()


        when(months){
            1 -> {
                val daysShoudBeInMonth = 31
                if (days in 1..daysShoudBeInMonth) {
                    val daysTillTheEndOfMonth = daysShoudBeInMonth - days
                    val daysInNextMonths = 28+31+30+31+30+31+31+30+31+30+31
                    println(daysTillTheEndOfMonth+daysInNextMonths)
                }
                else{
                    println("count of days is not correct. This month does have such amount of days. Sorry.")
                }
            }
            2 -> {
                val daysShoudBeInMonth = 28
                if (days in 1..daysShoudBeInMonth) {
                    val daysTillTheEndOfMonth = daysShoudBeInMonth - days
                    val daysInNextMonths = 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31
                    println(daysTillTheEndOfMonth + daysInNextMonths)
                } else {
                    println("count of days is not correct. This month does have such amount of days. Sorry.")
                }
            }
            3 -> {
                val daysShoudBeInMonth = 31
                if (days in 1..daysShoudBeInMonth) {
                    val daysTillTheEndOfMonth = daysShoudBeInMonth - days
                    val daysInNextMonths = 30+31+30+31+31+30+31+30+31
                    println(daysTillTheEndOfMonth+daysInNextMonths)
                }
                else{
                    println("count of days is not correct. This month does have such amount of days. Sorry.")
                }
            }
            4 -> {
                val daysShoudBeInMonth = 30
                if (days in 1..daysShoudBeInMonth) {
                    val daysTillTheEndOfMonth = daysShoudBeInMonth - days
                    val daysInNextMonths = 31+30+31+31+30+31+30+31
                    println(daysTillTheEndOfMonth+daysInNextMonths)
                }
                else{
                    println("count of days is not correct. This month does have such amount of days. Sorry.")
                }
            }
            5 -> {
                val daysShoudBeInMonth = 31
                if (days in 1..daysShoudBeInMonth) {
                    val daysTillTheEndOfMonth = daysShoudBeInMonth - days
                    val daysInNextMonths = 30+31+31+30+31+30+31
                    println(daysTillTheEndOfMonth+daysInNextMonths)
                }
                else{
                    println("count of days is not correct. This month does have such amount of days. Sorry.")
                }
            }
            6 -> {
                val daysShoudBeInMonth = 30
                if (days in 1..daysShoudBeInMonth) {
                    val daysTillTheEndOfMonth = daysShoudBeInMonth - days
                    val daysInNextMonths = 31+31+30+31+30+31
                    println(daysTillTheEndOfMonth+daysInNextMonths)
                }
                else{
                    println("count of days is not correct. This month does have such amount of days. Sorry.")
                }
            }
            7 ->  {
                val daysShoudBeInMonth = 31
                if (days in 1..daysShoudBeInMonth) {
                    val daysTillTheEndOfMonth = daysShoudBeInMonth - days
                    val daysInNextMonths = 31+30+31+30+31
                    println(daysTillTheEndOfMonth+daysInNextMonths)

                }
                else{
                    println("count of days is not correct. This month does have such amount of days. Sorry.")
                }
            }
            8 ->  {
                val daysShoudBeInMonth = 31
                if (days in 1..daysShoudBeInMonth) {
                    val daysTillTheEndOfMonth = daysShoudBeInMonth - days
                    val daysInNextMonths = 30+31+30+31
                    println(daysTillTheEndOfMonth+daysInNextMonths)
                }
                else{
                    println("count of days is not correct. This month does have such amount of days. Sorry.")
                }
            }
            9 -> {
                val daysShoudBeInMonth = 30
                if (days in 1..daysShoudBeInMonth) {
                    val daysTillTheEndOfMonth = daysShoudBeInMonth - days
                    val daysInNextMonths = 31+30+31
                    println(daysTillTheEndOfMonth+daysInNextMonths)
                }
                else{
                    println("count of days is not correct. This month does have such amount of days. Sorry.")
                }
            }
            10 -> {
                val daysShoudBeInMonth = 31
                if (days in 1..daysShoudBeInMonth) {
                    val daysTillTheEndOfMonth = daysShoudBeInMonth - days
                    val daysInNextMonths = 30+31
                    println(daysTillTheEndOfMonth+daysInNextMonths)
                }
                else{
                    println("count of days is not correct. This month does have such amount of days. Sorry.")
                }
            }
            11 -> {
                val daysShoudBeInMonth = 30
                if (days in 1..daysShoudBeInMonth) {
                    val daysTillTheEndOfMonth = daysShoudBeInMonth - days
                    val daysInNextMonths = 31
                    println(daysTillTheEndOfMonth+daysInNextMonths)
                }
                else{
                    println("count of days is not correct. This month does have such amount of days. Sorry.")
                }
            }
            12 ->  {
                val daysShoudBeInMonth = 31
                if (days in 1..daysShoudBeInMonth) {
                    val daysTillTheEndOfMonth = daysShoudBeInMonth - days
                    val daysInNextMonths = 0
                    println(daysTillTheEndOfMonth+daysInNextMonths)
                }
                else{
                    println("count of days is not correct. This month does have such amount of days. Sorry.")
                }
            }
            else -> {
                println("You have entered incorrect number of the month or the date. Bye!")
            }

        }

    } catch(e: Exception){
        println("You have entered incorrect number of the month or the date. Bye!")
    }

}
