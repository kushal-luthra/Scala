object scalaLearning4 {

	// Topic 1: Scala Functional Programing session 1
  println("Welcome to the Scala Functional Programing session 1")
                                                  //> Welcome to the Scala Functional Programing session 1
  //what is scala?
  // Scala is a hybrid programming language (oops + functional programming)
  // functional aspect is the one we will be concentrating more on.
  
  // why scala?
  // It supports Functional programming
  // it gives scripting approach which makes it easy to write concise codes. That is 100s of lines of java can be replaced with 20-30 lines of Scala.

	// 2 modes of writing scala code -
	// 1. REPL - interactive manner
	// 2. IDE - in eclipse, and then bundle as jar
  
  // What is a functional programming language.
  // Any programing lanugage that supports pure functions and immutable values
  // Note: functional programming is a very good fit when we talk about library design and data crunching activities
  // This is why Spark developers used Scala to create Spark libraries.
  
  
  // what is a function?
  // a function relates an input to a output.
  // a = sqrt(4)
  // a = 2
  // input is 4
  // output is 2
  // relationship between input and output is nothing but code of sqrt.
  
  // what is a pure function?
  // It has 3 properties -
  // a. the input solely determines the output
  // 	var a = 5;
  // def func(i: Int):Int = {return a+i} -> impure function -- it depends on external variable 'a' and not just input variable 'i'
  // def func(i: Int, a:Int):Int = {return a+i} -> pure function
  // dollars to rs
  // dollarsToRs(40) -- conversion is not dependent on just input value 40 but also on other factor -- so not a pure function.
  // 2800 RS
  // 2900 RS
  
  // b. the function doesnt change its input value
  // def func1(a: Int) = { a = a+1; return a} -> impure as we are changing Input variable 'a'
  // def func1(a: Int) = {return a+1} ->pure function
  

  // c. there are no side effects, this means the function only do whatever it is intended for. It does not do anything extra.
  // def func1(a: Int) = {println(“hello”); return a} -->  impure function because there is a side effect - printing value hello which is not its purpose.
  // def func1(a: Int) = {return a} //      pure function
  
  
  // Topic 2: Scala Functional Programing session 2
  println("Welcome to the Scala Functional Programing session 2")
                                                  //> Welcome to the Scala Functional Programing session 2
  
  // 1. what is a pure function3 characteristics:.
  // a. A pure function is only dependent on its input parameter. No external variable impacts the result.
  // b. A pure function should not change its input parameter.
  // c. A pure function should not have any side effects
	
	// 2. Is there any easy way to test the purity of a function?
	// Ans - thru Referential Transparency.
	// A function is referentialy transparent if replacing the function with a value do not impact the result.
	// sqrt(4)  sqrt(9) - referentially transparent / pure                  3
	//      2        3
	// dollarsToRS(40) - not referentially transparent / not pure -- we canot replace this function with a fixed value
	
	
	// 3. First class function
	// Whatever we were able to do with values in traditional programming, same thing we should be able to do with the functions as well.
	// That is we should be able to treat functions like values.
	
	// 3 characteristics of First Class Fucntions -
	// a. we should be able to assign a function to a variable.
	var a: Int = 5                            //> a  : Int = 5
	def doubler(i: Int): Int = { i * 2}       //> doubler: (i: Int)Int
	var b = doubler(_)                        //> b  : Int => Int = scalaLearning4$$$Lambda$8/998351292@64616ca2
	b(2)                                      //> res0: Int = 4
	
	// b. we should be able to pass a function as parameter to the function
	def tripler(i: Int): Int = { i * 3 }      //> tripler: (i: Int)Int
	def func(i: Int , f:Int => Int ) = {f(i)} //> func: (i: Int, f: Int => Int)Int
	func(5,tripler)                           //> res1: Int = 15
	
	// c. we should be able to return a function from a function
	def func1 = {
	x:Int => x * x
	}                                         //> func1: => Int => Int
	func1(4)                                  //> res2: Int = 16
	
	
  // 4. Higher order function
  // A function which either takes a function as input parameter or returns another function as its output.
  // eg- map function is a higher order function -  if we have n input rows, then we will get n output rows also.
  var a1 = 1 to 10                                //> a1  : scala.collection.immutable.Range.Inclusive = Range 1 to 10
  def doubler1(i: Int): Int = {i * 2}             //> doubler1: (i: Int)Int
  a1.map(doubler1)                                //> res3: scala.collection.immutable.IndexedSeq[Int] = Vector(2, 4, 6, 8, 10, 1
                                                  //| 2, 14, 16, 18, 20)
 
 
 // 5. Anonymous function
 // A function without a name.
 var a2 = 1 to 10                                 //> a2  : scala.collection.immutable.Range.Inclusive = Range 1 to 10
 def doubler2(i: Int):Int = {i * 2}               //> doubler2: (i: Int)Int
 a2.map(doubler2)                                 //> res4: scala.collection.immutable.IndexedSeq[Int] = Vector(2, 4, 6, 8, 10, 1
                                                  //| 2, 14, 16, 18, 20)
 // Same function above can be called using below syntax.
 a2.map(x => x * 2)                               //> res5: scala.collection.immutable.IndexedSeq[Int] = Vector(2, 4, 6, 8, 10, 1
                                                  //| 2, 14, 16, 18, 20)
 // in python the same thing is called as lambdas
 
 
 // 6. Immutability
 // we cannot change the value.
 // But immutability is more preferred.
 // var a = 5; a = 6
 // val b = 7; b = 8; -- val is preferred over var i.e. preferenc is for immutability.
 
  
  
 // 7. Loop vs recursion vs tail recursion
 // eg - find factorial of a number
 
 
 // loop -- issue - chinaging value of i * result (muatbilty affected) -- we prefer immutability. So use recursion/tali recursion.
 def factorial1(input: Int): Int = {
 var result: Int = 1
 for(i <- 1 to input)
 {result = result * i}
 result
 }                                                //> factorial1: (input: Int)Int
 
 // recursion
def factorial2(input: Int): Int = {
if (input == 1) 1
else input * factorial2(input-1)
}                                                 //> factorial2: (input: Int)Int
factorial2(5)                                     //> res6: Int = 120
5 * factorial2(4)                                 //> res7: Int = 120
5 * 4 * factorial2(3)                             //> res8: Int = 120
5 * 4 * 3 * factorial2(2)                         //> res9: Int = 120
5 * 4 * 3 * 2 * factorial2(1)                     //> res10: Int = 120
5 * 4 * 3 * 2 * 1                                 //> res11: Int = 120
  
// Tail recursion - in recursion multiplication of all values done at end i.e. at point when it reaches input value 1 -- not recommended. Soln - tail recursion.
def factorial3(input: Int , result: Int): Int = {
	if(input == 1) result
	else factorial3(input-1,result*input)
}                                                 //> factorial3: (input: Int, result: Int)Int
factorial3(1,24)                                  //> res12: Int = 24
// what tail recursion says is that the recursive call should be the last statement in the function

// Statement Vs Expression
// Each line in a code block is a Statement.
// Expression is a line of code that returns something. In scala we do not have statements and we have only expressions.
// That means each statement returns something.

// eg 1 - println() -- see below - return Type is Unit() ~ void() in java.
val e1 = println("hello world")                   //> hello world
                                                  //| e1  : Unit = ()

// eg2 - If else block - last line is return type
val e2 = 5                                        //> e2  : Int = 5
var e3 = 0                                        //> e3  : Int = 0

if (e2==5) {
e3 = 2
}
else {
e3 = 7
}
println(e3)                                       //> 2

// Above statement can be replaced with use of expressions -
var e4 = if (e2==5) 2 else 7                      //> e4  : Int = 2
println(e4)                                       //> 2



// Topic 3: Scala Functional Programing session 3
 println("Welcome to the Scala Functional Programing session 3")
                                                  //> Welcome to the Scala Functional Programing session 3
                                                  
// 1. Closure -
// when a value or a particular state is bound to a function, it is acting as a closure.
// eg 1 -
def areaOfCircle = { val pi = 3.14; (x:Int)=> pi*x*x }
                                                  //> areaOfCircle: => Int => Double
                                                  
areaOfCircle(10)                                  //> res13: Double = 314.0

val pi = 4.14                                     //> pi  : Double = 4.14

// even if we change value of pi above,
// the actual value of pi being used is the one inside function defintion. Such value is the state that is bound to this function.
areaOfCircle(10)                                  //> res14: Double = 314.0
                
// 2. Scala Type System -
/*
At top of hierarchy is 'Any' type. This is subdivided into AnyVal and AnyRef.

AnyVal -
	Byte
	Short
	Int
	Long
	Float
	Double
	Unit - when no data is to be returned, then psuedo type return is Unit - eg println('hello world') returns Unit type.
	Boolean - true or false
	Char - ‘a’
	
AnyRef these are collection types or string type. When you create a class, it inherits AnyRef.
	List
	Seq
	Tuple
	String
	
	2 special types.
	Null - is valid only for reference types (AnyRef). It inherits every class in AnyRef.
	Nothing
	
*/

// Return Type for a function  - in a statement, value is promoted to highest value type common between all data types involved.
// But if no commom data type, then parent data typeis called.


val x1 = println("hi")                            //> hi
                                                  //| x1  : Unit = ()
val x2 = 5                                        //> x2  : Int = 5
val x3 = if (x2 == 5) 1 else 2.0                  //> x3  : Double = 1.0
// below x5 is of type Unit()
val x4 = if (x2 == 5) 1 else println("hi")        //> x4  : AnyVal = 1

// below x5 is of type Unit()
val x5 = if (x2 == 5) println("hi")               //> hi
                                                  //| x5  : Unit = ()
val x6 = if (x2 == 5) 'a' else 4                  //> x6  : Int = 97
val x7 = if (x2 == 5) 2 else List(1,2)            //> x7  : Any = 2

// 3. Operators
// in your scala you do not have operators. you have only methods or functions
/*
Below are same -
	"a * b" and "a.*b"
	"a.compare(b)" and "a compare b"
*/


// 4. Anonymous functions
// a function without a name is called as anonymous function.
// you use anonymous function in higher order function like map(), filter() etc.
// eg -

val x8 = 1 to 100                                 //> x8  : scala.collection.immutable.Range.Inclusive = Range 1 to 100

x8.map((x:Int)=>2*x)                              //> res15: scala.collection.immutable.IndexedSeq[Int] = Vector(2, 4, 6, 8, 10, 
                                                  //| 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48,
                                                  //|  50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 86
                                                  //| , 88, 90, 92, 94, 96, 98, 100, 102, 104, 106, 108, 110, 112, 114, 116, 118,
                                                  //|  120, 122, 124, 126, 128, 130, 132, 134, 136, 138, 140, 142, 144, 146, 148,
                                                  //|  150, 152, 154, 156, 158, 160, 162, 164, 166, 168, 170, 172, 174, 176, 178,
                                                  //|  180, 182, 184, 186, 188, 190, 192, 194, 196, 198, 200)
 
 // alternatively, you could have written a function and passed it to map() as shown below -

def double_value(x: Int) = {x*2}                  //> double_value: (x: Int)Int

x8.map(double_value)                              //> res16: scala.collection.immutable.IndexedSeq[Int] = Vector(2, 4, 6, 8, 10, 
                                                  //| 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48,
                                                  //|  50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 86
                                                  //| , 88, 90, 92, 94, 96, 98, 100, 102, 104, 106, 108, 110, 112, 114, 116, 118,
                                                  //|  120, 122, 124, 126, 128, 130, 132, 134, 136, 138, 140, 142, 144, 146, 148,
                                                  //|  150, 152, 154, 156, 158, 160, 162, 164, 166, 168, 170, 172, 174, 176, 178,
                                                  //|  180, 182, 184, 186, 188, 190, 192, 194, 196, 198, 200)


// 5. Placeholder Syntax

val y1 = 1 to 10                                  //> y1  : scala.collection.immutable.Range.Inclusive = Range 1 to 10

// normal syntax
y1.map((x:Int)=>x*2)                              //> res17: scala.collection.immutable.IndexedSeq[Int] = Vector(2, 4, 6, 8, 10, 
                                                  //| 12, 14, 16, 18, 20)

// placeholder syntax - no need to declare variable 'x' -- simply use '_' placeholder
y1.map(_*2)                                       //> res18: scala.collection.immutable.IndexedSeq[Int] = Vector(2, 4, 6, 8, 10, 
                                                  //| 12, 14, 16, 18, 20)

// normal syntax
y1.reduce((x:Int, y:Int) => x+y)                  //> res19: Int = 55

// placeholder syntax
y1.reduce( _ + _)                                 //> res20: Int = 55


// wont work below
y1.reduce((x:Int, y:Int) => x+y -x-y)             //> res21: Int = 0
// wont work: y1.reduce( _ + _ - _ - _)


// Topic 4: Scala Functional Programing session 4
 println("Welcome to the Scala Functional Programing session 4")
                                                  //> Welcome to the Scala Functional Programing session 4

// 1. Partially applied functions
/*
this is an act of creating brand new functions by fixing one or more parameters in a function.
Lets say we have a divide function which takes 2 parameters.
this is generic function.
	x/y

Now we can create a specific brand new function by fixing in the numerator, the value of x:
	1/y
*/


// eg1 -
def divideFunc(x:Double, y:Double) = {x/y}        //> divideFunc: (x: Double, y: Double)Double

// now creating a new function by fixing value of position 'x'
val InverseFunc = divideFunc(1,_:Double)          //> InverseFunc  : Double => Double = scalaLearning4$$$Lambda$27/591723622@458a
                                                  //| d742

InverseFunc(10)                                   //> res22: Double = 0.1
InverseFunc(20)                                   //> res23: Double = 0.05

// eg 2-
def sumFunc(x: Int, y: Int) = {x + y }            //> sumFunc: (x: Int, y: Int)Int

// now creating a new function by fixing value of position 'x'
val IncrementFunc = sumFunc(1, _:Int)             //> IncrementFunc  : Int => Int = scalaLearning4$$$Lambda$28/95395916@6ea12c19

IncrementFunc(10)                                 //> res24: Int = 11
IncrementFunc(20)                                 //> res25: Int = 21

// eg 3 -we can fix not just Value but also Function definition. See below example -
// in below function, we pass function which will decide whether we want sum of  values, or their squares/cubes
def genericSum(x:Int, y:Int, f:Int=> Int) = { f(x) + f(y)}
                                                  //> genericSum: (x: Int, y: Int, f: Int => Int)Int

genericSum(4,5, x=>x)                             //> res26: Int = 9
genericSum(4,5, x=>x*x)                           //> res27: Int = 41
genericSum(4,5, x=>x*x*x)                         //> res28: Int = 189

// Now we define a place holder function sumOfSquares() which will be fixing function definition
val sumOfSquares = genericSum(_:Int,_:Int, x=>x*x)//> sumOfSquares  : (Int, Int) => Int = scalaLearning4$$$Lambda$32/1725097945@1
                                                  //| efbd816
sumOfSquares(4,5)                                 //> res29: Int = 41


// 2. Function currying
/*
It builds on top of partially applied function.
Here we logically seggregate parameters of generic funcion, and partially applied function uses it with a change in way to call generic function.
This is more of a syntactic sugar to make the code clean
*/

// def genericSumFunc(f:Int=> Int, x:Int, y:Int) = { f(x) + f(y)} can be remodelled as -
def genericSumFunc(f:Int=> Int)(x:Int, y:Int) = { f(x) + f(y) }
                                                  //> genericSumFunc: (f: Int => Int)(x: Int, y: Int)Int

// now applying Partially Applied Function -
val sumOfSquaresFunc = genericSumFunc(x=>x*x)_    //> sumOfSquaresFunc  : (Int, Int) => Int = scalaLearning4$$$Lambda$35/2081303
                                                  //| 229@48eff760

sumOfSquaresFunc(2,4)                             //> res30: Int = 20

  
}
