 class one{
 int a=40;
}
class two extends one{
 int b=10;
 public static void main(String args[]){
 two p=new two();
 System.out.println(p.a+p.b);
 }
}

//multilevel inheritance
class one{
 int a=40;
}
class two extends one{
 int b=40;
}
class three extends two{
 int c=10;
 public static void main(String args[]){
 three p=new three();
 System.out.println(p.a+p.b+p.c);
 }
}

 //hybrid
class one{
 int a=30;
}
class two extends one{
 int b=40;
}
class three extends one{
 int c=10;
}
class four
{
 public static void main(String args[]){
 three p=new three();
 System.out.println(p.a+p.c);
 }
}

 //aggregation
class Operation{ 
int square(int n){ 
 return n*n; 
 } 
} 
 
class Circle{ 
 Operation op;//aggregation 
double pi=3.14; 
 
double area(int radius){ 
 op=new Operation(); 
 int rsquare=op.square(radius);//code reusability (i.e. delegates the method call). 
 return pi*rsquare; 
 } 
 public static void main(String args[]){ 
 Circle c=new Circle(); 
 double result=c.area(5); 
 System.out.println(result); 
 } 
}


 //this keyword
class Student{ 
int a,b;
Student(int a,int b){ 
this.a=a; 
this.b=b; 
} 
void display(){System.out.println(a+b);} 
} 
 
class TestThis2{ 
public static void main(String args[]){ 
Student s1=new Student(3,5); 
Student s2=new Student(6,7); 
s1.display(); 
s2.display(); 
}}


 class A{ 
void m(){System.out.println("hello m");} 
void n(){ 
System.out.println("hello n"); 
//m();//same as this.m() 
this.m(); 
} 
} 
class TestThis4{ 
public static void main(String args[]){ 
A a=new A(); 
a.n(); 
}}


//array
class Testarray{ 
public static void main(String args[]){ 
int a[]=new int[5];//declaration and instantiation 
a[0]=10;//initialization 
a[1]=20; 
a[2]=70; 
a[3]=40; 
a[4]=50; 
//traversing array 
for(int i=0;i<a.length;i++)//length is the property of array 
System.out.println(a[i]); 
}}


//method overloading
class Adder{ 
static int add(int a,int b){return a+b;} 
static int add(int a,int b,int c){return a+b+c;} 
} 
class TestOverloading1{ 
public static void main(String[] args){ 
System.out.println(Adder.add(11,11)); 
System.out.println(Adder.add(11,11,11)); 
}}
[8:48 PM, 5/11/2022] LATHA: // method overriding
class TestOverloading4
{ 
public static void main(String[] args)
{System.out.println("main with String[]");} 
public static void main(String args)
{System.out.println("main with String");} 
public static void main()
{System.out.println("main without args");} 
}


//Creating a parent class. 
class Vehicle{ 
 //defining a method 
 void run(){System.out.println("Vehicle is running");} 
} 
//Creating a child class 
class Bike2 extends Vehicle{ 
 //defining the same method as in the parent class 
 void run(){System.out.println("Bike is running safely");} 
 
 public static void main(String args[]){ 
 Bike2 obj = new Bike2();//creating object 
 obj.run();//calling method 
 } 
}


 //super as obj
class Animal{ 
void eat(){System.out.println("eating...");} 
} 
class Dog extends Animal{ 
void eat(){System.out.println("eating bread...");} 
void bark(){System.out.println("barking...");} 
void work(){ 
super.eat(); 
bark(); 
} 
} 
class TestSuper2{ 
public static void main(String args[]){ 
Dog d=new Dog(); 
d.work(); 
}}



//super as method
class Animal{ 
void eat(){System.out.println("eating...");} 
} 
class Dog extends Animal{ 
void eat(){System.out.println("eating bread...");} 
void bark(){System.out.println("barking...");} 
void work(){ 
super.eat(); 
bark(); 
} 
} 
class TestSuper2{ 
public static void main(String args[]){ 
Dog d=new Dog(); 
d.work(); 
}}


//super as a constructor
class Animal{ 
Animal(){System.out.println("animal is created");} 
} 
class Dog extends Animal{ 
Dog(){ 
super(); 
System.out.println("dog is created"); 
} 
} 
class TestSuper3{ 
public static void main(String args[]){ 
Dog d=new Dog(); 
}}


//this as a contructor
class A{ 
A(){System.out.println("hello a");} 
A(int x){ 
this(); 
System.out.println(x); 
} 
} 
class TestThis5{ 
public static void main(String args[]){ 
A a=new A(10); 
}}
