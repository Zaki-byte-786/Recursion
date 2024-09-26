import java.util.ArrayList;

public class arrayListReturn {
//    static ArrayList<Integer> recursion (int [] array,int target,int index){
//        ArrayList<Integer> ans = new ArrayList<>();
//        if(index == array.length){
//            return ans;
//        }
//        if(array[index] == target){
//            ans.add(index);
//        }
//        ArrayList<Integer> answerRecursion = recursion(array,target,index+1);
//ans.addAll(answerRecursion);
//return ans;
//    }
    static ArrayList<Integer> targetArraylist(int [] array,int target,int index){
        ArrayList<Integer> arraylist = new ArrayList<>();
        if(index == array.length){
            return arraylist;
        }
        if(array[index] == target){
            arraylist.add(index);
        }
        ArrayList<Integer> ans = targetArraylist(array,target,index+1);
        arraylist.addAll(ans);
        return arraylist;
    }
    public static void main(String[] args) {
int [] array = {1,2,3,3,2,3,4,1,3,2};
//        System.out.println(recursion(array,3,0));
//        System.out.println(targetArraylist(array,2,0));
    }
}
