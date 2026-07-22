# LEVEL 1 - LAMBDAS AND STREAMS
This Java application introduces Lambda Expressions, Streams API, Method References, and Functional Interfaces. These features 
make code shorter, more readable, and easier to maintain by focusing on what should be done instead of how to do it.
The objective of this level is to understand how lambda expressions work, how streams process collections, and how functional 
interfaces allow behavior to be passed as data.

## STRUCTURE
```text
level1/
├── Main.java
├── Methods.java
├── PiValue.java
├── Reverse.java
└── level1Test/
    ├── MethodsTest.java
    ├── PiValueTest.java
    └── ReverseTest.java
```

**Main.java**
Creates the example lists.
Executes every exercise.
Demonstrates lambda expressions, method references, streams, and functional interfaces.

**Methods.java**
Contains reusable methods using the Streams API.
* `namesWithLetterO()`
* `longNamesWithO()`
* `printList()`
* `sortByLength()`
* `sortByLengthDescending()`

**PiValue.java**
A custom Functional Interface.
* `getPiValue()`

**Reverse.java**
A custom Functional Interface.
* `reverse(String text)`

## BEHAVIOUR
The application demonstrates different Java 8 functional programming features.
Exercises:
1. Filters a list of names and returns only those containing the letter 'o'.
2. Filters the previous result, keeping only names that contain 'o' and have more than five characters.
3. Prints all the months of the year using a lambda expression.
4. Prints the same list using a method reference (System.out::println).
5. Creates a custom Functional Interface and implements it with a lambda that returns the value 3.1415.
6. Sorts a list of strings from the shortest to the longest using a stream and a comparator.
7. Sorts the same list in the opposite order, from the longest to the shortest.
8. Creates another Functional Interface whose lambda receives a String and returns the same text reversed.

**TESTING**
The tests verify:
* Filtering names containing the letter 'o'.
* Filtering long names containing 'o'.
* Sorting strings by length in ascending order.
* Sorting strings by length in descending order.
* Returning the expected value from the PiValue Functional Interface.
* Correctly reversing strings using the Reverse Functional Interface.

## CONCLUSION
This exercise helped reinforce the basic concepts of functional programming introduced in Java 8. It became clear that lambda 
expressions are used to define behavior in a concise way, while the Streams API is responsible for processing collections 
through operations such as filtering, sorting, and transforming data.

It also showed that these features are designed to work together: streams provide the data flow, and lambdas describe the 
action to perform on each element. Finally, creating custom Functional Interfaces demonstrated how lambdas can be used not 
only with built-in interfaces such as Predicate or Consumer, but also with interfaces specifically designed for the needs 
of an application.

# LEVEL 2 - FUNCTIONAL DATA MANIPULATION

This level continues working with Lambda Expressions and Streams by applying more complex operations to collections.
The objective is to practice filtering, transforming, sorting data, and creating Functional Interfaces for reusable operations.

## STRUCTURE

```text
level2/
├── Main.java
├── Methods.java
├── Operation.java
├── Operations.java
└── level2Test/
└── MethodsTest.java
```

**Main.java**
Creates the example data and executes the exercises from this level.

**Methods.java**
Contains methods using Streams API for filtering, sorting, and transforming collections.
* `namesStartingWithA()`
* `evenOrOdd()`
* `sortByFirstCharacter()`
* `sortedFirstContainingE()`
* `replaceA()`
* `numericStrings()`

**Operation.java**
A custom Functional Interface used for mathematical operations.
`operation(float a, float b)`

**Operations.java**
Contains reusable lambda implementations for:
Addition.
Subtraction.
Multiplication.
Division.

## BEHAVIOUR
The application demonstrates more advanced stream operations.

Exercises:
1. Filters names starting with 'A' and having exactly three letters.
2. Converts a list of integers into a String where even numbers start with "e" and odd numbers with "o".
3. Creates a Functional Interface to perform different arithmetic operations using lambdas.
4. Manipulates a list of strings and numbers:
5. Sorts values by the first character.
6. Places strings containing 'e' first.
7. Replaces lowercase 'a' with '4'.
8. Returns only numeric strings.

## VALIDATION
A common Validation class is used in both levels.
It checks that:
* Lists are not null.
* Lists do not contain null elements.

This avoids errors before processing collections.

## TESTING
The tests verify:
Filtering names starting with 'A'.
Converting numbers into even and odd formats.
Sorting strings by the first character.
Ordering strings containing 'e' first.
Replacing 'a' with '4'.
Returning only numeric strings.
Validating null lists and null elements.

## CONCLUSION
This level improved the understanding of functional programming by combining streams, lambda expressions, and custom 
Functional Interfaces.
The exercises showed how Java can process data in a more declarative way and how separating logic into reusable classes 
makes the code easier to maintain.