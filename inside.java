class A {
     void m1(){
        System.out.println("inside A");
    }

}
class B extends A {
     void m1(){
        System.out.println("inside B");
    }
     void disp(){
        System.out.println("inside Disp");
    }
}

public class Main{
    public static void main(String args[]) {
     A a=new A();  
     B b=new B();
     A ref;
     ref=a;
     ref.m1();
     ref=b;
     ref.m1();
    
    }
}