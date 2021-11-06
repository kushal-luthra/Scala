object scalaLearning1 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  
  // Topic 1
  // val vs var
  // val = static value - cannot be reassigned a new value
  // var = variable can be reassigned a new value
  var a: Int = 5;                                 //> a  : Int = 5
  println(a)                                      //> 5
  
  // Topic 2
  // Data Types in Scala
  
  var b: String = "hello"                         //> b  : String = hello
  b =  "hi"
  println(b)                                      //> hi
  
  // 2: data types in Scala
  // Typeinference -- here we dont give data type; Scala Complier itself infers it.
  val numberOne = 5                               //> numberOne  : Int = 5
  val numberTwo: Int = 10                         //> numberTwo  : Int = 10
  
  var c = true                                    //> c  : Boolean = true
  // Note you cannot reassign value to a different data type in scala
  
  val d: Char = 'a'                               //> d  : Char = a
  val pi: Double = 3.1415                         //> pi  : Double = 3.1415
  
  // For float we give 'f'
  val SinglePrecision: Float = 3.1415f            //> SinglePrecision  : Float = 3.1415
  
  // For Long, we give 'l' suffix
  val e: Long = 12345678911111l                   //> e  : Long = 12345678911111
  
  // Byte can hold from -128 to 127
  val smallNumber : Byte = 127                    //> smallNumber  : Byte = 127
  
  val assignString: String = ""                   //> assignString  : String = ""
  println("combined results - a=" + a + " b=" + b + " c=" + c + " d=" + d + " pi=" + pi+" e=" + e+" smallNumber="+smallNumber)
                                                  //> combined results - a=5 b=hi c=true d=a pi=3.1415 e=12345678911111 smallNumb
                                                  //| er=127
                                                  
                                                  
  // Topic 3
  // s interpolation, f interpolation and raw interpolation
	// s interpolation = string interpolation
	var name : String = "Kushal"              //> name  : String = Kushal
	println(s"Hello $name how are you?")      //> Hello Kushal how are you?
	
	// f interpolation - to handle precision of values - similar to printf in C
	println(f"value of pi is $pi.2f")         //> value of pi is 3.1415.2f
  
  // raw interpolatoin - to treat data in raw form - no formatting to be done like treating escape, new line characters etc
  println(raw"hello how \n are you?")             //> hello how \n are you?
 
 
 // Topic 4
 // String Comparison using '==' operator
 val v1 : String = "kushal"                       //> v1  : String = kushal
 val v2 : String = "kushal"                       //> v2  : String = kushal
 // As you see below, Scala automatically infers below value to be of Boolean type
 val v3 = v1==v2                                  //> v3  : Boolean = true
 // In java, '==' is used as reference comparison operator. To compare 2 strings, we have 'equals' method
 // In Scala, '==' is used as String Comparison operator
 
 
 // Topic 5 : If=Else statements
 if (1<3)
 {
 	println("hello")
 	}
 else
 {
 	println("hi")
 	}                                         //> hello
 
 // Topic 6 : Match Case in Scala  or Case When in Scala
 // Note the '=>' in case when below
 var v4 : Int = 5                                 //> v4  : Int = 5
 v4 match {
 case 1 => println("one")
 case 2 => println("two")
 case 3 => println("three")
 case _ => println("something else")
 }                                                //> something else
 
 // Topic 7: for loop
 for (v5 <- 1 to 10){
 var squared=v5*v5
 println(squared)
 }                                                //> 1
                                                  //| 4
                                                  //| 9
                                                  //| 16
                                                  //| 25
                                                  //| 36
                                                  //| 49
                                                  //| 64
                                                  //| 81
                                                  //| 100
 
 // Topic 8: While Loop
 var v6 = 0                                       //> v6  : Int = 0
 while (v6<=10){
 println(v6)
 v6=v6+1
 }                                                //> 0
                                                  //| 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
                                                  //| 6
                                                  //| 7
                                                  //| 8
                                                  //| 9
                                                  //| 10
 
 // Topic 9: Do While Loop : Executed at least once - even if condition not met
 var v7 = 0                                       //> v7  : Int = 0
 do {
 println(v7)
 v7=v7+1
 } while(v7<=10)                                  //> 0
                                                  //| 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
                                                  //| 6
                                                  //| 7
                                                  //| 8
                                                  //| 9
                                                  //| 10
 
 
 // Writing on same line -- separator is Semi Colon
 {
 var v8=10; v8=v8+20; println(v8)
 }                                                //> 30
 
 // Topic : Block statements -- Last value is returned value in block
{
 var v9=10
 v9=v9+20
 7					// Returns '7'
}                                                 //> res0: Int = 7
 
// We can assign output of block to a variable
var v10 = {
 var v9b=10
 v9b=v9b+20
 7					// Returns '7'
}                                                 //> v10  : Int = 7
println(v10)                                      //> 7

println({val x=10; x+20})                         //> 30
 

 
}
