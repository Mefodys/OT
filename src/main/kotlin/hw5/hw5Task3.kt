package hw5

/*
https://github.com/otuskotlin/202209-okb-homework/blob/main/HW-5/Task-3.md

Реализуйте метод, который будет валидировать пароль.
Пароль должен быть достаточно сложным, поэтому должны выполняться следующие минимальные правила:

+ Длина минимум 6 символов.
+ Минимум одна цифра.
Минимум одна заглавная буква.
Не должно быть 3 одинаковых символа подряд.
*
Ответ должен содержать строку с текстом валидации.
Например "проверка пройдена", "не соответвует правилам", "нет цифр" и тд.

Пример:

Входные данные:
T75Dghe$?

Ответ:
проверка пройдена
 */

// проверка на пробелы в пароле.

fun main() {
    val userPassword = readln()
    val result: Int = validateUserPassword(userPassword)
    when (result){
        0 -> println("проверка пройдена")
        1 -> println("пробелы в пароле. их быть не должно")
        2 -> println("не соответвует правилам")
        3 -> println("нет цифрт")
        4 -> println("нет заглавных букв в пароле")
        5 -> println("не должно быть 3 одинаковых символа подряд.*")
        else -> ("ошибка валидации")

    }
}

fun validateUserPassword(userPassword: String): Int{
    val userPassword = userPassword

    if (!checkPasswordForSpaces(userPassword)) return 1 // "пробелмы в пароле. их быть не должно"
    if (!checkPasswordLength(userPassword)) return 2    // "не соответвует правилам"
    if (!checkPasswordForMinOneDigit(userPassword)) return 3   // "нет цифр"
    if (!checkPasswordForMinOneUppercaseLetter(userPassword)) return 4    // "нет заглавных букв в пароле"
    if (!checkForTreeSameSymbolsInaRaw(userPassword)) return 5    // "не должно быть 3 одинаковых символа подряд.*"

    return 0 // проверка пройдена
}


fun checkPasswordForSpaces(userPassword: String): Boolean{
    return " " !in userPassword
}

fun checkPasswordLength(userPassword: String): Boolean{
    return userPassword.length in 6..50
}

fun checkPasswordForMinOneDigit(userPassword: String): Boolean{
    var temp = 0
    for (i in userPassword){
        if (i.isDigit()) temp+=1
    }

    if (temp > 0 ) return true
    return false
}

fun checkPasswordForMinOneUppercaseLetter(userPassword: String): Boolean{
    var temp = 0
    for (i in userPassword){
        if (i.isUpperCase()) temp+=1
    }

    if (temp > 0 ) return true
    return false
}

fun checkForTreeSameSymbolsInaRaw(userPassword: String): Boolean{
    //var temp:Char

    for((i,e) in userPassword.withIndex()) {
        if (i == 0 || i == 1) continue
        else{

            if ((userPassword[i-2] == userPassword[i-1]) && ( userPassword[i-1] == userPassword[i])) {
                //println("${userPassword[i-2]} ${userPassword[i-1]} ${userPassword[i]}" )
                return false
            }
        }

    }
    return true
}