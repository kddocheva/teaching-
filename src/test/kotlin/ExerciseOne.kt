import two.objects.data.Animal
import two.objects.data.Cat
import two.objects.data.Dog
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

internal class ExerciseOne {

    val animals: List<Animal> = listOf(
        Dog("Barney", 15),
        Dog("Barney", 1),
        Cat("Robin", 2),
        Cat("Robin", 5),
        Cat("Robin", 2),
        Dog("Samson", 4),
        Cat("Chuck", 1),
        Dog("Kamran", 21),
        Dog("Kamran", 26),
        Dog("Jack", 26),
        Dog("Jimmy", 53)
    )


    @Test
    fun mapNullableListOfIntsToNonNulls() {
        val numbers: List<Int?> = listOf(1, null, 3, null, 6, null)
        val result = numbers.filterNotNull()
        val expectedResult = listOf(1, 3, 6)
        assertContentEquals(result, expectedResult)
    }


    // Two ways, once with built-in method, one with filter with when (is Dog)
    @Test
    fun filterAnimalsToDogs() {
        val result = animals.filterIsInstance<Dog>()
        val expectedResult: List<Animal> = animals
        assertContentEquals(result, expectedResult)
    }

    @Test
    fun calculateAmountOfEachDog() {
        val result: Map<String, Int> = TODO()
        val expectedResult = mapOf("Barney" to 2,
            "Samson" to 1,
            "Kamran" to 2,
            "Jack" to 1,
            "Jimmy" to 1
        )
        assertEquals(result, expectedResult)
    }

    @Test
    fun fibonacciSequence() {
        TODO()
    }

    @Test
    fun palindromeCheck() {
        TODO()
    }

    @Test
    fun extendStringClassWithPalindromeCheck() {

    }

}