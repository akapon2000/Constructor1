package Parent;

public class Parent {
    private int x = 3;
//    Parent() {https://codeshare.io/register?saveCodeshare=G83Z4D
//    System.out.println("Parent : Parent() constructor set x = " + x);
//    }
}

class Child extends Parent {
    private int y;
    public static void main(String[ ] args) {
        Child child = new Child();
        System.out.println("Child : Default constructor set y = " + child.y);
    }
}
