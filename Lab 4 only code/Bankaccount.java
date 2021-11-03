public class Bankaccount
{
  String name,address,acountId;
  Double balance;
  public Bankaccount(){
  }
  public Bankaccount( String n,String i,String a, Double c){
    name=n;
    acountId=i;
    address=a;
    balance=c;
  }
  public String getName(){
    return name;
  }
  public String getAccountID(){
    return acountId;
  }
 
  public String getAddress(){
    return address;
  }
  public double getBalance(){
    return balance;
  }
  public void addInterest(){
   this. balance +=balance+((7*balance)/100);
    
}    
}
