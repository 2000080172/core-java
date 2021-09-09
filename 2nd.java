import java.util.Scanner;
class Main{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
int n;
System.out.println("enter n value");
n=obj.nextInt();
int [] a=new int[n];
System.out.println("enter array values:");
for(int i=0;i<n;i++)
{
a[i]=obj.nextInt();
}
System.out.println("enter product value:");
int product=obj.nextInt();
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
if(a[i]*a[j]==product)
{
System.out.println("true");
System.exit(0);
}
}
}
System.out.println("false");
}
}

