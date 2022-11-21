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

enum class ReturnValues {
    SUCCESS,//("проверка пройдена"), //0
    SPACESFOUND, //("пробелы в пароле. их быть не должно"), //1
    INCORRECTRULES, //("не соответвует правилам"), //2
    NODIGITS, // ("нет цифрт"), //3
    NOUPPERLETTERS, //("нет заглавных букв в пароле"), //4
    NOTHREESAMESYMBOLSINARAW //("не должно быть 3 одинаковых символа подряд.*"), //5

}

fun main() {
    val userPassword = readln()
    when (validateUserPassword(userPassword)){
        ReturnValues.SUCCESS -> println("проверка пройдена")
        ReturnValues.SPACESFOUND -> println("пробелы в пароле. их быть не должно")
        ReturnValues.INCORRECTRULES -> println("не соответвует правилам")
        ReturnValues.NODIGITS -> println("нет цифрт")
        ReturnValues.NOUPPERLETTERS -> println("нет заглавных букв в пароле")
        ReturnValues.NOTHREESAMESYMBOLSINARAW -> println("не должно быть 3 одинаковых символа подряд.*")
        //else -> ("ошибка валидации")

    }
}

fun validateUserPassword(userPassword: String): ReturnValues{
    val userPassword = userPassword

    if (!checkPasswordForSpaces(userPassword)) return ReturnValues.SPACESFOUND // "пробелмы в пароле. их быть не должно"
    if (!checkPasswordLength(userPassword)) return ReturnValues.INCORRECTRULES    // "не соответвует правилам"
    if (!checkPasswordForMinOneDigit(userPassword)) return ReturnValues.NODIGITS   // "нет цифр"
    if (!checkPasswordForMinOneUppercaseLetter(userPassword)) return ReturnValues.NOUPPERLETTERS    // "нет заглавных букв в пароле"
    if (!checkForTreeSameSymbolsInaRaw(userPassword)) return ReturnValues.NOTHREESAMESYMBOLSINARAW    // "не должно быть 3 одинаковых символа подряд.*"

    return ReturnValues.SUCCESS  // проверка пройдена
}


fun checkPasswordForSpaces(userPassword: String): Boolean{
    return " " !in userPassword
}


fun checkPasswordLength(userPassword: String): Boolean{
    val tempRange = 6..50
    return tempRange.contains(userPassword.length)
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