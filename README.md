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
