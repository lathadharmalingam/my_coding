//super as method
class Animal{ //parent method
void eat(){System.out.println("eating...");} 
} 
class Dog extends Animal{ //extends keyword is used to extend the parent attributess
void eat(){System.out.println("eating bread...");} 
void bark(){System.out.println("barking...");} 
void work(){ 
super.eat(); //recalls the parent nodes behaviour
bark(); 
} 
} 
class TestSuper2{ 
public static void main(String args[]){ 
Dog d=new Dog(); 
d.work(); 
}}
