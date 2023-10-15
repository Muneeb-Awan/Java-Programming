import java.util.Random;
public abstract class Shape {
    public abstract void draw();
}

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a triangle");
    }
}
public interface IShape {
    void draw();
}

class Square implements IShape {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}

class Rectangle implements IShape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

class Triangle implements IShape {
    @Override
    public void draw() {
        System.out.println("Drawing a triangle");
    }
}


public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Shape> shapeList = new LinkedList<Shape>();

        Random rand = new Random();
        for (int i = 0; i < 10; i++) { // Create 10 shapes as an example
            int randomShape = rand.nextInt(3); // 0: Square, 1: Rectangle, 2: Triangle
            Shape shape;
            if (randomShape == 0) {
                shape = new Square();
            } else if (randomShape == 1) {
                shape = new Rectangle();
            } else {
                shape = new Triangle();
            }
            shapeList.add(shape);
        }

        // Iterate over the linked list and draw each shape
        Node<Shape> currentNode = shapeList.head;
        while (currentNode != null) {
            Shape shape = currentNode.data;
            System.out.println("Shape ID: " + shape.getShapeID());
            System.out.println("Creation Time: " + shape.getCreationTime());
            shape.draw();
            System.out.println();
            currentNode = currentNode.next;
        }
    }
}

class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
    }
}

class LinkedList<T> {
    Node<T> head;

    public void add(T data) {
        Node<T> newNode = new Node<T>(data);
        newNode.next = head;
        head = newNode;
    }
}

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Shape> shapeList = new LinkedList<Shape>();

        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            int randomShape = rand.nextInt(3); // 0: Square, 1: Rectangle, 2: Triangle
            Shape shape;
            if (randomShape == 0) {
                shape = new Square();
            } else if (randomShape == 1) {
                shape = new Rectangle();
            } else {
                shape = new Triangle();
            }
            shapeList.add(shape);
        }

        // Iterate over the linked list and draw each shape
        Node<Shape> currentNode = shapeList.head;
        while (currentNode != null) {
            currentNode.data.draw();
            currentNode = currentNode.next;
        }
    }
}

class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
    }
}

class LinkedList<T> {
    Node<T> head;

    public void add(T data) {
        Node<T> newNode = new Node<T>(data);
        newNode.next = head;
        head = newNode;
    }
}
