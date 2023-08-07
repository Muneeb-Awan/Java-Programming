import java.util.Scanner;
public class Test{
  public static void main(String[] args){
    Scanner name= new Scanner(System.in);
    System.out.println("Enter Name:");
   String str = name.nextLine();
    for (int i = 0 ; i< str.length()+2;i++){
      try{
   System.out.println(str.charAt(i));
      } catch(Exception e){
      System.out.println(e);
      }
   }
    System.out.println("Code Other then Exception if this works,.....");
  }
}