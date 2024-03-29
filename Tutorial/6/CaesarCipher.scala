object  main extends App{
    //initialize alphabet
    val alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    
    //encryption function
    val encryption = (shift:Int,charac:Char)=>
        if((alphabet.indexOf(charac.toUpper))== -1) charac 
        else alphabet((alphabet.indexOf(charac.toUpper)+shift)% alphabet.size)
    
    //decryption function
    val decryption =(shift:Int,charac:Char)=> {
        if((alphabet.indexOf(charac.toUpper))== -1) charac
        else if((alphabet.indexOf(charac.toUpper)-shift)<0) alphabet((alphabet.indexOf(charac.toUpper)-shift+alphabet.size)% alphabet.size)
        else alphabet((alphabet.indexOf(charac.toUpper)-shift)% alphabet.size)
    }
    
    val Cipher = (func:(Int,Char)=>Char,s:String,shift:Int)=> s.map(func(shift,_))
    //get a string as a user input
    println("Enter String:")
    val str=scala.io.StdIn.readLine()
    println("Message:  "+str)
    
    println("Enter 1-to encrypt message");
    println("Enter 2-to decrypt message");
    val a=scala.io.StdIn.readInt()

    println("Enter Shift Number:")
    var shiftnum=scala.io.StdIn.readInt()
    if(a==1){
        val encrypt = Cipher(encryption, str, shiftnum)
        println("Encrypt message :"+encrypt)
    }
    else{
        val decrypt = Cipher(decryption, str,shiftnum)
        println("Decrypt message :"+decrypt)

    }
    
    

}