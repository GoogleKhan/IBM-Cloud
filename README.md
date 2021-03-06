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


Lab-3:
------------
a) Reverse an array 
b) U have 2 different arrays and u have to merge into a single array.
c) Take an array of numbers and print sum and average of its elements.
---------------------------------------------------------------------
Access Modifier:
-----------------
a) public : is accessible from everywhere.

b) protected : a) is only accessible from its package. Package must be same. 
			   b) It can go out side the package through inheritance.	
			   
c) default : is only accessible from its package.Package must be same. Never goes out side the package.

d) private :  Never goes out side the class.is only accessible from its class.

-------------------------------------------------------------------------------------
Package:
-----------
It is an encapsulation mechanism to group related classes and interfaces.

hospital
	|- A.java, B.java, C.java
	|- D.java, E.java
	|- F.java, G. java, H.java ...


hospital
	|- A.java, B.java
	|- doctors
		|- C.java
		|- cardio
			|- D.java
		|- ent
			|- E.java
    |- patient
		|- F.java
	|-staff
		|- G.java, H.java


package test;

import hospital.doctors.cardio.D; // import class D only from the package 
import hospital.staff.*; // will import all public classes from the package

public class Test {

	public static void main(String[] args) {

		p1.A a1 = new p1.A(); // fullyQualifiedName
		p2.B b1 = new p2.B();

		D d1 = new D(); // import statement
		
		G g1= new G();
		}
}

---------------------------------------------------------------------------
Java Coding Convension (not a rule)
--------------------------------------
Class Name           -> My, MyFirst, MyFirstClass
method/variable name -> my, myFirst, myFirstVar
Enum/Constants       -> MY, MY_FIRST, MY_FIRST_CONT

-------------------------------------------------------------------------
1. Syntax error or compile time errors
2. Exception or runtime error
3. logical errors


Exception Handling:
--------------------
1. Exceptions are runtime errors.
2. In java exceptions are objects derived from Throwable class.
3. When exception accurs and there is no code for handling, 
	then program will terminate abnormally.

TRY-CATCH-FINALLY
=====================
try{
	// risky code
}
catch(Exception e){
	// exception handling code
}
finaly{
	// clean up code
}

-> a try can have zero or more catch and/or zero or 1 finally.

-> a try without catch/finally or catch/finally without try is an error.

THROWS
===============
*) Exceptions are always occured at Runtime.


Exceptions can be divided into 2 diffrent categories:
	1. Unchecked Exception
		-> Object of Error and RuntimeException and their sub classes called unchecked exceptions.
		-> Compiler will not check (force) to handle these kind of exceptions.
		-> They are either irrecoverables or programming mistakes and we should not handle them but try to avoid them
			
	2. Checked Exception
		-> Objects of all other exceptions called checked exceptions.
		-> Compiler will check (force) to handle these kind of exceptions.
        -> We have to write exception handling code	
				either -> try-catch
				or     -> throws

------------------------------------------------------------
THROW:
-----------
We can create custom exceptions in Java.

-> throw keyword is used to throw exceptions programatically.

public class MyException extends  Exception
{
	public MyException(String reason){
		super(reason);
	}
}

--------------------------------------------------------------
Object Oriented Programming:
------------------------------
Inheritance:
--------------
It is a way of code reusability.

Different kind of Inheritance:
-------------------------------
1. Single
2. Multiple

--------------------------------
-> A class can use extends keyword to specify its parent.
-> In Java, Classes support single inheritance.
-> If any class doesnot specify its parent, then it will inherit java.lang.Object class.
-> For multiple inheritance, interface comes into the picture.
--------------------------------------------------------------
Method Overriding:
---------------------
-> Between the two classes having IS-A relationship(i.e. inheritance) both 
		have same method having same name and same parameters called method overriding.
		
Rules
=======
1. Same name and same parameter.

2. Return Type:
-----------------
	1. if primitive , must be same
	2. if reference , it can be same or any sub type (co-varient type).

3. Accessbility:
-----------------
	1. private -> deafult -> protected -> public
	2. It can be widen.

4. Throws clause:
-----------------
	1. It can be narrow. ( a) no throws  b) throws same c) throws any sub type not super type)

*) constructor, private method, static method, final method will not take participation in method overriding.

-----------------------------------------------------------------------------
abstract and final keywords:
----------------------------

public class A
	{
	
		void f1(){} // concrete method
		void f2(){} // concrete method
	
	}

-------------------------
abstract public class B
	{
	
		 void f3(){} // concrete method
abstract void f4();  // abstract method
	
	}

