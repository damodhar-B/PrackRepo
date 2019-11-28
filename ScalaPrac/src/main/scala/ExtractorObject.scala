import scala.util.Random

object CustomerID extends App {

  def apply(name: String) = s"$name--${Random.nextLong}"

  val customer1ID = CustomerID("Sukyoung")  // Sukyoung--23098234908
  println(customer1ID)
}

