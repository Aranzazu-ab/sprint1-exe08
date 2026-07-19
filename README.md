LEVEL 1 - LAMBDAS AND STREAMS

This Java application introduces Lambda Expressions, Streams API, Method References, and Functional Interfaces, which were added in Java 8. These features make code shorter, more readable, and easier to maintain by focusing on what should be done instead of how to do it.

The objective of this level is to understand how lambda expressions work, how streams process collections, and how functional interfaces allow behavior to be passed as data.

STRUCTURE
level1/
├── Main.java
├── Methods.java
├── PiValue.java
├── Reverse.java
└── level1Test/
├── MethodsTest.java
├── PiValueTest.java
└── ReverseTest.java

Main.java

Creates the example lists.
Executes every exercise.
Demonstrates lambda expressions, method references, streams, and functional interfaces.

Methods.java
Contains reusable methods using the Streams API.

namesWithLetterO()
longNamesWithO()
printList()
sortByLength()
sortByLengthDescending()

PiValue.java
A custom Functional Interface.

getPiValue()

Reverse.java
A custom Functional Interface.

reverse(String text)
BEHAVIOUR

The application demonstrates different Java 8 functional programming features.

Exercise 1

Filters a list of names and returns only those containing the letter 'o'.

Exercise 2

Filters the previous result, keeping only names that contain 'o' and have more than five characters.

Exercise 3

Prints all the months of the year using a lambda expression.

Exercise 4

Prints the same list using a method reference (System.out::println).

Exercise 5

Creates a custom Functional Interface and implements it with a lambda that returns the value 3.1415.

Exercise 6

Sorts a list of strings from the shortest to the longest using a stream and a comparator.

Exercise 7

Sorts the same list in the opposite order, from the longest to the shortest.

Exercise 8

Creates another Functional Interface whose lambda receives a String and returns the same text reversed.

LAMBDAS VS STREAMS

Although lambdas and streams are often used together, they have different purposes.

Lambda Expressions

A lambda is an implementation of a Functional Interface. It represents a small block of behavior that can be passed as an argument.

Example:

name -> name.toLowerCase().contains("o")

A lambda does not process collections by itself. It only defines the action to perform.

Typical uses:

Filtering data.
Transforming values.
Implementing Functional Interfaces.
Passing behavior to methods.
Streams API

A stream processes collections of data in a declarative way.

Instead of using loops, streams allow operations such as:

filter()
map()
sorted()
collect()
forEach()

Example:

names.stream()
.filter(name -> name.contains("o"))
.collect(Collectors.toList());

Here:

stream() creates the stream.
filter() receives a lambda that decides which elements remain.
collect() converts the result back into a list.
Working Together

Streams and lambdas complement each other.

The stream manages the collection, while the lambda tells the stream what operation should be performed on each element.

For example:

numbers.stream()
.filter(number -> number > 10)

The stream iterates through the collection, and the lambda checks whether each number is greater than 10.

TESTING

The project includes JUnit 5 tests for the reusable methods and custom Functional Interfaces.

The tests verify:

Filtering names containing the letter 'o'.
Filtering long names containing 'o'.
Sorting strings by length in ascending order.
Sorting strings by length in descending order.
Returning the expected value from the PiValue Functional Interface.
Correctly reversing strings using the Reverse Functional Interface.
CONCLUSION

This exercise helped reinforce the basic concepts of functional programming introduced in Java 8. It became clear that lambda expressions are used to define behavior in a concise way, while the Streams API is responsible for processing collections through operations such as filtering, sorting, and transforming data.

It also showed that these features are designed to work together: streams provide the data flow, and lambdas describe the action to perform on each element. Finally, creating custom Functional Interfaces demonstrated how lambdas can be used not only with built-in interfaces such as Predicate or Consumer, but also with interfaces specifically designed for the needs of an application.