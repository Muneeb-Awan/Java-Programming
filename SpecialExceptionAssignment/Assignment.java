//Program Is Written by Muhammad Muneeb 
//Assigned By Prof Abdul-Wahab.
// Assignment A05: Custom Exception
/*
 100 points
Place and Time : Think Dome Studio (Wapda Town, Lahore), 5:03PM 08-August-2023
myfunc(int x )  will throw  MySpecialNumberException  on getting x = 10 , 20 , 30 
caller of myfunc will be force to handle this exception as it is a checked exception
Exception message will have appropriate message if it gets  10 or 20 or 30 
User appropriate try and catches block also write finally block
Place your code in appropriate classes
Upload your code on Github  and also share the link over here =
*/
public class Assignment{
  static void myfun(int val) throws AssignedExceptionBySirWahab{
    if(val==10||val==20||val==30){
    throw new AssignedExceptionBySirWahab(val);
    }
  }
  public static void main(String[] args){
    try{
    myfun(10);
    }catch(AssignedExceptionBySirWahab ae){
     ae.print();
    }
  }

}
class  AssignedExceptionBySirWahab extends Exception{
  public int cause;
  
  AssignedExceptionBySirWahab(int n){
  cause = n;
  }
  public void print(){
    System.out.println("Program has Thrown a User Defined Checked Exception.");
    System.out.println("Given Number "+cause+" is not Aloowed!");
  }

}