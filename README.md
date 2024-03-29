# Java Porgramming
## Introduction
* Download link: https://www.oracle.com/java/technologies/downloads/
## History of Java
* Java was developed by James Gosling, Patrick Naughton, Chris Warth, Ed Frank, and Mike Sheridan at Sun Microsystems, Inc. in 1991.

## Java Features
1. Simple
2. Object-Oriented
3. Portable
4. Platform Independent
5. Secured
6. Robust
7. Architecture Neutral
8. Interpreted
9. High Performance
10. Multithreaded
11. Distributed

## Input and Output
* Output: System.out.println("Hello World");
* Input: Scanner sc = new Scanner(System.in);
* sc.next(): get only one word without space
* sc.nextLine(): get whole line with space
* sc.nextInt(): get integer value
* sc.nextFloat(): get float value
* sc.nextDouble(): get double value
* sc.nextBoolean(): get boolean value
* sc.nextByte(): get byte value
* sc.nextShort(): get short value
* sc.nextLong(): get long value
* sc.close(): close the scanner object
* learn  more about Scanner class: https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html

## Variables
* variable is a container which holds the value while the java program is executed.
* variable is a name of memory location.
##  Rules for defining a variable:
    * variable name must be start with alphabet or _ or $.
    * after first letter, variable name can be a combination of letters, digits, _ and $.
    * variable name should not be matched with keywords.
    * variable name is case-sensitive.

## Data Types
* Data type is a classification of data, which can store a specific type of information.
## There are two types of data types in Java:
### Primitive data types
### Non-primitive data types
### Primitive data types:
        * byte: 1 byte
        * short: 2 bytes
        * int: 4 bytes
        * long: 8 bytes
        * float: 4 bytes
        * double: 8 bytes
        * char: 2 bytes
        * boolean: 1 bit
### Non-primitive data types:
        * String
        * Array
        * Class
        * Interface
        * etc.
* learn more java data types: https://oracle.com/java/technologies/javase-documentation.html

## Operators
* Operators are special symbols that perform specific operations on one, two, or three operands, and then return a result.
* There are many types of operators in Java:
    * Arithmetic Operators: +, -, *, /, %, ++, --
    * Assignment Operators: =, +=, -=, *=, /=, %=
    * Comparison Operators: ==, !=, >, <, >=, <=
    * Logical Operators: &&, ||, !
    * Bitwise Operators: &, |, ^, ~, <<, >>, >>>
    * Ternary Operators: ?:
    * instanceof Operators: instanceof
    * new Operators: new
    * etc.

## Type Casting
* Type casting is when you assign a value of one primitive data type to another type.
* There are two types of casting:
    * Widening Casting (automatically): byte -> short -> char -> int -> long -> float -> double
    * Narrowing Casting (manually): double -> float -> long -> int -> char -> short -> byte

## Control Statements
* Control statements are used to control the flow of execution in a program.
* There are three types of control statements:
    * Selection Statements: if, if-else, switch
    * Iteration Statements: while, do-while, for, for-each
    * Jump Statements: break, continue, return
