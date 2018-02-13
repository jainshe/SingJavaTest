package practice;

/**
 * @author shefali.jain
 */
public class ImplementingInterface extends CollectioneExample implements Interface2,Interface3{

    public void show() {
        System.out.println("This is show");
    }

    public void display() {
        System.out.println("This is display");
    }

    public void surprise() {
        System.out.println("Hi I am surprise");
    }

    public void cute() {
        System.out.println("This is cute");
    }

    public static void main(String[] args) {
        ImplementingInterface implementingInterface = new ImplementingInterface();
        implementingInterface.show();
        implementingInterface.display();
       Interface2 obj = new ImplementingInterface();
        obj.show();
        obj.cute();
        Interface3 obj2= new ImplementingInterface();
        obj2.surprise();
        CollectioneExample collectioneExample = new CollectioneExample();
        collectioneExample.collectionWithOnlyString();
    }


}
