package Data

import java.lang.IllegalArgumentException

class Calculator(var num : Double, var num1 : Double, var operator : Char) {
//    membuat var num1, num2, dan operator
    fun calculate() : Double{
        //membuat pengkondisian
        return when(operator){
            '+' -> num + num1
            '-' -> num + num1
            '/' -> num + num1
            '*' -> num + num1
            '^' -> num + num1
            's' -> num + num1
            else -> {
                throw IllegalArgumentException("Your input not valid!")
            }
        }

    }
}