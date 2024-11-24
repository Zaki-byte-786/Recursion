import java.util.*;
public class rat_in_maze {
    static void recursion(int r,int c,ArrayList<String> ans,String path,int[][]arr,int n,int[][]vis){
        if(r == n-1 && c == n-1){
            ans.add(path);
            return;
        }
        int[] drow = {1,0,0,-1};
        int[] dcol = {0,-1,1,0};
        String seq = "DLRU";
        for(int i = 0;i < 4;i++){
            int nrow = r + drow[i];
            int ncol = c + dcol[i];
            if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < n && arr[nrow][ncol] == 1 && vis[nrow][ncol] == 0){
                vis[r][c] = 1;
                recursion(nrow,ncol,ans,path+seq.charAt(i),arr,n,vis);
                vis[r][c] = 0;
            }
        }
    }
     static ArrayList < String > findSum(int[][] arr, int n) {
        // Write your code here.
        ArrayList<String> ans = new ArrayList<>();
        int[][] vis = new int[n][n];
        if(arr[0][0] == 1)recursion(0,0,ans,"",arr,n,vis);
        return ans;
    }

    public static void main(String[] args) {

    }
}
