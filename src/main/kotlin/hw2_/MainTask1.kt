package hw2_

fun main() {
//    Task1 - https://github.com/otuskotlin/202209-okb-homework/blob/main/HW-2/Task-1.md
//    На вход подается одно натуральное трехзначное число - N. Напишите код, который будет вычислять сумму цифр в данном числе.
//    Ответ должен содержать одно натуральное число.

    var flag:Boolean = false

    while (flag != true){
        try {
            println("Please enter a digit with 3 symbols (like 456 or 333 or 190):")
            var number = readln().toInt()
            flag = true


            val countOfSymols = number.toString().length
            //println(countOfSymols)
            if (countOfSymols == 3 && number > 99){
                var times = 3
                var sum = 0
                var lastdigit = 0
                while(times > 0){
                    lastdigit = number % 10
                    sum = sum + lastdigit
                    number = number / 10

                    times -=1
                }
                println("Sum of digits is $sum. Bye!")
            }
            else {
                println("you entered not a 3 symbols digit :( \n")
                flag = false
            }

        } catch (e: Exception) {
            println("It is necessary to input a digit with 3 symbols.")
        }
    }
}