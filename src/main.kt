fun main(){
    var name ="akirachix"
    var x =name[0].toString()+name[2]+name[3]
    println(x)

    var p=word("Ephy",20)
    println(p)
    var s=mine("meters")
    println(s.length)
    var j=info("phiona")

}
fun word(Name: String,age: Int):String{
    var word=("Hi my name is $Name and I am $age years old.")
    return word
}
fun mine(name: String):String{
    var s="$name"
    return s
}
fun info(name: String){
    if(name=="phiona")
        println("That's me.")
    else
        println("i dont know who that is")
}




