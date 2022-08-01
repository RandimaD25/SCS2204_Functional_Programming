import scala.io.StdIn.readLine

def evaluateNumber(num : Int) : String = num match{
    case x if num<0 => "Negative"
    case x if num == 0 => "Zero"
    case x if num%2 == 0 => "Even number is given"
    case x if num%2 == 1 => "Odd number is given"
}

object main extends App{
    printf("Enter number : ");
    val num = readLine()
    print(evaluateNumber(num.toInt) ) 
}