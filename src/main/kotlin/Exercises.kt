// Exercise: Write a program that recommends a random dinner choice (from a fixed list) (3-5 min)
// - create an appropriate collection with some dinner choices
// - output a dinner choice if the user inputs "dinner?" into the console
// - the code should keep running until the user enters "quit"
// - handle exceptions if necessary
// - BONUS: allow the user to add new dinner choices by typing "add" and then a new choice


import java.time.LocalDate


// Exercise: Creating convenient operators for Java Time (5 min)

// Exercise 1: create a rangeTo() operator on LocalDate that represent the DateRange from this to the given LocalDate
// - remember LocalDate is not your class but with Kotlin you can still extend its API
// - use the supplied DateRange helper class to represent the date range
// (1) Insert code here

// Exercise 2: create a contains() operator on DateRange (imagine it's a third-party class)
// - should return true if a given date is temporally within the range (both ends inclusive)
// (2) Insert code here



// Note: helper class (OO later)
data class DateRange(val start: LocalDate, val end: LocalDate)



val original = listOf(-12, 53, 26, -1, -564, 0, -3, 100)

// Exercise: use higher-order function from the stdlib to create the following lists based on `original` (3-5 min):
// 1) a list of only the non-negative numbers
// 2) a list where every even number is replaced by zero
// 3) a list where all negative numbers are turned positive
// 4) also compute the sum of all elements in `original` in one line
// Insert code here...


// Exercise: implement a higher-order function requireThat(condition, messageBuilder) which throws an
// IllegalArgumentException if its condition is not fulfilled and where messageBuilder is a function () -> String
// - uncomment the code in main() below for a quick check
// - this is similar to require() from the training but with a lazy message
// Insert code here...

fun main(args: Array<String>) {

    // (1) Should not throw an exception
//  requireThat(1 + 1 != 0, { "We're not living in F_2" })

    // (2) Should throw an exception with the given message
//  requireThat("Java" > "Kotlin", { "Actually, Kotlin is greater than Java" })
}


// Exercise 1: implement the following infinite lazy sequences:
// 1) the sequence of all multiples of 5 (starting at zero)
// 2) the sequence 1, 1/2, 2, 1/3, 3, 1/4, 4, 1/5, 5, ...
// 3) the sequence of lists of 0 where each element has one more 0 than its predecessor (starting at zero elements)
// Insert code here...

// Exercise 2: quick-check your sequences by selecting and printing the following:
// 1) the first 10 elements from your first sequence
// 2) the first 5 elements and elements 16 to 20 from your second sequence
// 3) the first element and elements 4 to 6 from your third sequence
// Insert code here...
