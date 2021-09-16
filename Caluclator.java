class subClass
{
    
    int add(int x,int y)
    {
        int sum;
        sum=x+y;
      return sum;
    }
    int sub(int x,int y)
    {
        int diff;
        diff=x-y;
      return diff;
    }
    int mult(int x,int y)
    {
        int mul;
        mul=x*y;
      return mul;
    }
    int quot(int x,int y)
    {
        int div;
        div=x/y;
      return div;
    }
}
public class Caluclator {
    public static void main(String args[]) {
       subClass sc=new subClass();
        int sum=sc.add(1,2);
        int diff=sc.sub(1,2);
       int mul=sc.mult(1,2);
       int div=sc.quot(4,2);
       System.out.println(sum);
       System.out.println(diff);
       System.out.println(mul);
       System.out.println(div);
       }
       }
