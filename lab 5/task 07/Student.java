public class Student
{
  String name;
  static int numberOfStudents;
  public Student(){
    name="default";
    numberOfStudents++;
  }
  public Student(String n){
    name=n;
      numberOfStudents++;
  }
  public String getName(){
    return name;
  }
}