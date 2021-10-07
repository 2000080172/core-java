class Animal{
    void eat()
    {
        System.out.println("eating....");
    }
}
class Dog extends Animal {
    void bark()
    {
        System.out.println("barking....");
    }

}
class Baby extends Dog {
    void weep()
    {
        System.out.println("weeping....");
    }

}
public class SuperEx {
    public static void main(String args[]) {
     Baby d=new Baby();
     d.weep();
     d.bark();
     d.eat();
     
    }
}