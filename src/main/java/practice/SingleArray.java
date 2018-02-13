package practice;

/**
 * @author shefali.jain
 */
public class SingleArray {

    public void printArray() {
        int arr[] = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public void printArraysecondWay() {
        int arr[] = {1,2,3,4,5};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public void printStringArray() {
        String arr[] = {"hi","hello"};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public void printCharArray() {
        Character arr[] = {'a','b'};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        SingleArray singleArray = new SingleArray();
        singleArray.printArray();
        singleArray.printArraysecondWay();
        singleArray.printStringArray();
        singleArray.printCharArray();
    }
}
