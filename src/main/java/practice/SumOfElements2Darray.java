package practice;

/**
 * @author shefali.jain
 */
public class SumOfElements2Darray {

    public static void sumOf2darray() {
        int arr[][] =  {{2,1,3},{3,4,5},{5,6,7}};

        int sum=0;

        for (int i =0;i<arr.length;i++){
            for (int j =0;j<arr.length;j++){
                sum = sum+arr[i][j];
            }
        }

        System.out.println(sum);
    }
}
