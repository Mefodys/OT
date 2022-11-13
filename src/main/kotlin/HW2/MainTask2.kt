package HW2

fun main() {
//    Task2 - https://github.com/otuskotlin/202209-okb-homework/blob/main/HW-2/Task-2.md
//    На вход подается одно натуральное число N - количество минут. Напишите код, который будет конвертировать минуты в кол-во годов и месяцев.
//    Ответ Должен содержать два числа: первое чилос - целые годы и второе число - целые месяцы. Возможны ответы в формате "10 5" и "3 года и 1 месяц".



    val minutes = readln().toInt()

    val hours = minutes / 60
    val days = hours / 24
    val months = days / 30
    val years = months / 12 - 1
    val lastmonths = months % 12 - 1

    println("$years $lastmonths")

}