package hw4
/*
https://github.com/otuskotlin/202209-okb-homework/blob/main/HW-4/Task-3.md

На вход подается натуральное число N - количество этажей равнобедренного треугольника.
Напишите код, который будет рисовать равнобедренный треугольник из звездочек(*)
Важный момент: функционал по "рисованию" треугольника должен быть вынесен в отдельную функцию,
принимающую на вход N и рисующую треугольник
Ответ должен быть в виде строк с отцентрированными звездочками

Входные данные:
6

Ответ:
     *
    * *
   * * *
  * * * *
 * * * * *
* * * * * *

 */

fun main() {
    try{
        println("please input an integer number. this number is a count of floors for a " +
                "tiangle which consits from asterix symbols:")
        val numberOfFloors = readln().toInt()

        if (numberOfFloors <=0){
            println("its unable to draw a triangle with zero or with negative number of floors")
        }
        else{
            drawTriangle(numberOfFloors)
        }

    } catch(e:Exception){
        println("a problem with input occured. seems you have entered not a digit or not integer digit")
    }
}

fun drawTriangle(number:Int) {
    for (i in 1 .. number){
        val emptySpaceNumber = number-i
        val emptySpace = " ".repeat(emptySpaceNumber)
        print(emptySpace)
        val floor = "* ".repeat(i)
        println(floor)
    }
}