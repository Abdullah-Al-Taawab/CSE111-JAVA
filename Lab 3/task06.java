import java.util.Scanner;
public class task06
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a word");
    String st=sc.next();
    String con=st.concat("==THE END==");
    System.out.println(st);
    System.out.println(con);
    System.out.println(st);
  }
}