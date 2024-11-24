import java.util.Arrays;

public class simpleQuestion {
    static void print1toN(int n){
        if(n == 0)return;
        System.out.print(n+" ");
        print1toN(n-1);
    }
    static void swap(int[] array,int i,int j){
        array[i] = array[i] + array[j];
        array[j] = array[i] - array[j];
        array[i] = array[i] - array[j];
    }

    static void reverseArray(int[] array,int i,int j){
        if (i >= j)return;
        swap(array,i,j);
        reverseArray(array,i+1,j-1);
    }
    static void reverseArray(int[] array,int i){
        if (i >= array.length/2)return;
        swap(array,i,array.length - 1 -i);
        reverseArray(array,i+1);
    }
    public static void main(String[] args) {
//        print1toN(5);
        int[] array = {1,5,4,2,3,6};
//        reverseArray(array,0,5);
//        System.out.println(Arrays.toString(array));
//        reverseArray(array,0);
        System.out.println(Arrays.toString(array));
    }
}
