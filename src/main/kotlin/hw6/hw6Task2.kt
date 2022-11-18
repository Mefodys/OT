package hw6

/*
https://github.com/otuskotlin/202209-okb-homework/blob/main/HW-6/Task-2.md
На вход подается Данно 2 иммутабельных массива данных. Нужно реализовать 3 подзадачи:

1) Нужно "склеить" два массива, т.е. получить 3-ий массив,
в котором сначала идут значения из первого, а потом из второго.

2) Нужно "вычесть" два массива. т.е. получить 3-ий массив,
в котором есть все элементы из первого, кроме тех, которые есть во втором.

3) Нужно "пересечь" два массива, т.е.получить 3-ий массив,
в котором все элементы находятся сразу и в первом и во втором массивах

На вход каждой подзадачи подается две строки.
Ответ на каждую задачу должен содержать строку с результатом.
*/

fun main() {
    val myArr1 = arrayOf<String>(readln())
    val myArr2 = arrayOf<String>(readln())

    val result1 = glue(myArr1, myArr2)
    println(result1)

    val result2 = separate(myArr1, myArr2)
    println(result2)

    val result3 = inters(myArr1, myArr2)
    println(result3)

}

//нужно "склеить" два массива, т.е. получить 3-ий массив,
// в котором сначала идут значения из первого, а потом из второго.
fun glue(arr1: Array<String>, arr2: Array<String>): CharArray {
    return arr1
        .plus(arr2)
        .joinToString(separator = "")
        .toCharArray()
}

//Нужно "вычесть" два массива. т.е. получить 3-ий массив,
// в котором есть все элементы из первого, кроме тех, которые есть во втором.
fun separate(arr1: Array<String>, arr2: Array<String>): CharArray{
    val temp1 = arr1.joinToString().toList()
    val temp2 = arr2.joinToString().toList()

    return temp1.subtract(temp2).toCharArray()
}


//Нужно "пересечь" два массива, т.е.получить 3-ий массив,
//в котором все элементы находятся сразу и в первом и во втором массивах
fun inters(arr1: Array<String>, arr2: Array<String>): CharArray{
    val temp1 = arr1.joinToString().toList()
    val temp2 = arr2.joinToString().toList()

    return temp1.intersect(temp2).toCharArray()
}