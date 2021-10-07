class Person{
    void message()
    {
        System.out.println("THIS IS PERSON CLASS");
    }
}
class Student extends Person {
    void message()
    {
        System.out.println("THIS IS STUDENT CLASS");
    }
    void display()
    {
        message();
    }
}
public class SuperEx {
    public static void main(String args[]) {
     Student s=new Student();
     Person p=new Person();
     p.message();
     s.display();
     s.message();
     
    }
}