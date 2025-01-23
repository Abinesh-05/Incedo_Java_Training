import java.util.Scanner;

public class FirstOccurenceElement {
    private static int matrix[][] = {
     {1, 7, 3, 9, 5, 3},
    {6, 2, 3},
     {7, 5, 1, 4, 0},
     {1, 0, 2, 9, 6, 3, 7, 8, 4}
    };
    
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean flag=false;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==num){
                    System.out.print("row-"+i+" column-"+j);
                    flag=true;
                }
                if(flag){
                    break;
                }
            }
        }
        if(!flag){
            System.out.println("No number found");
        }
        sc.close();
        
 }
}
