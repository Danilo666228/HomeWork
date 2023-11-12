//Тема 1: Основные задачи
//Задача 1
//fun main() {
//    val input = readLine()!!
//    var result = " "
//    var count = 1
//    for (i in 0 until input.length - 1) {
//        if (input[i] == input[i + 1]) {
//            count++
//        } else {
//            if (count > 1) {
//                result += "${input[i]}$count"
//            } else {
//                result += "${input[i]}"
//            }
//            count = 1
//        }
//    }
//    if (count > 1) {
//        result += "${input[input.length - 1]}$count"
//    } else {
//        result += "${input[input.length - 1]}"
//    }
//    println(result)
//}
//Задача 2
//fun main() {
//    print("Введите строку: ")
//    val input = readLine()!!
//    val mass = IntArray(256)
//    for (i in input) {
//        mass[i.toInt()]++
//    }
//    for(c in 'A'.toInt()..'Z'.toInt())
//    {
//        if(mass[c]>0)
//        {
//            println("${c.toChar()}-${mass[c]}")
//        }
//    }
//
//}
//Задача 3
//fun main() {
//    print("Введите натуральное число: ")
//    val number = readLine()!!.toInt()
//
//    var sum = number
//    var result = ""
//
//    while (sum > 0) {
//        val ostatok = sum % 2
//        result = "$ostatok$result"
//        sum /= 2
//    }
//
//    println("Число $number в двоичной системе: $result")
//}
