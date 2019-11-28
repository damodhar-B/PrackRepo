object HigherOrder extends App {

  def totalCostAfterDiscount(name:String, quantity: Int): Unit ={
    println(s"Calculating total cost for $quantity $name")
    val totalCost = 2.50 * quantity

  }


  def totalCostWithDiscountFunctionParameter(donutType: String)(quantity: Int)(f: Double => Double): Double = {
    println(s"Calculating total cost for $quantity $donutType")
    val totalCost = 2.50 * quantity
    f(totalCost)
  }
  println("\nStep 2: How to define and pass a def function to a higher order function")
  def applyDiscount(totalCost: Double): Double = {
    val discount = 2
    totalCost - discount
  }
  println(s"Total cost of 5 Glazed Donuts with discount def function = ${
    totalCostWithDiscountFunctionParameter("Glazed Donut")(5)(applyDiscount(_))}")



}
