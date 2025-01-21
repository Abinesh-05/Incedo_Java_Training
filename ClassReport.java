import java.util.Scanner;

class ClassReport{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n=sc.nextInt();
        sc.nextLine();
        String[] name=new String[n];
        String[] cls=new String[n];
        String[][] subject=new String[n][];
        String[][] grades=new String[n][];
        String[][] judgements=new String[n][];
        
        for(int i=0;i<n;i++){
            System.out.print("Name of the student "+ (i+1)+ ": ");
            name[i]=sc.next();
            
            System.out.print("Class: ");
            cls[i]=sc.next();
            
            System.out.print("Number of Subjects: ");
            int numofSubject=sc.nextInt();
            
            sc.nextLine();
            
            subject[i]=new String[numofSubject];
            grades[i]=new String[numofSubject];
            judgements[i]=new String[numofSubject];
            
            for(int j=0;j<numofSubject;j++){
                System.out.print("Name of the subject "+(j+1)+": ");
                subject[i][j]=sc.next();
                
                System.out.print("Grade: ");
                grades[i][j]=sc.next();
                
                switch (grades[i][j]){
                    case "A+":
                        judgements[i][j]="Excellent";
                        break;
                    
                    case "B":
                        judgements[i][j]="Good";
                        break;
                    
                    case "F":
                        judgements[i][j]="Fail";
                        break;
                    
                    default:
                        judgements[i][j]="Invalid input";
                        break;
                    
                }
                
            }
        }
        for(int i=0;i<n;i++){
            System.out.println("----------------------------------------------");
            System.out.println("|       Student "+(i+1)+" details     ");
            System.out.println("----------------------------------------------");
            
            System.out.printf("| Name: %-40s \n",name[i]);
            System.out.printf("| Class: %-42s \n ", cls[i]);
            
            System.out.println("----------------------------------------------");
            
            System.out.printf("| %-15s | %-15s | %-15s \n","Subject","grades","judgements");
            
            System.out.println("----------------------------------------------");
            
            for(int j=0;j<subject[i].length;j++){
                System.out.printf("| %-15s | %-15s | %-15s \n",subject[i][j],grades[i][j],judgements[i][j]);
                System.out.println("----------------------------------------------");
            }
            
            
            
        }
        sc.close();
        
        
        
        
    }
}
