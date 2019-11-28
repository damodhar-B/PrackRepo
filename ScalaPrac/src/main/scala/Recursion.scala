object Recursion extends App {

  def listOfDuplicates(x: AnyVal, length: Int): List[AnyVal] = {
    if (length < 1)
      Nil
    else
      x :: listOfDuplicates(x, length - 1)
  }

 println(listOfDuplicates(45, 3))

}
