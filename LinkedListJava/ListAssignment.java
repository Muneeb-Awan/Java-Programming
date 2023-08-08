//Program Is Written by Muhammad Muneeb 
//Assigned By Prof Abdul-Wahab.
// Assignment A01: Singly Linked List of Square  in Java
/*
 100 points
Place and Time : Think Dome Studio (Wapda Town, Lahore), 6:53PM 08-August-2023
Create a Singly LinkedList of   Square(shape)   in Java
also create the get area method
and store the date and time of creation of this shape.
Do write Setters / Getters 
Parameterized and Non Parameterized Constructors
override toString Method
Place your code in appropriate classes
Follow Proper Naming Convention / like  Camel Notation.
Upload your code on Github  and also share the link over here 
*/
public class ListAssignment{
  public static void main(String[] args){
    LinkedList mylist = new LinkedList();
    Squre s = new Squre(2,2);
    mylist.insert(s);
    mylist.print();
    System.out.println("All Good");
  }
}
class Shape{
 static double area;
 public static void getArea(){
  //nothing here
 }
}
class Squre extends Shape{
  static int length;
  static int width;
  Squre(int l,int w){length = l;  width = w;}
  public static void getArea(){
   area = length*width;
   System.out.println("Area of Squre is : " + area);
  }
}
class Node{
  Squre data;
  Node next;
  Node(Squre s){ data = s; }
}
class LinkedList{
  static Node head;
  public static void insert(Squre s){
    Node assign = new Node(s);
    if(head == null){head = assign;}
    else{
     Node temp = head;
     while(temp.next!=null){
     temp = temp.next;
     }
     temp = assign;
    }
  }
  public static void print(){
    Node temp = head;
    while(temp!=null){
      temp.data.getArea();
      temp = temp.next;
    }
  }
}