object Miscellaneous1 extends App {

  val bag = List("1", "2", "foo", "3", "bar")
//  val sum = bag.flatMap(toInt).sum
  def fo(i: Any): Option[Any] = Some(i)

  println(fo())
/*implicit*/
    def multiply(implicit by: Int) = 20 * by
      implicit val multiplier = 2
      println(multiply)

  def multiply1(by: Int = 2) = 20 * by
  println(multiply1())

//VARARGS
      def printAll(strings: String*) {
        strings.map(println)
//        for(a <- strings){
//          println(a)
//        }
      }
      printAll("foo", "bar", "dany", "damu")

  def sum(a :Int, b :Int, args: Int*) : Int =
  {
    var result = a + b
    for(arg <- args)
    {
      result += arg
    }
    return result
  }
  println("Sum is: " + sum(5, 3, 1000, 2000, 3000))




  println("Step 1: How to initialize a Map with 3 elements")
  val map1: Map[String, String] = Map(("PD","Plain Donut"),("SD","Strawberry Donut"),("CD","Chocolate Donut"))
  println(s"Elements of map1 = $map1")

}
