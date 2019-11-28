object ScalaTest1 extends App {

  println("please enter some integer value")
  val a = scala.io.StdIn.readInt()
  println(" here is the result  "+getResult3(a))
  def getResult(x:Int): String = x match {
     case x if (x%5 ==0 | x%3==0) => "fizzbuzz"
     case x if (x%5 == 0) => "buzz"
     case x if (x%3 == 0) => "fizz"
     case _ => "x"
    }

  def getResult1(x:Int): String = (x%5 , x%3) match {
    case (0, 0) => "fizzbuzz"
    case (0, _) => "buzz"
    case (_, 0) => "fizz"
    case _ => "x"
  }

  def getResult2(x:Int): String = {
    if (x%5 ==0 | x%3==0) "fizzbuzz"
    else if (x%5 == 0) "buzz"
    else if (x%3 ==0) "fizz"
    else return "x"
  }

  def getResult3 (x: Int) = {
    List(("fizzbuzz", 15),("fizz", 3), ("buzz", 5)).find(x % _._2 == 0).map {case (a,b) => a}.getOrElse(x).toString()
  }




}
