package two.objects.data

// We can inherit from multiple interfaces, but just from one class
interface Animal {
    val type: String
    val name: String
    val age: Int

    fun details(): String  {
        return "This $type is called $name and is $age years old"
    }
}

data class Dog(override val name: String, override val age: Int): Animal {
    override val type: String = "dog"

    fun newFunction(): String {
        return "I am a Dog and my name is $name"
    }

}
data class Cat(override val name: String, override val age: Int): Animal {
    override val type: String = "cat"
}





//  Diamond Problem
//  interface Animal2 {
//      val type: String
//      val name: String
//      val age: Int
//
//      fun details(): String  {
//          return "Animal2 $type is called $name and is $age years old"
//      }
//
//  }
//
//  class Dog(override val name: String, override val age: Int): Animal, Animal2 {
//      override val type: String = "dog"
//  }
