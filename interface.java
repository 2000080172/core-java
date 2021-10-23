interface FirstInterface {
    int addMethod(int x, int y);
    float divMethod(int m,int n);
    void display();
    int VAR1=10;
    double VAR2=60.5;
}
class Myclass implements FirstInterface{
    public int addMethod(int a,int b){
        return (a+b);
    }
    public float divMethod(int i,int j){
        return (i/j);
    }
    public void display(){
        System.out.println("variable 1:"+VAR1);
        System.out.println("variable 2:"+VAR2);
    }
}
public class MainClass
{
    public static void main(String args[]){
        Myclass obj=new Myclass();
        System.out.println(obj.addMethod(5,6));
        System.out.println(obj.divMethod(9,6));
        obj.display();
        
    }
}
