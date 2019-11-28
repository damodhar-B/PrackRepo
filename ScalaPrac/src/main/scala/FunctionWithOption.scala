object FunctionWithOption extends App {

  def totalCost(name: String, quantity: Int, couponCode: Option[String]): Double= {
    couponCode match {
      case Some(coupon) =>
        val discount = 0.1
        val totalCost = 2.50 * quantity *(1 - discount)
        totalCost

      case None => 2.50 * quantity
    }

  }

  def donutTotalCost(name:String, quantity:Int):Double={

    def dailyCouponCode(): Option[String] = {
      val couponFromDb = "COUPON_1234"
      Option(couponFromDb).filter(_.nonEmpty)
    }
    dailyCouponCode() match {
      case Some(coupon) =>
        val discount = 0.2
        val totalCost = 3 * quantity *(1 - discount)
        totalCost

      case None => 3 * quantity
    }

  }

  println(totalCost("Butter Donut", 10, Some("NOVEMBER_20")))
  println(donutTotalCost("Butter Donut", 10))

}
