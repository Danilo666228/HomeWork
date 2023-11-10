import java.lang.StringBuilder

fun main()
{
  println("Задача 1. Введите строку:")
  val input1 = readLine()
  if (!input1.isNullOrBlank()) {
    val result1 = countConsecutiveCharacters(input1)
    println("Результат: $result1")
  } else {
    println("Ошибка: введена пустая строка")
  }

  println("Задача 2. Введите строку:")
  val input2 = readLine()
  if (!input2.isNullOrBlank()) {
    val result2 = countDistinctCharacters(input2)
    println("Результат: $result2")
  } else {
    println("Ошибка: введена пустая строка")
  }

  println("Задача 3. Введите натуральное число:")
  val input3 = readLine()
  if (input3 != null && input3.toIntOrNull() != null && input3.toInt() > 0) {
    val result3 = convertToBinary(input3.toInt())
    println("Результат: $result3")
  } else {
    println("Ошибка: введено некорректное число")
  }
}

fun countConsecutiveCharacters(input: String): String {
  val result = StringBuilder()
  var count = 1

  for (i in 0 until input.length - 1) {
    if (input[i] == input[i + 1]) {
      count++
    } else {
      if (count > 1) {
        result.append(input[i])
        result.append(count)
      } else {
        result.append(input[i])
      }
      count = 1
    }
  }

  if (count > 1) {
    result.append(input.last())
    result.append(count)
  } else {
    result.append(input.last())
  }

  return result.toString()
}

fun countDistinctCharacters(input: String): String {
  val charCountMap = LinkedHashMap<Char, Int>()

  for (char in input) {
    charCountMap[char] = charCountMap.getOrDefault(char, 0) + 1
  }

  val result = StringBuilder()
  charCountMap.toSortedMap().forEach { (char, count) ->
    result.append("$char - $count\n")
  }

  return result.toString()
}

fun convertToBinary(decimal: Int): String {
  return Integer.toBinaryString(decimal)
}

/*import java.util.*
fun main()
{
  // Задача 4
  println("Задача 4.\nВведите два числа и символ операции, разделяя их пробелом:")
  val input4 = readLine()
  if (input4 != null) {
    val inputParts = input4.split(" ")
    if (inputParts.size == 3) {
      try {
        val num1 = inputParts[0].toDouble()
        val num2 = inputParts[1].toDouble()
        val operation = inputParts[2]
        val result4 = when (operation) {
          "+" -> num1 + num2
          "-" -> num1 - num2
          "*" -> num1 * num2
          "/" -> num1 / num2
          else -> throw IllegalArgumentException("Недопустимый символ операции")
        }
        println("Результат: $result4")
      } catch (e: NumberFormatException) {
        println("Ошибка: Введите только числа для операндов")
      } catch (e: IllegalArgumentException) {
        println("Ошибка: ${e.message}")
      }
    } else {
      println("Ошибка: Введите ровно два числа и один символ операции, разделенных пробелом")
    }
  } else {
    println("Ошибка: Ввод пустой строки")
  }

  // Задача 5
  println("Задача 5.\nВведите целое число n и основание степени x, разделяя их пробелом:")
  val input5 = readLine()
  if (input5 != null) {
    val inputParts = input5.split(" ")
    if (inputParts.size == 2) {
      try {
        val n = inputParts[0].toInt()
        val x = inputParts[1].toInt()
        if (n < 0 || x < 2) {
          println("Ошибка: Число n должно быть неотрицательным, а основание x должно быть больше или равно 2")
        } else {
          val result5 = findIntegerPower(n, x)
          println(result5)
        }
      } catch (e: NumberFormatException) {
        println("Ошибка: Введите целые числа для n и x")
      }
    } else {
      println("Ошибка: Введите ровно два целых числа, разделенных пробелом")
    }
  } else {
    println("Ошибка: Ввод пустой строки")
  }

  // Задача 6
  println("Задача 6.\nВведите две различных цифры:")
  val scanner = Scanner(System.`in`)
  val num1 = scanner.nextInt()
  val num2 = scanner.nextInt()
  if (num1 == num2) {
    println("Ошибка: Введите две различных цифры")
  } else {
    val result6 = if ((num1 + num2) % 2 == 1) {
      "Можно создать нечетное число: ${num1 + num2}"
    } else {
      "Создать нечетное число невозможно"
    }
    println(result6)
  }
}

fun findIntegerPower(n: Int, x: Int): String {
  var y = 0
  var result = ""
  while (Math.pow(x.toDouble(), y.toDouble()) <= n) {
    if (n % Math.pow(x.toDouble(), y.toDouble()) == 0.0) {
      result = "Целочисленный показатель степени: $y"
      break
    }
    y++
  }
  if (result.isEmpty()) {
    result = "Целочисленный показатель не существует"
  }

  return result
}*/