import java.util.*;
import java.io.*;

public class fact{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		for (int  i = 0; i < n ;i++ ) {
			String s = in.nextLine();
			String[] words = s.split(" ");         
        String reverseString = "";
        String word = ""; 
        for (int j = words.length-1; j >0 ; j--) { 
        	word= word+words[j]+" ";
        }
        word += words[0];
		System.out.println(word);	
	}
  }
}