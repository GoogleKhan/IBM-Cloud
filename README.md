# IBM-Cloud
Java Topics By Shadab 

--------------------------------
#include<stdio.h>
void main()
{
	printf("Hello Cloudy");
}
------------------------------------
hello.c        -----------> hello.exe ------------>
                Compilation              Execution
(Source Code)  -----------> MachineCode ---------->
-----------------------------------------------------------------
1. Java is Platform independent
2. Object Oriented Programming Language
3. Robust(due to Exception Handling)
4. Secure
5. Easy to learn
6. Internationalization support(I18N)
7. From Java8, it introduced Functional Style of programming.

8. So many framework supported by Java.
-------------------------------------------
Computer = S/W + H/W
Platform = OS + Microprocessor
	p1   = Window + Intel
	p2   = Linux + Intel

Java is Platform independant, but highly JVM dependent.

WORA(Write Once Run Anywhere)

----------------------------------------------------
Object Oriented Programming Language:
-------------------------------------
class:
========
1. Class is an imaginary  thing(blueprint) which describes the properties and behaviours of objects.
2. Class is a representation of similar kind of objects.
3. Class is an user defined data type.

Syntax:
--------
<modifier> class <name> <extends> <implements>
	{
		//body -> member  will be STATIC or INSTANCE 	
					1. variables
					2. methods
					3. constructors*
					4. initializer blocks
					5. inner/nested class
	}
Example:
--------
	 class Car
		{
			int h; // instance variable member
			int w; // instance variable member
	 static int wc;// static variable member
	 
	       void move(){} // instance method member	 
	static void avg(){} // static method member
	 
		}
		
-> variable is the name of memory location
-------------------------------------------------		
*) static members are associated with class
*) instance members are associated with object
-------------------------------------------------

-> static variable will be created when its class loads into the memory(only once).
-> instance variable will be created when we create objects.	

------------------------------------------
objects:
=========
1. Object is an real world entity.
2. Object is an instance of a class.

Syntax:
----------
	<type> <var> = new <type>(<parameters>)

Example:
-----------	
		Car c1 = new Car();
		Car c2 = new Car();

new is a keyword in Java and used as an operator to create an object in heap memory.

Accessing Members:
--------------------
<ClassName>.<member>
<ObjRef>.<member>

	 Car.wc =100;
	 
	 c1.w =5;
	 c2.h =99;

-----------------------------------------
inheritance:[IS-A]
-------------------
Parent  | Super   | Base
Child   | Sub     | Drived
----------------------------------------
It is a way of code-reusablity.


class Person
{
	void eat(){}
	void sleep(){}
}
----------------------
public class Dog
{}
----------------------
class Employee extends Person
{   
	Dog dog; // aggregation
	
	void work(){}
}
---------------------------
Employee IS-A Person

Employee HAS-A Dog
----------------------------------------------------------------------
encapsulation:
-----------------
1. Wrapping of data and methods into a sigle units(class body) called encapsulation.
2. Encapsulation says that, declare data member as private and provide getter and setter for external use.
------------------------------------
polymorphism: many + forms
--------------------------
1. method overloding
2. method overriding
3. Operator overloading
----------------------------------------
abstraction: 
--------------
Hiding of unneccesaary details from the end user called abstraction.

modularity:
------------
----------------------------------------------------------------------------------
Data types in Java:
------------------
Java is statically typed language.

		long x = 10; //OK
		     x = 10.0; //ERROR

1. Primitive Data Types:  (1Byte = 8 bits)
------------------------------------------
|-Boolean
	|-boolean(N/A)(1B)
	
|-Numeric
	|-Integral
		|-Character
			|-char (2B)
		|-Integer
			|-byte (1B)
			|-short(2B)
			|-int  (4B)
			|-long (8B)
	|-Floating Point
			|-float  (4B)
			|-double (8B)
			
			
2. Reference Data Types:
------------------------
	|-class
	|-interface
	|-array
	|-enum

------------------------------------------------------------- 
In C/C++ , ASCII-8 bit (1 Byte) encoding scheme for converting characyers into number -> binary

2 power 8 = 256 (maximum character which be encode/decode by using c/c++)

In Java, Unicode-16 bits (2 Bytes) encoding scheme for converting characyers into number.

2 power 16 = 65,536. (maximum character which be encode/decode by using Java)

------------------------------------------------------------------------------------
byte -> short -> int -> long -> float -> double
        char ->  int

*) widening is done implicitly.
*) narrowing requires casting.


exp1:
--------
	int x =10; //ok
	
	double d = x; //ok  widening

exp2:
--------
	double x =10.0; //ok
	
	int i = x; // Error -> narrowing

---------------------------------------------------
Printing in Java:
-----------------
System.out.print(data); ->  data
System.out.println(data); -> data + new line

Examples:
==========
	int i =10;
	
	SOP(i); // 10
	SOP('i'); // i as char value
	SOP("i"); // i as String value
	SOP(10); // 10 as integer value
	SOP("10"); // 10 as string value
	SOP(2 * 5); // 10 calculated value of expression

---------------------------------------------------------------
Control flow statements:
---------------------------
1) if(<boolExpr>)
	{
		//body
	}

2) if(<boolExpr>)
	{
		//body
	}
	else
	{
		//body
	}

3) if(<boolExpr>)
	{
		//body
	}
	else if(<boolExpr>)
	{
		//body
	}
	else
	{
		//body
	}
--------------------------------------------------------

In C/C++: Non-Zero -> true and zero -> false
-------------------------------------------------
	int a = 10;
	if(a = 15)
	{
		printf("Hi");
	}
	else
	{
		printf("Bye");
	}

OUTPU: Hi

--------------------------------------------------------
In Java: 
-------------------------------------------------
	int a = 10;
	if(a = 15)
	{
		SOP("Hi");
	}
	else
	{
		SOP("Bye");
	}

OUTPU: Compile Time error
===================================================
LAB-1:
-----------
a) WAP to check whether a value is even or odd
b) WAP to take any number between 1 to 7 and print name of day.
====================================================================
Switch statements:
-----------------------
Till Java4 : char, byte, short, int
From Java5: enum, Wrapper classes
From Java7: String

Syntax:
-----------

	switch(<var>)
	{
	
		case <label-1> :
					------
					------
	    case <label-2> :
					------
					------
		case <label-n> :
					------
					------
		default: 
					------
					------
	}

Example:
-----------

		int day = 4; // user input;

		switch (day) {
		case 1: {
			System.out.println("Monday");
			break;
		}
		case 2: {
			System.out.println("Tuesday");
			break;
		}
		case 3: {
			System.out.println("Wednesday");
			break;
		}
		case 4: {
			System.out.println("Thursday");
			break;
		}
		case 5: {
			System.out.println("Friday");
			break;
		}
		case 6: {
			System.out.println("Saturday");
			break;
		}
		case 7: {
			System.out.println("Sunday");
			break;
		}
		default:
			System.out.println("Are you CRAZY !!!");
		}

---------------------------------------------------------------
Loops
Operator
method
method overloading
constructors

Array
---------------------------------


 
























