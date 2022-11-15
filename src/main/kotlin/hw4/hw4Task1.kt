package hw4

/*
На вход подается натуральное число N. Напишите код и реализуйте отдельную функцию,
которая будет возвращать значение true, если число является палиндромом.
Важный момент: функционал по вычислению палиндрома должен быть вынесен в отдельную функцию,
принимающую на вход N и возвращающую boolean значение
Ответ должен содержать одно слово - true или false.
Неотрицательное целое число называется палиндромом, если оно одинаково читается вперед и назад.
Например, числа 5, 121, 3443 и 123454321 являются палиндромами.

Входные данные:
1524
Ответ:
false

Входные данные:
162261
Ответ:
true
 */

fun main() {

    try{
        println("please input a positive integer number and the programm will check is it a palindrom or not:")

        val number = readln().toInt()
        //println(number)

        if (number < 0)
        {
            println("you have entered negative number. it was necessary to input a positive number")
        }
        else{
            val result =  isPalindrom(number)
            if (result == true){
                println("true")
            }
            else{
                println("false")
            }
        }


    } catch (e:Exception){
        println("a problem with input occured. seems you have entered not a digit or not integer digit")
    }

}

fun isPalindrom (number: Int): Boolean {
    var flag = false
    //println("checking input for palindrom...")

    val numberToString = number.toString()
    val numberToStringReversed = numberToString.reversed()
    //println(numberToString)
    //println(numberToStringReversed)


    for (i in 0 .. numberToString.length / 2){
        //println("${numberToString[i]}, ${numberToStringReversed[i]}")

        if (numberToString[i] != numberToStringReversed[i]){
            flag = false
            break
        }
        else{
            flag = true

        }
    }

    return flag
}
