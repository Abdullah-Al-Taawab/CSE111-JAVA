import java.util.Scanner;
public class task06{
  public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n=sc.nextInt();
    int count,sum=0,i=1,pos=1;
    for(count=1;count<=n;count++){
      if(pos%2==0){
        sum=sum - (i*i);
      }else{
        sum=sum + (i*i);
      }
      i++;
      pos++;
    }
    System.out.println(sum);
  }
}
//AAT