public class Account {
   
        double balance;
        void addBalance(double value)
        {
            balance=balance+value;
        }
        void withDraw(double Value)
        {
            balance=balance-Value;
        }
        double getBalance()
        {
            return balance;
        }
         
    public static void main(String args[]) {
      Account acc=new Account();
      acc.addBalance(1000);
      acc.addBalance(acc.getBalance()*2);
      acc.withDraw(50);
      System.out.println(acc.getBalance());
    }
}