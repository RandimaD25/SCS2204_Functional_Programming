object main extends App{

val encrypt = (character: Char, shift: Int)  => {

    val charAsInt = character.toInt;
    val shiftedInt = charAsInt + shift;
    val encryptedChar = shiftedInt.toChar
    encryptedChar;
}

val decrypt = (character: Char, shift: Int) => {

    val charAsInt = character.toInt;
    val shiftedInt = charAsInt - shift;
    val encryptedChar = shiftedInt.toChar
    encryptedChar;
}

    val cipher = (secret: String, shift: Int, mode: (Char, Int) => Char) => secret.map(mode(_, shift))
    println(cipher("ABCD", 1, encrypt))   
    println(cipher("Randima", 4, encrypt))    
    println(cipher("CDEF", 2, decrypt))    



}