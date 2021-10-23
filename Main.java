//declare an interface with two methods area and perimeter one variable pi implement the interface by two different classes square and circle
interface Maining {
   
    double pi=3.14;
}
class Square implements Maining{
    public int areaMethod(int a){
        return (a*a);
    }
    public int  perimeterMethod(int b){
        return (4*b);
    }
}
class Circle implements Maining{
    public double areaMethod(int c){
        return (pi*c*c);
    }
    public double  perimeterMethod(int d){
        return (2*pi*d);
    }
}
class Main
{
    public static void main(String args[]){
        Square obj=new Square();
        Circle obj1=new Circle();
        System.out.println(obj.areaMethod(4));
        System.out.println(obj.perimeterMethod(9));
        System.out.println(obj1.areaMethod(4));
        System.out.println(obj1.perimeterMethod(9));
    }
}
