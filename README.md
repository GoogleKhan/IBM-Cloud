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
Loops:
----------
1. for
2. while
3. do-while
4. forEach/enhanced for loop (used with array /collections)

	for(<type> <var> : <arrayORcollection>)
	{
		//body
	}
------------------------------------------------------------------
initialization
condition
updation

----------------
1. For loop:
=============
 for(<initialization>; <condition>; <updation>)
	{
		//body
	}
	
2. While loop:
=============
<initialization>;
	----
	----
 while(<condition>)
	{
		//body
		<updation>
	}
	
1. Do-While loop:
=============
 <initialization>;
	----
	----
	do{
		//body
		<updation>
	}
 while(<condition>);
-------------------------------------------------------------	
Operators:
=========
1. Arithmetic Operators
2. Relational Operators
3. Equality Operators
4. String concatenation Operators
5. Boolean Logical Operators
6. Variable increment/decrement Operators
7. Ternary Operators
8. Assignment operator
9. Bitwise operator (NC)
10. new operator
11. instanceof operator (NC)

--------------------------------------------------------
1. Arithmetic Operators:
==========================
a) +, -, *, /, %

b) int a =10, b =3;
	System.out.println(a + b); // 13
	System.out.println(a - b); // 7
	System.out.println(a * b); // 30
	System.out.println(a / b); // 3 (Quotient)
	System.out.println(a % b); // 1 (Remender)

b) Extended assignment operators:
     a = a + b; ==> a += b;
     a = a - b; ==> a -= b;
     a = a * b; ==> a *= b;
     a = a / b; ==> a /= b;
     a = a % b; ==> a %= b;	 

d) int x = 10;
	System.out.println(x/0); // java.lang.Arithmetic Exception
	System.out.println(x/0.0); // Infinity
	System.out.println(-x/0.0); // -Infinity
	System.out.println(0.0/0.0); // NaN(Not a Number)

e) Max(int, <type1>, <type2>, .....)
	     byte b1 = 10;
		 short s1 = 20;
		 
		 int x = b1 + s1; // MAX(int, byte, short )
------------------------------------------------------
byte -> short -> int -> long -> float -> double
        char ->  int
------------------------------------------------------
2. Relational Operators:
==========================
a) <, >, <=, >=

b) Operands: numeric data types
	result : boolean

Example:
-----------
		int x =15;
		boolean b = 10 < x < 20; // Error
				  =  true < 20 
		
Solution: boolean b = (10 < x) & (x < 20); // true


3. Equality Operators:
==========================
a) ==, != 

b) Operands: all types
	result : boolean 

Example:
----------
   int i =10;
   boolean b = i == 15; // false
		   b = b == false; // true

  Car c1 = new Car();
  Car c2 = new Car();
  
  boolean b2 = c1 == c2; // false.
  
-----------------------------------------------
4. String concatenation Operators:
-----------------------------------
     int a = 10;
	 int b = 5;

	 int x = a + b; // 15
-----------------------------
    String a = "I love ";	 
    String b = "Java";	

	String y = a + b; // "I love Java"
----------------------------------------------

    String a = "ABC";	 
    int b = 123;	

	String z = a + b; // "ABC123"
 
-----------------------------------------------
5. Boolean Logical Operators:
===============================
a) &, |, ^, !

b) a & b ==> a.b
   a | b ==> a+b
			 _       _
   a ^ b ==> a.b + a.b
	
c) Operands: boolean expr
	result : boolean

Example:
-----------
		int x =15;
	
       boolean b = (10 < x) & (x < 20); // true

-----------------------------------------------------------------
6. Variable increment/decrement Operators:
==============================================
a) ++, --  (pre/post)

		int i = 10;

		int j = ++i; // pre-increment

		System.out.println(i); // 11
		System.out.println(j); // 11
 -----------------------------------------
		int i = 10;

		int j = i++; // post-increment

		System.out.println(i); // 11
		System.out.println(j); // 10

----------------------------------------------------------------------
7. Ternary Operators:
------------------------
Syntax:
-------
		<boolExpr> ? <expr1> : <expr2>
					  (true)   (false)

     int a = 20, b = 15;

		int max;

		if (a > b) {
			max = a;
		}
		else {
			max = b;
		}
		
		System.out.println(max);
------------------------------------------
		int a = 20, b = 15;

		int max = a > b ? a : b;

		System.out.println(max);

-----------------------------------------------------------------------	
8. Assignment operator:
=============================
a)    =

b) widening is done implicitly.
   narrowing requires casting.
   
   int x = 2.3 ; //ERROR cannot assign double to int
  
problem:  float f = 2.5; //ERROR cannot assign double to float

Solution-1:  float f = (float)2.5; //use casting
Solution-1:  float f = 2.5F; //only for float

Lab-2:
========
WAP to find greatest number among three numbers
	a) using if-else
	b) using ternary operator

===========================================================================
Methods:
==============
-> It is a block or group of statements which can be called by another code multiple times.

Syntax: 
--------
	<modifier> <returnType> <name>(<parameterList>) <throws>
			{
				//body
			}

Example:
----------
		void foo()
			{
				// body
			}

calling the methods:
----------------------
  <ClassName>.<Method>(<parameters>); // only static methods
  <ObjRef>.<Method>(<parameters>); // instance as well as static methods

------------------------------------------------------------------------------
Method Overloading:[Compile-time | Early | Static polymorphism]
---------------------------------------------------------------
Within a Java class two or more than two methods having same name but 
	different parameters called Overloaded method and this process is caled method overloading.

IF METHOD NAMES ARE SAME:
	a) Number of parameters 
	b) Data type of parameters
	c) Order of data types

----------------------------------------------------------------
constructors:
-----------------
1. Constructor are special members of a class.
2. It is similar to the method but not a method.
3. Constructors are used to construct initial state of an object.
4. Rules:
	a) Same name as of the class.
	b) Only access modifier is permissible (public, protected, private, default)
	c) No return type even void.

*) Every class must have atleast one constructor
*) Constructor can be ovrloaded

Lab-3:
--------------------------------------------------------------------

Arrays:
---------
1. Array is a linear data structure.
2. Array is the collection of similar kind of objects/data/elements
3. Array are indexed and index starts from zero.
4. In java arrays are objects.
5. If we use an invalid index with array, we will get AIOBE(ArrayIndexOutofBoundsException).
6. Every array has an instance field named 'length' which store the size of an array.
 
Syntax:
---------
a.  <type>[] <var> = new <type>[<size>]

		int[] arr = new int[3];
				arr[0] = 13;
				arr[1] = 23;
				arr[2] = 99;
				

b.  <type>[] <var> = {<values>}
			
			int[] brr ={13, 23, 99};
--------------------------------------------------------------------------------
How to access array elements:
-----------------------------
1. for loop:
-------------
 for(int i=0; i < arr.length; i++)
	{
		
		int x = arr[i];
		SOP(x);
		
	}

2. Enhance for loop:
------------------------
 for(int x : arr)
    {
		SOP(x);
	}

---------------------------------------------------------------------
Access Modifier:
-----------------
a) public : is accessible from everywhere.

b) protected : a) is only accessible from its package. Package must be same. 
			   b) It can go out side the package through inheritance.	
			   
c) default : is only accessible from its package.Package must be same. Never goes out side the package.

d) private :  Never goes out side the class.is only accessible from its class.































