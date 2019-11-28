  object Miscellaneous extends App {

  implicit val quantity = 10
  implicit val donuttype = "Donuts"

  def totalCost (name: String, couponCode: Option[String])(implicit quantity: Int): Double= {
    couponCode match {
      case Some(coupon) =>
        val discount = 0.1
        val totalCost = 2.50 * quantity *(1 - discount)
        totalCost

      case None => 2.50 * quantity
    }
  }

    println(totalCost("Butter Donut", Some("ccccc")))

    def totalCostWithDiscountFunctionParameter(implicit donutType: String,quantity: Int,f: Double => Double): Double = {
      println(s"Calculating total cost for $quantity $donutType")
      val totalCost = 100.0 * quantity
      f(totalCost)
    }
    implicit def applyDiscount(totalCost: Double): Double = {
      val discount = 50
      totalCost - discount
    }
    def applyMyDiscount(totalCost: Double): Double = {
      totalCost match {
        case tc if tc<500  => tc
        case tc if tc<1000 => tc-tc*0.05
        case tc if tc<3000 => tc-tc*0.10
        case tc if tc<5000 => tc-tc+0.15
        case tc if tc>5000 => tc-tc+0.25
      }
    }
    println(s"Total cost of your donut dype with discount def function = ${
      totalCostWithDiscountFunctionParameter(donuttype, 20, applyDiscount(_))}")

}
