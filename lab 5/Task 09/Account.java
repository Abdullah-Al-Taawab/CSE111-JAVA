public class Account{
  String name;
  double balance;
  static double interestRate = 5.0;
  public Account(){
    name = "Default Account";
    balance = 0.0;
  }
  public Account(String name,double balance){
    this.name = name;
    this.balance = balance;
  }
  
  public String nameKi(){
    return name; 
  }
  public double balanceKi(){
    return balance;
  }
  public void nameBoshao(String name){
    this.name = name;
  }
  public void balanceBoshao(double balance){
    this.balance = balance;
  }
  public void withdraw(double balance){
    if(this.balance - balance > 100){
      System.out.println("Withdraw successful! New balance is: " +(this.balance - balance));
    }else{
      System.out.println("The account balance after deducting withdraw amount is equal to or less than minimum. Cannot withdraw");
    }
  }
}