-------------------------
abstract public class C
	{
	
		void f5(){} // concrete method
		void f6(){} // concrete method
	
	}

-------------------------
Abstract class:
----------------
-> Abstract class restrict its intanciation. 
	Means no one can create objects for abstract class, but inherit it.

-> When the class is so general like Student, Animal, Vehicle.

  A a1 = new A(); // OK
  B b1 = new B(); // Error
  C c1 = new C(); // Error

-> a method without body is called abstract method. Sub classes will provide the body.

---------------------------------------------------------------------------------------------
Final:
---------
-> It can be used with class, method, variable (member and local both).

-> Final class cannot be inherit. only object creation is allowed
-> Final method cannot be overridden.
-> Final variable cannot re-assign (final + variable = CONSTANT)
-------------------------------------------------------------------------------
Interface: (Till Java7)
-----------------------
-> Interface is an user define data type.
-> Iterface provides multiple inheritance.
-> Like abstract class no one can create objects of interfaces
-> Interface are always super type.

Syntax:
----------
	<modifier> interface <name> <extends>
		{
			// body
		}
	
Examples:
-----------
	public interface I
		{
		
			        void m1(); // public abstract void m1()
	public abstract	void m2();
		
		}

    public interface J
		{
		
			int i = 10; // public static final int i = 10;
		
		}

    public interface K extends I, J
		{
		
		}


-> Every method in side interface body are public and abstract by default.
-> Every variable declared inside the interface body are by default public abstract final


class   -----extends----->   class
class   -----implements----->   interface

interface   -----extends----->   interface
interface   ------ERROR---->   class 

-----------------------------------------------------------------------------------
java.lang.String class :
-------------------------
-> String class object represents sequence of characters.
	
		String name = "Shadab Ahmad Khan";

-> String class object is immutable/non-changble.

------------------------------------------------------
How many ways we have to create Strig objects:

1. Using literal:
===================

		String s1 = "Java";
		String s2 = "Java";
		
2. Using new operator:
======================

		String s3 = new String("Python");
		String s4 = new String("Python");
----------------------------------------------------
1. int length()
2. char charAt(int index)
3. int indexOf(char ch)
4. int lastIndexOf(char ch)
5. String substring(int begin, int end)  -> end index is excluded
6. String substring(int begin)
7. boolean equals(String str)
8. boolean equalsIgnoreCase(String str)
9. int compareTo(String str)
10. int compareToIgnoreCase(String str)
11. String replace(String oldStr, String newStr)
12. String toLowercase()
14. String toUppercase()
15. String trim()
16. boolean startsWith(String str)
17. boolean endsWith(String str)
18. String[] split(String delemeter)
19. String concat(String)
20. String String.valueOf(X)


		String name = "Shadab Ahmad Khan";
		int l = name.length();
		System.out.println("Length: " + l);

		char ch = name.charAt(9);
		System.out.println(ch);// 'm'

		int index = name.indexOf('a');
		System.out.println("Index of a is : " + index);

		int lastIndex = name.lastIndexOf('a');
		System.out.println("Last Index of a is : " + lastIndex);

		String s1 = name.substring(7, 12);
		System.out.println(s1);

		String s2 = name.substring(13);
		System.out.println(s2);

		String str = name.replace('a', 'x');
		System.out.println(str);

		String lower = name.toLowerCase();
		System.out.println(lower);

		String upper = name.toUpperCase();
		System.out.println(upper);

		String s3 = "   Hello Brother    ";
		System.out.println(s3 + ", " + s3.length());

		String s4 = s3.trim();
		System.out.println(s4 + ", " + s4.length());

		System.out.println(name.startsWith("Sha"));
		System.out.println(name.endsWith("an"));

		String a = "I love ";
		String b = "Java";

		String y = a + b; // "I love Java"
		String z = a.concat(b);

		System.out.println(y + " : " + z);

		int i = 10;
		// Number or anything to String
		String s5 = i + "";
		// OR
		String s6 = String.valueOf(i);

		String[] words = name.split(" ");
		System.out.println(Arrays.toString(words));

------------------------------------------------
        String s1 = "Java";
		String s2 = "Java";

		String x = "JAVA";

		boolean b1 = s1 == s2; // true (Reference/address equality)
		boolean b2 = s1.equals(s2); // true (object equality)

		boolean b = s1.equals(x); // false
		b = s1.equalsIgnoreCase(x); // true

		System.out.println("------------------------------");

		String s3 = new String("Python");
		String s4 = new String("Python");

		boolean b3 = s3 == s4; // false (Reference/address equality)
		boolean b4 = s3.equals(s4); // true

