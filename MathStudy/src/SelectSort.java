import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class SelectSort {
    private SelectSort(){}


    public static void sort(int [] arr){
        int n = arr.length;
        for( int i = 0 ; i < n ; i ++ ){
            int minIndex = i;
            for( int j = i + 1 ; j < n ; j ++ ) {
                if (arr[minIndex]>arr[j]  ) {
                    minIndex = j;
                }
            }
            System.out.println("minIndex==="+minIndex);
            System.out.println("i===="+i);
            swap( arr , i , minIndex);
        }
    }
    public static void swap(int [] arr,int i,int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
    public static void main(String[] args) {

        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        SelectSort.sort(arr);
        for( int i = 0 ; i < arr.length ; i ++ ){
            System.out.print(arr[i]);
            System.out.print(' ');
        }
        System.out.println();
    }
}
