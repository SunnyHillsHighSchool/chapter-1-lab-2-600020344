import java.util.Scanner;
import static java.lang.System.*;
class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
  
  int size;
  String name;
  out.print("Enter 1st monster's name : ");
  name = keyboard.next();
  out.print("Enter 1st monster's size : "); 
  size=keyboard.nextInt(); 
  Monster mOne = new Skeleton(name, size);

  out.print("Enter 2nd monster's name : ");
  name = keyboard.next();
  out.print("Enter 2nd monster's size : "); 
  size=keyboard.nextInt(); 
  Monster mTwo = new Skeleton(name, size); 
  out.println("Monster 1 - " + mOne.toString());
  out.println("Monster 2 - " + mTwo.toString());
  if(mOne.isBigger(mTwo)==true)
  {
   out.println("Monster one is bigger than Monster two.");
  }
  if(mOne.isSmaller(mTwo)==true)
  {
   out.println("Monster one is smaller than Monster two.");
  }
  if(mOne.namesTheSame(mTwo)==true)
  {
   out.println("Monster one has the same name as Monster two.");
  }
  if(!(mOne.namesTheSame(mTwo)))
  {
   out.println("Monster one does not have the same name as Monster two.");
  }
}
}
