package HW3

import java.util.*

/*
На вход подается 3 натуральных числа A, B, C - стороны треугольника.
Определите тип треугольника (остроугольный, тупоугольный, прямоугольный) с данными сторонами.
Ответ должен быть в виде строки с ответом на вопрос.

Входные данные:
5 8 6

Ответ:
тупоугольный

 */

fun main() {
    try {
        println(
            "На вход подается 3 натуральных числа A, B, C - стороны треугольника. \n" +
            "Определите тип треугольника (остроугольный, тупоугольный, прямоугольный) с данными сторонами."
        )

        val input = Scanner(System.`in`)
        val sidea = input.nextInt()
        val sideb = input.nextInt()
        val sidec = input.nextInt()


        val sortedarr = arrayOf(sidea, sideb, sidec).sorted()
        val sortedSideA = sortedarr[0]
        val sortedSideB = sortedarr[1]
        val sortedSideC = sortedarr[2]

        if (sortedSideC*sortedSideC == sortedSideB*sortedSideB + sortedSideA*sortedSideA) println("прямоугольный")
        else if(sortedSideC*sortedSideC <= sortedSideB*sortedSideB + sortedSideA*sortedSideA) println("остроугольный")
        else if(sortedSideC*sortedSideC >= sortedSideB*sortedSideB + sortedSideA*sortedSideA) println("тупоугольный")
        else println("треугольник не сущестует")

        } catch (e: Exception){
            println("You have entered incorrect input data!")
        }
}