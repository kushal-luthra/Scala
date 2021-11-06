object scalaLearning3 {
  println("Scala Collections")                    //> Scala Collections
  
  println("common types are  ")                   //> common types are  
  println("  Array")                              //>   Array
  println("  List")                               //>   List
  println("  Tuple")                              //>   Tuple
  println("  Range")                              //>   Range
  println("  Set")                                //>   Set
  
  
  // Topic 1 : Arrays
  // They are mutable collections - so values can be changed.
  // Arrays can be referenced by Index, and its index starts from 0.
  // Used where Searching based on Index.
  // But insert/delete operations are tricky.
 
 	val a = Array(1,2,3,4,5)                  //> a  : Array[Int] = Array(1, 2, 3, 4, 5)
 	
 	
 	// below will refer its index
 	println(a)                                //> [I@35fb3008
 	
 	// below will convert to string and print its values
 	println(a.mkString(","))                  //> 1,2,3,4,5
 	
 	// below prints elements of array in a For Loop
 	for (i<-a) println(i)                     //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
 	
 	// Below we are modifying element of Array
 	a(2) = 7
 	println(a.mkString(","))                  //> 1,2,7,4,5
 	
 	
 	// Since array is val type, so cannot reasisgn it a new value. But we can always modify elements of array.
  // a = Array(8,9)  -- This will throw Error
 
 	
 // Topic 2: List
 // Internally holds the element in Singly Linked List.
 // That means, Searching element is Not Efficient.
 // But Insert/Delete operations, especially at start, are Efficient.
 // Array and List have elements of Same type.
 
 val b = List(1,2,3,4,5)                          //> b  : List[Int] = List(1, 2, 3, 4, 5)
 
 // To access elements in List, use 0 based indexing -
 println(b(0),b(1))                               //> (1,2)
 
 // head - first element of List
 println(b.head)                                  //> 1
 
 // tail - all but first element
 println(b.tail)                                  //> List(2, 3, 4, 5)
 
 // reverse operation
 b.reverse                                        //> res0: List[Int] = List(5, 4, 3, 2, 1)
 
 for (i<-b) println(i)                            //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
 
 // Adding element to start of List
 10 :: b                                          //> res1: List[Int] = List(10, 1, 2, 3, 4, 5)
 
 
 // Topic 3: Tuple
 // You can treat Tuple as a record in your database. that is, it can hold elements of different data types.
 // It is '1' based index, unlike Array and List
 
 // To declare a Tuple
 val x = ("Kushal", 100, true)                    //> x  : (String, Int, Boolean) = (Kushal,100,true)
 // To access elements of tuple - we have '1' based indexing
 println(x._1, x._2, x._3)                        //> (Kushal,100,true)
 
 
 // 2 values Tuple - a Tuple containing 2 elements is a special case such that first element can be treated as Key and 2nd as Value.
 // It can be declared in 2 ways -
 val x1 = (1,"a")                                 //> x1  : (Int, String) = (1,a)
 val x2 = 1-> "a"                                 //> x2  : (Int, String) = (1,a)
 
 
 // Topic 4: Range
 // We can specify a range of values to a variable in 2 ways -
 
 // Way 1 : 'to' keyword includes value 10
 val range1 = 1 to 10                             //> range1  : scala.collection.immutable.Range.Inclusive = Range 1 to 10
 //println(range1)
 for (i <- range1) println(i)                     //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
                                                  //| 6
                                                  //| 7
                                                  //| 8
                                                  //| 9
                                                  //| 10
 
 // Way 2: 'until' keyword excludes value 10
 val range2 = 1 until 10                          //> range2  : scala.collection.immutable.Range = Range 1 until 10
 for (i <- range2) println(i)                     //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
                                                  //| 6
                                                  //| 7
                                                  //| 8
                                                  //| 9
 
 
 // Topic 5: Set
 // holds only Unique, and order is not maintained.
 
 
 val set1 = Set(1,1,1,2,2,3,4,4,4,5)              //> set1  : scala.collection.immutable.Set[Int] = Set(5, 1, 2, 3, 4)
 
 // Since order is not guaranteed so access element of Set is not possible.
 // What we can accessis through certain functions
 set1.max                                         //> res2: Int = 5
 set1.min                                         //> res3: Int = 1
 set1.sum                                         //> res4: Int = 15
 
 
 // Topic 6: Map Type
 // A Map is a collection of Key-Value pairs.
 // Note - Keys cannot repeat. if keys are duplicate, only last one is kept
 
 val map1 = Map(1-> "a", 2->"b")                  //> map1  : scala.collection.immutable.Map[Int,String] = Map(1 -> a, 2 -> b)
 
 // access elements of Map using get function.
 map1.get(1)                                      //> res5: Option[String] = Some(a)
 map1.get(3)                                      //> res6: Option[String] = None
 
 // Note - Keys cannot repeat. if keys are duplicate, only last one is kept
 val map2 = Map(1-> "a", 2->"b", 1->"c")          //> map2  : scala.collection.immutable.Map[Int,String] = Map(1 -> c, 2 -> b)
 map1.get(1)                                      //> res7: Option[String] = Some(a)
 
 
 
}
