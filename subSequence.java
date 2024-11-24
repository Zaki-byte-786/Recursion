import java.util.*;
public class subSequence {
    static void function(int[] array,int i,ArrayList<Integer> temp,ArrayList<ArrayList<Integer>>ans){
        if (i == array.length){
          ans.add(new ArrayList<>(temp));  // because temp is an object so copy the value of temp and pass that value
            return;                        // into new list not reference of temp otherwise it will change all list stored in ans
        }
        function(array,i+1,temp,ans);
       temp.add(array[i]);
        function(array,i+1,temp,ans);
        temp.remove(temp.size()-1);
    }
    public static void main(String[] args) {
        int[] array = {1,2,3};
        ArrayList<Integer> temp = new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        function(array,0,temp,ans);
        System.out.println(ans);
    }
}
