

object PrimeFactors extends App {
  println(result(77))


  def result(number:Int, list:List[Int]= List()): List[Int]={
     for(n <- 2 to number if(number%n == 0)){
        return result(number / n, list :+ n)
     }
    list
  }
}
