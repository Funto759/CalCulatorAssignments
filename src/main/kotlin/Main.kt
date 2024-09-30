import java.sql.DriverManager.println
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

   println("Enter First Number: ")
   val num1 = scanner.nextDouble()

   println("Enter Second NUmber: ")
   val num2 = scanner.nextDouble()

   println("Enter an operator (+,-,*,/): ")
   val operator = scanner.next()[0]

   val result : Double = when(operator){
      '+' -> num1 + num2
      '-' -> num1 - num2
      '*' -> num1 * num2
      '/' -> num1 / num2
      else -> {
         kotlin.io.println("Error! Operator not correct")
         return
      }
   }

   kotlin.io.println("$result")
}