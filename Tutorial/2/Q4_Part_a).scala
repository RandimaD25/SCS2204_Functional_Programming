//scala version 3 code

def normalPay(workingHours : Int) : Double = workingHours*250

def OTPay(OTHours : Int) : Double = OTHours*85

def tax(salary : Double) : Double = salary*0.12

def takeHomeIncome(workingHours : Int, OTHours : Int) : Double = {
    val salary = normalPay(workingHours) + OTPay(OTHours)
    salary - tax(salary)
}

object main extends App{
    printf("%s %s","Take Home Income = Rs.",takeHomeIncome(40, 30))
}