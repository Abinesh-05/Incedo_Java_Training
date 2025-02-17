import java.util.Scanner;
import java.util.*;
class strangeCalc
{
    public void add(ArrayList<Integer> arr)
    {
        int sum=0;
        for(int i=0;i<arr.size();i++)
        {
            sum=sum+arr.get(i);
        }
        System.out.println("The sum is "+sum);
    }
    public void sub(ArrayList<Integer> arr)
    {
        ArrayList<Integer> arr1=new ArrayList<Integer>();
        for(int i=0;i<arr.size();i++)
        {
            if(i!=arr.size()-1){
            int val=arr.get(i+1)-arr.get(i);
            arr1.add(val);
            }
        }
        System.out.println(arr1);
    }
    public void mul(ArrayList<Integer> arr)
    {
        int mul=1;
        for(int i=0;i<arr.size();i++)
        {
            mul=mul*arr.get(i);
        }
        System.out.println(mul);
    }
    public void div(ArrayList<Integer>arr)
    {
        ArrayList<Integer> arr1=new ArrayList<Integer>();
        for(int i=0;i<arr.size();i++)
        {
            if(i!=arr.size()-1){
            int val=arr.get(i+1)/arr.get(i);
            arr1.add(val);
            }
        }
        System.out.println(arr1);
    }
     public void restdiv(ArrayList<Integer>arr)
    {
        ArrayList<Integer> arr1=new ArrayList<Integer>();
        for(int i=0;i<arr.size();i++)
        {
            if(i!=arr.size()-1){
            int val=arr.get(i+1)%arr.get(i);
            arr1.add(val);
            }
        }
        System.out.println(arr1);
    }
    public void larg(ArrayList<Integer>arr)
    {
        int largest=arr.get(0);
        for(int i=1;i<arr.size();i++)
        {
            if(arr.get(i)>largest)
            {
                largest=arr.get(i);
            }
            else
            {
                continue;
            }
        }
        System.out.println("The largest number is " +largest);
    }
    public void small(ArrayList<Integer>arr)
    {
        int smallest=arr.get(0);
        for(int i=1;i<arr.size();i++)
        {
            if(arr.get(i)<smallest)
            {
                smallest=arr.get(i);
            }
        }
        System.out.println("The smallest among all the number is "+smallest);
    }
     public void avg(ArrayList<Integer>arr)
    {
        ArrayList<Integer> arr1=new ArrayList<Integer>();
        for(int i=0;i<arr.size();i++)
        {
            if(i!=arr.size()-1){
            int val=(int)(arr.get(i+1)+arr.get(i))/2;
            arr1.add(val);
            }
        }
        System.out.println(arr1);
    }

}
class Main
{
    public static void main(String[] args )
    {
        int value;
        strangeCalc obj=new strangeCalc();
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<Integer>();
        String str;
        while(true)
        {
            System.out.println("Enter the value");
            value=sc.nextInt();
            arr.add(value);
            sc.nextLine();
            System.out.println("Enter the choice do you still wanted to continue entring the values , if so enter continue else give exit");
            str=sc.nextLine();
            if(str.equals("exit"))
            {
                break;
            }
            else
            {
                continue;
            }

        }
        System.out.println("The values you gave is ");
        System.out.println(arr);
        int choice;
        System.out.println("Enter your choice ");
        System.out.println("Enter 1 for addition , Enter 2 for substraction , Enter 3 for multiplication , Enter 4 for division,  Enter 5  for rest of the division , Enter 6 for largest value , Enter 7 for smallest value , Enter 8 for average of two numbers ");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:
                obj.add(arr);
                break;
            case 2:
                obj.sub(arr);
                break;
            case 3:
                obj.mul(arr);
                break;
             case 4:
                 obj.div(arr);
                 break;
             case 5:
                obj.restdiv(arr);
                break;
            case 6:
                obj.larg(arr);
                break;
            case 7:
                obj.small(arr);
                break;
            case 8:
                obj.avg(arr);
                break;
        }
    }
}
