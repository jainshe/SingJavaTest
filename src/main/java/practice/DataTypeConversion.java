package practice;

/**
 * @author shefali.jain
 */
public class DataTypeConversion {
    String name = "10";
    int k=9;
    int l= 11;
    int m= 12;
    char t = 'T';
    String graduation = "Btech";

    public void converStringToInt(){
        int i = Integer.parseInt(name);
        System.out.println(i);
    }

    public void convertIntToString(){
        String surname = Integer.toString(k);
        System.out.println(surname);
        System.out.println(String.valueOf(l));
        System.out.println(new Integer(m).toString());
    }

    public void convertCharToString(){
        System.out.println(Character.toString(t));
    }

    public void convertStringToChar(){
        System.out.println(graduation.charAt(0));
        System.out.println(graduation.charAt(1));


    }
    public static void run() {
        DataTypeConversion smallQuestions = new DataTypeConversion();
        smallQuestions.converStringToInt();
        smallQuestions.convertIntToString();
        smallQuestions.convertCharToString();
        smallQuestions.convertStringToChar();
    }
}