--------------------------------------------------------------------------
        String s1 = "Java";
		String s2 = "Lava";

		int x = s1.compareTo(s2);

		// if x > 0, then s1 > s2
		// if x < 0, then s1 < s2
		// if x == 0, then s1 == s2
		System.out.println(x);

		// A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
		// J - L = -2
		// 74 - 76 = -2
---------------------------------------------------------------------------
java.lang.StringBuffer(Thread-safe) and/or java.lang.StringBuilder(Not a thread-safe):
--------------------------------------------------------------------------------------
-> StringBuffer or StringBuilder class object represents sequence of characters.
	
		StringBuffer name = new StringBuffer("Shadab Ahmad Khan");
		StringBuilder name = new StringBuilder("Shadab Ahmad Khan");

-> StringBuffer or StringBuilder class object is mutable/changble.

===================================================================================
Wrapper classes:
-----------------
boolean    -> Boolean

char       -> Character

byte       -> Byte
short      -> Short
int        -> Integer
long       -> Long

float      -> Float
double     -> Double

void       -> Void

-------------------------------------------

int i = 10;

Integer j = new Integer(10);

--------------------------------------------------
Usecase #1:
-------------
 Range for numeric data type.

	    System.out.println("--------Byte--------------");

		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);

		System.out.println("--------Short--------------");

		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);

		System.out.println("--------Integer--------------");

		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);

		System.out.println("--------Long--------------");

		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);

		System.out.println("--------Float--------------");

		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);

		System.out.println("--------Double--------------");

		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		System.out.println("--------Character--------------");

		System.out.println(Character.MIN_VALUE);
		System.out.println(Character.MAX_VALUE);
=================================================================================
Usecase #2:
-------------
-> Convert String values into numeric data type.

		XXX.parseXXX(String)

a) Numeric to String:
=======================
		int x = 10;
		String s = x + "";  
			OR 
		String s = String.valueOf(x);


b) String to Numeric:
=======================
   String s = "101";
   int x    = (int)s; // ERROR
   
   int x = Integer.parseInt(s);  OR int x = Integer.valueOf(s);
   float y = Float.parseFloat(s); OR  float y  = Float.valueOf(s);
   double z= Double.parseDouble(s); OR  double z = Double.valueOf(s);
   
  Strin str ="Abc100";
  
  int xyz = Integer.parseInt(str); // NumberFormatException
=================================================================================
UseCase#3:
---------------
In collection Framework and Generics

=======================================================================
java.lang.Object :
------------------
1. int hashCode():
--------------------
-> it is an id assign to the every object by JVM. It is used in Collection Framework.
	
        Employee e1 = new Employee();		
		Employee e2 = new Employee();
		
		int h1 = e1.hashCode();
		System.out.println(h1);
		
		int h2 = e2.hashCode();
		System.out.println(h2);

2. boolean equals(String):
----------------------------
-> To check equality of objects.
	
	@Override
	public boolean equals(Object obj) {

		Employee e2 = (Employee) obj;

		String name1 = this.getName();
		String name2 = e2.getName();

		return name1.equals(name2);

//		int age1 = this.getAge();
//		int age2 = e2.getAge();
//		return age1 == age2;
	}

3. String toString():
-----------------------
-> It will return String representation of a Object.

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}



4. Object clone() throws Clonable:
-----------------------------------
-> It is used to create a exact duplicate copy of an object.

@Override
	public Employee clone() throws CloneNotSupportedException {
		return (Employee) super.clone();
	}


       Employee e1 = new Employee();
		e1.setAge(24);
		e1.setName("Shadab");
		e1.setSalary(1234.5);

		Employee e2 = e1.clone();



5. Class getClass():
--------------------
-> Returns the runtime class of this Object. 

6. void finalize():
--------------------

It is a method of Object class, called by Garbage Collector(GC) just before destroying the object.

======================================================================================================
Collection Framework [java.util.*]
------------------------------------
-> It is the Data Structure of Java Programming.

java.util.Set:
---------------
-> Set provides uniqueness. Means duplicate values are not allowed.
-> Set does not maintained any order.
-> We cannot use index with Set.

java.util.List:
---------------
-> List can contains duplicate elements.
-> List maintains insertion order.
-> We can index with list


java.util.Map:
------------------
-> It is a key-value pair.
-> Keys should be unique.


Genrics:
--------------
Generics provide Type Safety.

List<Integer> numbers = new ArrayList<Integer>();

---------------------------------------------------------------

Sorting:
---------














