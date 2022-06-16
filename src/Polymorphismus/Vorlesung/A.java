package Polymorphismus.Vorlesung;

public class A {
    public void f() {
        System.out.println("A");
    }

}

class B extends A {
    public void f() {
        System.out.println("b");
    }

}

class Polymorphie {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
        B b = new B();

        a1.f();
        a2.f();
        b.f();
    }
}
