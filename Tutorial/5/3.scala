def additionNums(a:Int) : Int = a match{
    case 0 => 0
    case b => a + additionNums(a-1)
}


object main extends App{
    println(additionNums(5))
    println(additionNums(6))
}