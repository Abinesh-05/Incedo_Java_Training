package day3;
import java.util.Scanner;
import java.util.*;
 
public class headOrTail {
	public static void main(String[] args)
	  {
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Hey are you ready to start the game ");
	      int choice;
	      System.out.println("Enter your choice ");
	      System.out.println("Press 1  to play or press 0 to get exited");
	      choice=sc.nextInt();
	      game obj=new game();
	      ArrayList<String> list=new ArrayList<String>();
	      list.add("Head");
	      list.add("Tail");
	      switch(choice)
	      {
	          case 0:
	              break;
	          case 1:
	              obj.myMethod(list);
	              break;
	      }
	  }
 
}
