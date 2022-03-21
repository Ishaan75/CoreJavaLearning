public class Oops {
    // topic 1 :- Data hiding , abstraction , encapsulation and tightly encapsulated class
    // topic 2 :- Is a relationship (Inheritance)
    // topic 3:- has a relationship (composition or aggregation)
    // topic 4:- Overloading
    // topic 5:- Overriding
}


// topic 2 : Is a relationship
class Bike{
    // moveForward()
    // moveBackward()
    // applyBrakes()
}
class ElectricBike extends Bike{
    // fillBattery()
    // showRechargeBatteryNotification()
}

/* topic 3  -- has a relationship */

class Engine{
    // engine specific functionality
}
class Car{
    Engine e = new Engine();
}
class Truck{
    Engine e = new Engine();
}


/* Topic :- Polymorphism */

/* topic 5: Overloading*/

// Two methods are said to be overloaded if and only if both the methods are having same name but different argument types or their numbers
// examples
// abs(int i) , abs(float f) , abs(long l)

class Overloading{
    public void m1(int i){
        System.out.println("In int argument method");
    }
    public void m1(float f){
        System.out.println("In float argument method");
    }
}
class Animal{
}
class Monkey extends Animal{
}
class Demo{
    public void fun1(Animal a){
        System.out.println("Animal version");
    }
    public void fun1(Monkey m){
        System.out.println("Monkey Version");
    }
}
class Test{
    public static void main(String args[]){

        Overloading o = new Overloading();
        o.m1(10); // int arg
        o.m1(10.5f); // float arg
        o.m1('a');
        // byte -> short -> int -> long -> float -> double
        // char -> int -> long -> float -> double


        Demo d= new Demo();
        Animal a = new Animal();
        d.fun1(a);

        Monkey m = new Monkey();
        d.fun1(m);

        Animal a1 = new Monkey();
        d.fun1(a1);
    }
}


/* Topic 6: Over riding */

class Parent{
    boolean arrangeMarriage;
    public void assets(){
        int property;
        float cash;
        int land;

    }
    public void marriage(){
        arrangeMarriage = true; // overridden method
    }
}
class Child extends Parent{

    public void marriage(){
        arrangeMarriage = false; // overriding method
    }
}


/* Overriding wrt static methods OR Overriding vs Method Hiding */

class P{
    public static void method1(){
        System.out.println("Parent Class");
    }
}
class C extends P{
    public static void method1(){
        System.out.println("Child Class");
    }
}
class OverridingStatic{
    public static void main(String args[]){
        P p = new P();
        p.method1(); // Parent

        C c = new C();
        c.method1(); // Child

        P p1 = new C();
        p1.method1();// parent
    }
}
























/* Overriding wrt var args method */

class Par{
    public void met1(int... x){
        System.out.println("Parent Class");
    }
}

class Ch extends Par{
    public void meth1(int x){
        System.out.println("Child class");
    }
}

class Sample{
    public static void main(String args[]){

        Par p = new Par();
        p.met1(10);

        Ch c = new Ch();
        c.meth1(20);

        Par pc = new Ch();
        pc.met1(30);

    }
}



