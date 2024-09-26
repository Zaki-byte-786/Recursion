import java.util.ArrayList;

public class practiceArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<>();
        int [] array =  {1,2,3,4};
        for(int x : array){
            arraylist.add(x);
        }
        System.out.println(arraylist);
    }
}
