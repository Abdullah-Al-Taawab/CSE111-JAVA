import java.util.Scanner;
public class task02
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a num");
    String st=sc.next();
    //sc.close();
    char[] a=st.toCharArray();
    for(int c=0;c<a.length;c++){
      System.out.println(a[c]);
    }
  }
}
