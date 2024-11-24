import java.util.*;
public class subsequence_with_sum_K {
    static void recursion(int i,int sum,int[] array,ArrayList<Integer> temp,ArrayList<ArrayList<Integer>> ans,int n,int k){

        if(i == n){
            if(sum == k)ans.add(new ArrayList<>(temp));
            return;
        }
        recursion(i+1,sum,array,temp,ans,n,k);
        temp.add(array[i]);
        recursion(i+1,sum+array[i],array,temp,ans,n,k);
        temp.remove(temp.size() - 1);
    }


    static boolean recursion(int i,int[]arr,int sum,int k,int n){
        if(i == n){
           return sum ==k;
        }
        boolean left = recursion(i+1,arr,sum,k,n);
        boolean right = recursion(i+1,arr,sum+arr[i],k,n);
        if(left || right)return true;
        return false;
    }
    public static boolean subsetSumToK(int n, int k, int arr[]){
        // Write your code here.
        return recursion(0,arr,0,k,n);
    }


    public static void main(String[] args) {
        int[] array = {1,2,3,0,1};
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        int n = array.length;
      recursion(0,0,array,temp,ans,n,4);
        System.out.println(ans);
//

//        int[] array = {1,2,3,0};
//        int n = array.length;
//        System.out.println(subsetSumToK(n,4,array));
    }




}
