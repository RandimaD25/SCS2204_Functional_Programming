//scala version 3 code

def profit(ticketPrice: Int): Int = {
    income(ticketPrice) - cost(ticketPrice)
}

def cost(ticketPrice: Int) : Int = {
    500 + 3 * Attendees(ticketPrice)
}

def income(ticketPrice: Int) : Int = {
    ticketPrice * Attendees(ticketPrice)   
}

def Attendees(ticketPrice: Int): Int = {
    val difference = ticketPrice - 15
    val factor = difference / 5
    val newCount = 20*factor
    120 - newCount
}

object main extends App{
    println(profit(5));
    println(profit(10));
    println(profit(15));
    println(profit(20));
    println(profit(25));    
    println(profit(30));
    println(profit(35));
    println(profit(40));
    println(profit(45));








    
}
