fun main(){
printName("Rehema")
    var result= getRemainder(9,8)
    println(result)
    var sum= sum(10,30,40,2)
    println(sum)
    printInterestingfact("eating")

}







fun printName(name: String){
    println("Hello" + " " + name)

}
fun getRemainder(num1:Int,num2:Int):Int{
var modulus = num1 % num2
        return modulus

}
fun sum(a:Int,b:Int,c:Int,d:Int):Int{
    var sum = a+b+c+d
    return sum
}
fun printInterestingfact(fact:String){
    println("I love" + " " + fact)
}
