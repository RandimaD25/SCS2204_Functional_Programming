object main extends App{

  class Account(id: String, n: Int, b: Double){
    val NIC:String = id
    val acnumber:Int = n
    var Balance:Double = b

    override def toString = "NIC : "+NIC+"   Acc. NO : "+acnumber+"   Balance : "+Balance

  }
  val acc1= new Account("995452219v",1338982,76500)
  val acc2= new Account("925622324v",1339876,-5000)
  val acc3= new Account("912233946v",1338972,45500)
  val acc4= new Account("887653208v",1339875,-20000)

  var bank:List[Account]=List(acc1,acc2,acc3,acc4)

  val overdraft = bank.filter(x=>x.Balance<0)
  val balance = bank.map((x)=>(x.Balance)).reduce((x,y)=>(x+y))
  val interest = (b:List[Account])=>b.map((x) => (x.NIC,x.acnumber,if(x.Balance>0)  (x.Balance+(x.Balance*0.5)) else (x.Balance+(x.Balance*0.1)) ))

  println("List of Account with negative balances : " + overdraft)
  println("Sum of all accounts : Rs:" + balance)
  println("Final balances of all accounts after apply the interest function : " + interest(bank))
}