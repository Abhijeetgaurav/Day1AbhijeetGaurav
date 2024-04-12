package abhijeet_gaurav

class PrimeNumber {

  def isPrime(num: Int): Boolean = {
    if (num <= 1) return false
    if (num == 2) return true

    for (i <- 2 until num) {
      if (num % i == 0) return false
    }
    true
  }

  def FindNthPrimeNumber(n: Int): Option[Int] = {
    if (n <= 0) {
      None
    } else {
      var count = 0
      var number = 2

      while (count < n) {
        if (isPrime(number)) {
          count += 1
          if (count == n) return Some(number)
        }
        number += 1
      }
      None
    }
  }
}

object Main extends App {
  val primenumber = new PrimeNumber()

  val n = 10
  val result = primenumber.FindNthPrimeNumber(n)

  result match {
    case Some(prime) => println(s"The $n-th prime number is: $prime")
    case None => println("Invalid input for n")
  }
}
