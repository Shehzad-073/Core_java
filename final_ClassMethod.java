package lec39_FinalKeyword;
class A{ // final with class stop inheritance
    final void m1(){  // final with method stop overriding
        System.out.println("Inside A m1()");
    }
    void m2(){
        System.out.println("Inside A m2()");
    }

}
class B extends A{
/*    void m1(){ // can't overridden because m1 is final
        System.out.println("Inside B m1()");
    }*/
    void m2(){
        System.out.println("Inside B m2()");
    }
}
public class final_ClassMethod {
    static void main() {
        B b = new B();
        b.m1();
        b.m2();

    }
}
