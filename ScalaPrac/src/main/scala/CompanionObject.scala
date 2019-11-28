class Donut1(name: String, productCode: Long){

  def print = println(s"Donut name = $name, productCode = $productCode")

}
object Donut1 {
    def apply(name: String, productCode: Long): Donut1 = {
      new Donut1(name, productCode)
    }
//  val xyz = new Donut1("",1111)
//  xyz.print


}


object  TestDonut extends App {

    val glazedDonut = Donut1("Glazed Donut", 1111)
    val vanillaDonut = Donut1("Vanilla Donut", 2222)

    println("\nStep 4: How to call function on each Donut object")
    glazedDonut.print
    vanillaDonut.print


}