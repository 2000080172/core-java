class A{
    int a;
    A(){
        a=10;
        System.out.println("in class A construtor");
    }
}
class B extends A{
    int b;
    B()
    {
        b=20;
    
    System.out.println("in class B consturctor");
    }
}
class Main{
    public static void main(String args[]){
        B s1=new B();
    	System.out.println(s1.b);
}
}
