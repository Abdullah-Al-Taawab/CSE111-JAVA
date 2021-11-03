import java.util.Scanner;
public class task03
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a num");
    String st=sc.next();
     char[] a=st.toCharArray();
    for(int i=0;i<a.length;i++){
      System.out.println("ascii value" + (int)st.charAt(i));
    }
  }
}