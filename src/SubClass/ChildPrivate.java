package SubClass;
//import MainClass.*;

import MainClass.MotherPrivate;

public class ChildPrivate {

    public ChildPrivate() {
        int y ;
        MotherPrivate m = new MotherPrivate();
        y = m.getX();
       // System.out.println(new MotherProtected().x);
        System.out.println(y);
    }

    public static  void main (String[]args){
        new ChildPrivate();
    }
}
