package practice;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author shefali.jain
 */
class CollectioneExample {

    public void collectionWithObject(){
        Collection l =  new ArrayList();
        l.add(5);
        l.add("String1");
        l.add("4.9");
        System.out.println(l);
    }
    public void collectionWithOnlyString(){
        Collection<String> l = (Collection) new ArrayList();
        l.add("4");
        l.add("String2");
        l.add("4.8");
        System.out.println(l);
    }

    public void printingValuesWithIteratorWithoutWhile() {
        Collection<String> l = (Collection) new ArrayList();
        l.add("3");
        l.add("String");
        l.add("4.8");
        Iterator itr = l.iterator();
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());
    }

    public void printingValuesWithIteratorWithWhile() {
        Collection<String> l = (Collection) new ArrayList();
        l.add("3");
        l.add("String");
        l.add("4.8");
        Iterator itr = l.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public void printingValuesWithEnhancedForLoopforObject() {
        Collection<Object> l = (Collection) new ArrayList();
        l.add(3);
        l.add("String");
        l.add("4.8");
        for (Object i :l){
            System.out.println(i);
        }
    }

    public void printingValuesWithEnhancedForLoopforOInteger() {
        Collection<Integer> l = (Collection) new ArrayList();
        l.add(3);
        l.add(5);
        l.add(7);
        for (Integer i :l){
            System.out.println(i);
        }
    }

    public void removingValuesWithEnhancedForLoopforOInteger() {
        Collection<Integer> l = (Collection) new ArrayList();
        l.add(3);
        l.add(5);
        l.add(7);
        l.remove(3);
        System.out.println("*********************");
        for (Integer i :l){
            System.out.println(i);
        }
    }




    public static void main(String[] args) {
        CollectioneExample arrayListExample = new CollectioneExample();
        arrayListExample.collectionWithObject();
        arrayListExample.printingValuesWithIteratorWithWhile();
        arrayListExample.collectionWithOnlyString();
        arrayListExample.printingValuesWithIteratorWithoutWhile();
        arrayListExample.printingValuesWithEnhancedForLoopforObject();
        arrayListExample.printingValuesWithEnhancedForLoopforOInteger();
        arrayListExample.removingValuesWithEnhancedForLoopforOInteger();
    }
}