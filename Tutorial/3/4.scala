def discount(n : Double) : Double = n * 24.95 * 0.4
def shippingCost(n : Double) : Double = 
    if(n <= 50){
        3 * n
    }else{
        3 * 50 + (n - 50)*0.75
    }
def wholesaleCost(n : Double) : Double = {24.95 * n - discount(n) + shippingCost(n)}


object main extends App{
    println(wholesaleCost(60))
}