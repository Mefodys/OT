package hw6

import java.util.*

/*
https://github.com/otuskotlin/202209-okb-homework/blob/main/HW-6/Task-1.md

На вход подается целое натуральное число N.
Далее через пробел подаются N чисел от 0 до 100000.
Нужно вывести эти числа в сортировоном виде от меньшего к большему через пробел.

Пример:
Входные данные:
15
6 45 2 5 65 7 672 3 12 9 87 45 76  355 326

Ответ:
2 3 5 6 7 9 12 45 45 65 76 87 326 355 672
     */
fun main() {
    val tempRange = 1..Int.MAX_VALUE
    try{
        val n = readln().toInt()
        if ((tempRange).contains(n)){
            try {

                val myListOfNumbers = mutableListOf<Int>()
                val myNumbersList = Scanner(System.`in`)
                var redflag = false
                for (i in 0 until n){
                    val mynumber = myNumbersList.nextInt()

                    if ((tempRange).contains(mynumber)) {myListOfNumbers.add(mynumber)}
                    else{
                        println("incorrect number. numbers should be in range of 0 till 100000")
                        redflag = true
                        break
                    }
                }

                if (redflag == false) {
                    println(myListOfNumbers.sorted().joinToString(separator = " "))
                }

            } catch (e: Exception){
                println ("incorrect input of $n digits")
            }
        }
        else println("incorrect input of N digits. It should be grater than 0")

    }
    catch(e: Exception){
        println ("incorrect input or N")
    }

}