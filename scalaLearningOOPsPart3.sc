object scalaLearningOOPsPart3 {
  println("scala OOPs Session 3")                 //> scala OOPs Session 3
  /*
  we will cover case classes.
  
  Case class is a special kind of class where you need to write less.
  
  Usually when we define a class, we are suppose to write boiler plate code.
  Case Classes gives the flexibility to avoid this.
  
  Normal Class definition:
  class Person(name: String, age: Int)
  
  Case class definition : Use keyword 'case'
  case class Person(name: String, age: Int)
  */
  
  
  // features of case class
  
  // 1. class parameters are AUTOMATICALLY promoted to fields.
  
  case class Person(name: String, age: Int)
  
  val person1 = new Person("Kushal", 33)          //> person1  : scalaLearningOOPsPart3.Person = Person(Kushal,33)
  // in normal case, we wont be able to access person1.name as these are class parameters and not Fields.
  // But in case class, Class parameters are AUTOMATICALLY promoted to fields.
  // This promotion is done by makin parameters as type 'va', i.e. they are Immutable - which is preferred.
  println (person1.name )                         //> Kushal
  
  
  // 2. case class have sensible toString.
  class Person2(val name: String, val age: Int)
  val person2 = new Person2("Kushal", 33)         //> person2  : scalaLearningOOPsPart3.Person2 = scalaLearningOOPsPart3$Person2$
                                                  //| 1@1e67b872
                                                  
  // when we do toString in order to print the values of person2, we get cryptic values.
  println(person2.toString)                       //> scalaLearningOOPsPart3$Person2$1@1e67b872
  
  // But in case of case class, toString gives sensible output. That is, case class have sensible toString
  println(person1.toString)                       //> Person(Kushal,33)
  
  
  // 3. equals and hashCode method are implemented already.
  
  // equals comparison - it compares REFERENCES of 2 instances.
 val person3 = new Person2("Kushal", 33)          //> person3  : scalaLearningOOPsPart3.Person2 = scalaLearningOOPsPart3$Person2$
                                                  //| 1@60addb54
 // since references are different, even though actual values in these instances are same, below EQUALS comparison returns FALSE.
 println (person2 == person3)                     //> false
 
 // But in case of Case Class, EQUALS compares actual values and not references, and hence returns True in below case.
 val person4 = new Person("Kushal", 33)           //> person4  : scalaLearningOOPsPart3.Person = Person(Kushal,33)
 println (person1 == person4)                     //> true
 
 // 4. In normal class, we have to create companion objects along with the normal class.
 // But in CASE CLASS, we have companions objects created already it.
 // in Companion object, the object instance with name same as that of the class is created already. This is what we are doing here.
 
 // notice we didn't use keyword 'new'
 // notice we instead refered to object instance and assigned values using 'apply' method of companion class.
 val person5 = Person.apply("Kushal",33)          //> person5  : scalaLearningOOPsPart3.Person = Person(Kushal,33)
 println(person5.name)                            //> Kushal
 
 // even if you dont use 'apply' method, it will still be possible to assign values
 val person6 = Person("Kushal",33)                //> person6  : scalaLearningOOPsPart3.Person = Person(Kushal,33)
 println(person6)                                 //> Person(Kushal,33)
 
 
 // 5. case classes have a handy COPY method.
 // notice that we changed one of fields with a different value below
 val person7 = person1.copy(age=45)               //> person7  : scalaLearningOOPsPart3.Person = Person(Kushal,45)
 println(person7)                                 //> Person(Kushal,45)
 
 // 6. case classes are serializable - objects that are serializable, can be transferred over a network.
 // This feature is very important for Distrubuted Programing as they can be transferred over a network.
 
   
}
