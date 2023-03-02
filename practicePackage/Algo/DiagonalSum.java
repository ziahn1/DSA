package practicePackage.Algo;

public class DiagonalSum {
    public static int sum(int[][] mat,int n){
        int i=0;
        int sum=0;
        while(i<n ){
            if(i==n-i-1){
                sum+=mat[i][i];
            }
            else{
                sum+=mat[i][i]+mat[i][n-i-1];
            }
            

            i++;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(sum(mat, 3));
    }
}



