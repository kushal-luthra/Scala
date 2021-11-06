object scalaLearningOOPs {

	// Topic 1: Scala Object Oriented Programming : Session 1
  println("Topic 1: Scala Object Oriented Programming : Session 1")
                                                  //> Topic 1: Scala Object Oriented Programming : Session 1
  
  
  println("Our focus will be on - creating Class and Instantiating Class")
                                                  //> Our focus will be on - creating Class and Instantiating Class
	
	// Class is a combination of Data + Behaviour.
	
	// Topic 1: Creating and Instantiating an empty Class
  //creating an empty class below
  class Person1
  
  // instantiating above class
  val p1 = new Person1                            //> p1  : scalaLearningOOPs.Person1 = scalaLearningOOPs$Person1$1@38082d64
  
  // print above class object - it shows some cryptic value
  println(p1)                                     //> scalaLearningOOPs$Person1$1@38082d64
  
 
 // Topic 2: Class Level Parameters and Class level fields.
 
 class Person2(name: String, age: Int)
 
 val p2 = new Person2("kushal", 33)               //> p2  : scalaLearningOOPs.Person2 = scalaLearningOOPs$Person2$1@dfd3711
 
 // if we try to print class parameters (name and age here), we get an error
 // println(p2.name) -- This throws error as name here is class parameter, and not class field. To convert to field, add prefic 'val/var'
  
  // Notice the use of 'val' keyword to convert class parameter into class Field.
  class Person3(val name: String, val age: Int)
  
  
  val p3 = new Person3("kushal", 33)              //> p3  : scalaLearningOOPs.Person3 = scalaLearningOOPs$Person3$1@42d3bd8b
  println(p3.name)                                //> kushal
  
  
  // Topic3 : Class body
  
  class Person4(name: String, age: Int) {
  
  val x = 20
  
  // defining function inside the class
  
  // note here - it doubled age parameter - we still cannot access age outside the class as long as it is a Parameter and not a field.
  def ageDoubler= {age * 2}
  
  def salaryDoubler(salary: Int) = {salary * 2}
  
  
  }
  
  val p4 = new Person4("kushal", 33)              //> p4  : scalaLearningOOPs.Person4 = scalaLearningOOPs$Person4$1@26ba2a48
  
  println(p4.x)                                   //> 20
  
  p4.ageDoubler                                   //> res0: Int = 66
  
  p4.salaryDoubler(1000)                          //> res1: Int = 2000
  
  
  
  
}
