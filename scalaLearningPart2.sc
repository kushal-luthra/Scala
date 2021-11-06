object scalaLearning3 {
  println("Object Oriented Vs Function Programing in Scala")
                                                  //> Object Oriented Vs Function Programing in Scala
  
  // Scala supports 2 styles of programming
  // Object Oriented
  // Function Programing - mainly used
  
  def squareIt1(x: Int): Int = {x*x}              //> squareIt1: (x: Int)Int
  
  def squareIt2(x: Int): Int = {
  	x*x
  }                                               //> squareIt2: (x: Int)Int
  
  def squareIt3(x: Int): Int = {
  return x*x
  }                                               //> squareIt3: (x: Int)Int
  
  println(squareIt1(4), squareIt2(4), squareIt3(4) )
                                                  //> (16,16,16)
  // note we didnt mention return type in function definition  and curly braces.                                                   
  def cubeIt (x: Int) = x*x*x                     //> cubeIt: (x: Int)Int
  
  println(cubeIt(4))                              //> 64
  
  // Passing a function as input to another Function
  def transformIt(x: Int, f:Int => Int): Int = {
  		f(x)
  }                                               //> transformIt: (x: Int, f: Int => Int)Int
 transformIt(2,squareIt1)                         //> res0: Int = 4
 transformIt(2,cubeIt)                            //> res1: Int = 8
 
 // passing function without a name: Anonymous Function
 transformIt(2, x => x*x*x*x)                     //> res2: Int = 16
 
 transformIt(2, x => {var y=x*2; y*y})            //> res3: Int = 16
 
  
}
