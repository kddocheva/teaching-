package collections.excersise

data class Employee(val id: Int, val name: String, val position: String, val salary: Double)

fun filterByPosition(employees: List<Employee>, position: String): List<Employee> {
//    val developers = filterByPosition(employees, "Developer")
//    println("\nDevelopers:")
//    developers.forEach { println(it) }
    return employees.filter { it.position == position }
}

fun calculateAverageSalary(employees: List<Employee>): Double {
    return employees.sumOf {  it.salary }
}

fun calculateAvgSalaryForEachDepartment(employees: List<Employee>): List<Pair<String, Double>> {     // List<Any> read more
    val departmentAndPeople: Map<String, List<Employee>> = employees.groupBy { it.position }
    for (key in departmentAndPeople.keys) {
        val peopleInDepartment: List<Employee>? = departmentAndPeople[key]  // ["hfshf"]
        val avSalaryOfDep = calculateAverageSalary(peopleInDepartment!!)
        println("$key $avSalaryOfDep")
        Pair(key, avSalaryOfDep)
    }
    return departmentAndPeople.map {
        Pair (it.key, calculateAverageSalary(it.value))
    }
}

fun findHighestPaidEmployee(employees: List<Employee>): Employee? {
    return employees.maxByOrNull {  it.salary }
}


fun main() {
    val employees = listOf(
        Employee(1, "John", "Manager", 60000.0),
        Employee(2, "Alice", "Developer", 70000.0),
        Employee(3, "Bob", "Developer", 75000.0),
        Employee(4, "Eva", "Analyst", 55000.0),
        Employee(5, "Charlie", "Manager", 62000.0)
    )
    calculateAvgSalaryForEachDepartment(employees)

    // Print original list
    println("Original List of Employees:")
    employees.forEach { println(it) }

    // Filter by position
    val developers = filterByPosition(employees, "Developer")
    println("\nDevelopers:")
    developers.forEach { println(it) }

    // Calculate average salary
    val averageSalary = calculateAverageSalary(employees)
    println("\nAverage Salary: $averageSalary")

    // Find highest paid employee
    val highestPaidEmployee = findHighestPaidEmployee(employees)
    println("\nHighest Paid Employee:")
    println(highestPaidEmployee)
}
