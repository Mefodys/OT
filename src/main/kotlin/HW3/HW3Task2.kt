package HW3

/*
На вход подается целое неотрицательное число 𝑋, 𝑋<100.
Требуется перевести это число в римскую систему счисления.
Ответ должен быть в виде строки.

Входные данные:
68

Ответ:
LXVIII
 */


/*
1 = I
2 = II
3 = III
4 = IV
5 = V
6 = VI
7 = VII
8 = VIII
9 = IX
10 = X

20 = XX
30 = XXX
40 = XL
50 = L
60 = LX
70 = LXX
80 = LXXX
90 = XC

*/

fun main() {

    val ones = arrayListOf("","I","II","III","IV","V","VI","VII","VIII","IX")
    val tens = arrayListOf("","X","XX","XXX","XL","L","LX","LXX","LXXX","XC")

    try {
        println("Input positive integer digit less than 100:")
        val input = readln().toInt()

        when(input){
            in 1..9-> {
                println(ones[input])
            }
            in 10..99-> {
                val dec = input / 10
                val edi = input % 10
                println("${tens[dec]}${ones[edi]}")
            }

            else -> println("Incorrect input. Input must be a positive integer digit less then 100")
        }


 } catch(e:Exception){
     println("Incorrect input. Input must be a positive integer digit less then 100")
 }
}