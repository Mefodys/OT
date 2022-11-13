package HW2

fun main() {
//    Task2 - https://github.com/otuskotlin/202209-okb-homework/blob/main/HW-2/Task-2.md
//    На вход подается одно натуральное число N - количество минут. Напишите код, который будет конвертировать
//    минуты в кол-во годов и месяцев.

//    Ответ Должен содержать два числа:
//    первое чилос - целые годы и второе число - целые месяцы.
//    Возможны ответы в формате "10 5" и "3 года и 1 месяц".

    // в сутках 1440 минут
    // в месяце (30 дней) 43200 минут
    // в годе 518400 минут

    var flag = true
    while (flag) {
        try{
            println("Enter a number of minutes:")
            val minutes = readln().toInt()
            if (minutes <= 0){
                println("you have entered incorrect number of minutes.")
                continue
            }
            flag = false

            val hours = minutes / 60
            val days = hours / 24
            val months = days / 30
            val years = months / 12
            val lastmonths = months % 12

            println("$years $lastmonths")
        } catch(e: Exception){
            println("It is necessary to input a number of minutes")
        }
    }
}