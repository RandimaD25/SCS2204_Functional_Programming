def isEven(n:Int) : Boolean = n match{
    case 0 => true
    case _ => isOdd(n-1)
}

def isOdd(n:Int) : Boolean = !(isEven(n))

object main extends App{
    println(isEven(5))
    println(isEven(4))
    println(isOdd(2))
    println(isOdd(1))

}