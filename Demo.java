
public class Tester {
    public static void main(String args[]) {
        try{
      int x=0;
      int y=50/x;
      System.out.println(y);
    }
    catch(ArithmeticException e){
        System.out.println("division by zero");
    }
    System.out.println("after catchstatement: ");
}
}