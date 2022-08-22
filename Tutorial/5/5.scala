def isEven(num: Int) : Boolean = {
    if (num == 0) {
        return true;
    } else if (num == 1) {
        return false;
    } else {
        return isEven(num - 2);
    }
}

def evenAddtion(n: Int, maxN: Array[Int] = Array()) : Int =  {

    if(n == 0) {
        return 0;
    } else if (isEven(n) && maxN.isEmpty) {
        val newMaxN  = Array(n);
        return evenAddtion(n - 1, newMaxN);
    } else if (isEven(n) && !maxN.isEmpty) {
        return n + evenAddtion(n - 1, maxN); }
     else {
        return evenAddtion(n - 1, maxN);
    }
}


object main extends App{
    println(evenAddtion(10))

}