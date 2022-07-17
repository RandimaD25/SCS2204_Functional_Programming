def easyPace(x : Double) : Double = x*8
def tempo(y : Double) : Double = y*7

object main extends App{
    println(easyPace(2) + tempo(3) + easyPace(2))
}