public class ComplexNumber extends RealNumber
{
  double imaginaryvalue=1.0;
  public ComplexNumber(){
    setRealValue(1.0);
  }
  public ComplexNumber(double n,double i){
    super(n);
    imaginaryvalue=i;
  }
    
  public String toString(){
    return("RealPart:" +getRealValue() + "\n" + "ImaginaryPart:" + imaginaryvalue);
  }
  public void check(){
      System.out.println("I'm in ComplexNumber class");
    ping();
     System.out.println("Checking ended.");
}
}
  