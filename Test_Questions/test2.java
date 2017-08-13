import java.util.Scanner;
import java.util.ArrayList;


public class test2{
	public static void main(String[] args) {
	   Scanner in = new Scanner(System.in);		
       ArrayList<String> a = new ArrayList<String>();
      
       int n =0;
      
        while (!in.nextLine().equals("")){	
           a.add(in.nextLine());
           n++;
		}
		
		for(int i = 2*n-1 ;i >= n ;i--){
           System.out.println(a.get(i));
           
		}
		for(int i = 0 ;i < n ;i++){           
           System.out.println(a.get(i));      

		}
			
  }
}