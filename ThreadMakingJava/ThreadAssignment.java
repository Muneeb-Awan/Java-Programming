//Program Is Written by Muhammad Muneeb 
//Assigned By Prof Abdul-Wahab.
// Assignment A04: Thread Assignment of Printing Even and Odd Numbers
/*
 100 points
 Place and Time : Think Dome Studio (Wapda Town, Lahore), 5:40PM 08-August-2023
Create a Custom Thread 
that prints numbers 
one thread  instance   name it Even Thread  will print  Even Numbers  upto  n 
one thread  instance   name it Odd Thread  will print  Odd  Numbers  upto  m 
override toString Method
Place your code in appropriate classes
Upload your code on Github  and also share the link over here 
*/
public class ThreadAssignment{
  static void EvenOdd(int n){
    if(n%2==0){
    EvenThread t1 = new EvenThread();
    t1.runFor(n);
    }else{
    OddThread t2 = new OddThread();
    t2.runFor(n);
    }
  }
  public static void main(String[] args){
    EvenOdd(3);
    EvenOdd(4);
  }

}
class EvenThread extends Thread{
  public void runFor(int n){
   System.out.println("A Speacial Thread is Running to Tell You That");
   System.out.println("Given Number "+n+" is Even");
  }
}
class OddThread extends Thread{
  public void runFor(int n){
   System.out.println("A Speacial Thread is Running to Tell You That");
   System.out.println("Given Number "+n+" is Odd");
  }
}
