
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
//Задача 5
//fun main() {
//    println("Введите целое число n:")
//    val n = readLine()?.toInt() ?: return
//
//    println("Введите основание степени x:")
//    val x = readLine()?.toInt() ?: return
//
//    var y = 0
//    var stepen = 1
//    while (stepen < n) {
//        stepen *= x
//        y++
//    }
//
//    if (stepen == n) {
//        println("Целочисленный показатель y = $y")
//    } else {
//        println("Целочисленный показатель не существует")
//    }
//}
//Задание 6
//fun main() {
//    println("Введите первое число:")
//    val num1 = readLine()!!.toInt()
//    println("Введите второе число:")
//    val num2 = readLine()!!.toInt()
//
//    if (num1 != num2 && (num1 % 2 != 0 || num2 % 2 != 0)) {
//        println("Можно создать нечетное число")
//    } else {
//        println("Создать нечетное число невозможно")
//    }
//}
//Тема: Массивы.
//Задача 1.
fun main() {
    println("Введите кол-во строк в массиве: ")
    val rows = readln()!!.toInt()

    println("Введите кол-во столбцов в массиве: ")
    val cols = readln()!!.toInt()

    val array = Array(rows) { IntArray(cols) }

    println("Введите $rows * $cols трехзначных чисел, разделяя каждое число нажатием Enter: ")
    for (i in 0 until rows) {
        for (j in 0 until cols) {
            array[i][j] = readln()!!.toInt()
        }

    }
    val flatArray = array.flatMap { it.toList() }.flatMap { it.toString().toList() }
    val uniqueDigits = flatArray.distinct().count()
    println("Двумерный массив: ")
    for (i in array) {
        for (j in i) {
            print("$j\t")
        }
    }
    println("В массиве использовано $uniqueDigits уникальных чисел")


}
