public class StudentA{
 private String name;
 private double cgpa;
 public StudentA(){
   name="default";
   cgpa=3.0;
 }
 public StudentA(String i, String j){
   name=i+j;
 }
 public String showDetails(){
   return name;
 }
 public void showCGPA(){
   System.out.println(cgpa);
 }
}
 