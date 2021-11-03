public class Dog { 
private String color = "Black";
public Dog(){
}
public Dog(String c){
  color=c;
}
public void bark(){
  System.out.println(color + "Dog is barking");
}
public void changeColor(String n){
  color=n;
}
}


//Red dog is barking 
//Blue dog is barking 
//Brown dog is barking


