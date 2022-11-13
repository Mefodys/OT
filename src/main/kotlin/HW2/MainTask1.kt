package HW2_

fun main() {
//    Task1 - https://github.com/otuskotlin/202209-okb-homework/blob/main/HW-2/Task-1.md
//    На вход подается одно натуральное трехзначное число - N. Напишите код, который будет вычислять сумму цифр в данном числе.
//    Ответ должен содержать одно натуральное число.

    var number = readln().toInt()

    var times = 3
    var sum = 0
    var lastdigit = 0
    while(times > 0){
        lastdigit = number % 10
        sum = sum + lastdigit
        number = number / 10

        times -=1
    }
    println(sum)
}