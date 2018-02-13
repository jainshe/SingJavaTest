package practice;

/**
 * @author shefali.jain
 */
public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int arr1[] = {1, 5, 7, 8};
        int arr2[] = {5, 8, 9, 12};
        int[] arr3 = new int[8];
        int i = 0, j = 0, k = 0;
        int n1=4;
        int n2=4;

            // Traverse both array
            while (i<n1 && j <n2)
            {
                // Check if current element of first
                // array is smaller than current element
                // of second array. If yes, store first
                // array element and increment first array
                // index. Otherwise do same with second array
                if (arr1[i] < arr2[j])
                    arr3[k++] = arr1[i++];
                else
                    arr3[k++] = arr2[j++];
            }

            // Store remaining elements of first array
            while (i < n1)
                arr3[k++] = arr1[i++];

            // Store remaining elements of second array
            while (j < n2)
                arr3[k++] = arr2[j++];
        
        for (int w=0;w<arr3.length;w++){
            System.out.println(arr3[w]);
        }
    }


}
