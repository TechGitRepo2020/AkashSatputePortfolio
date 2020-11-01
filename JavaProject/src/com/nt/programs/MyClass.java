package com.nt.programs;

/*class Animal
{
  String name = "animal";
  String makeNoise()  { return "generic noise"; }
}
class Dog extends Animal 
{
  String name = "dog";
  String makeNoise() {  return "bark"; }
}
public class Test 
{
  public static void main(String[] args)
  { 
   Animal an = new Dog();
   System.out.println(an.name+" "+an.makeNoise());
  }
}*/

/*class A
{
	public void m1()
	{ System.out.println("A"); }
}
public class B extends A
{
	public void m1()
	{ System.out.println("B"); }

	public static void main(String []args)
	{
		A a = new B();
		a.m1();
	}
}*/
/*
public class myprog
{ 
   public static void main(String argv[])
   { 
     System.out.println(argv[1]) ;
   }
}
*/
public class MyClass 
{
  public static void main(String[] args) 
  {
   B b = new C();
   A a = b;
   if (a instanceof A) System.out.println("A");
   if (a instanceof B) System.out.println("B");
   if (a instanceof C) System.out.println("C");
   if (a instanceof D) System.out.println("D");
  }
}
 
class A {}
class B extends A {}
class C extends B {}
class D extends C {}