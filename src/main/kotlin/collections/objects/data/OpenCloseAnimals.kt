package two.objects.data

class ClosedDog(override val name: String, override val age: Int): Animal {
    override val type: String = "dog"

    fun inheritedMethod(): String {
        return "I am inherited method"
    }

}

open class OpenDog(override val name: String, override val age: Int): Animal {
    override val type: String = "dog"
}

open class OpenDog2(override val name: String, override val age: Int): Animal {
    override val type: String = "open dog 2"
}


// Valid
class NewDog(override val name: String, override val age: Int): OpenDog(name, age)

// Not working due to classes being final by default
// class NewDogFromClosed(override val name: String, override val age: Int): ClosedDog(name, age)

// Not working due to diamond problem limitations
// class NewDog2(override val name: String, override val age: Int): OpenDog(name, age), OpenDog2
