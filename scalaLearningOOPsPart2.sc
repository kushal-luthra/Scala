object scalaLearningOOPsPart2 {
  println("Class Object and Singleton design pattern")
                                                  //> Class Object and Singleton design pattern
 /*
 Class Object -
 
 In java and python, the term 'object' is used to denote class instance.
 In Scala, this is different.
 
 In Java we have keyword 'static' to define Variables whose values are constant.
  Need to take note of the fact that for static variables, since they are same for all the class instances, there should be only single copy of such variables.
 This is what we have in case of static class variables.
  
 In Scala, we don't have keyword static. Instead what we have is object keyword, which denote static values.
 */
 object Person {
  // class Level Functionality | same as 'static' keyword in java
 	val number_of_eyes = 2
 	def canFly: Boolean = false
 }
 
 /*
 	In above syntax, we have created a class Person, and instantiated an object 'Person' with same name as that of class.
 */
 
 // to access values of object Person
 println(Person.number_of_eyes)                   //> 2
 println(Person.canFly)                           //> false
 
 /*
 Further, we cannot create another instance of 'Person' class - this maps into Singleton Pattern.
 So, here only 1 instance gets created and that with the name 'Person'.
 
 That is, when we use Object, we get a singleton reference with the same name.
 This basically gives you a singleton deisgn pattern without any extra code. To do same thing in Java requires lots of code.
 */
 
 // below we create 2 variables, which are pointing to same instance of class Person.
 val Mary = Person                                //> Mary  : scalaLearningOOPsPart2.Person.type = scalaLearningOOPsPart2$Person$
                                                  //| 2$@dfd3711
 val John = Person                                //> John  : scalaLearningOOPsPart2.Person.type = scalaLearningOOPsPart2$Person$
                                                  //| 2$@dfd3711
 
 println (Mary == John)                           //> true
 
 // now we define a class Person, which will provide instance level functionality.
 // so 'object' gives class Level Functionality.
 // and 'class' gives instance level functionality.
 
 // below is Companion Class or Companion Object - this is a deisgn pattrn used in adjunct with singleton object.
 class Person(name: String, val age: Int) {
 
 // instance level functionality.
 
 def salaryDoubler(salary: Int) = salary*2
  
 }
 
 
 val person =new Person("Kushal ", 33 )           //> person  : scalaLearningOOPsPart2.Person = scalaLearningOOPsPart2$Person$3@4
                                                  //| 2d3bd8b
 
 /*
 Companion Design Pattern
 These 2 together are called Companion objects, and this is a case of Companion Design Pattern.
 
 object MyClass {
 // represent class level functionality. Common for all instances.
 }
 
 class MyClass {
 // represent instance level functionality.
 
 }
 
 Since both of them are companions, so they can access each other fields, including private ones.
 
 */
 
 
 /*
 Summary :
 In Scala Object Oriented Session 2 we covered -
 
 how to create a class
 how to create a class instance
 what are class parameters, and how we can promote them to fields by putting var/val before them.
 
 class level functionality using Object -
 * there is nothing like Static in Java in scala world.
 * Design Pattern where in a single file we have object and class with the same name.
 This design pattern is called Companion Design Pattern.
 * here Object is used for class level functionality, and
 class is used for instance level functionality.
 * In Scala, singleton design pattern is achieved by using object.
 
 */
 
}
