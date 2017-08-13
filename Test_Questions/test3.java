import java.util.Scanner;
import java.util.Arrays;

public class test3 {


private static void mostFreq3(int a[], int n, int b[]) {
          int aa[] = new int[n];
          for (int i = 0 ;i< n ;i++ ) {
            	for (int j = 0;j< n ;j++ ) {
            		if (a[i]==a[j]) {
            		 aa[a[i]] ++;
            	   }
            }
        }
        for (int i = 0; i< 3 ;i++ ) {
        	int max =0;
        	int index = 0;
        	for (int j = 0;j < n ;j++ ) {
        	 	if (max < aa[j]) {
        	 		max = aa[j];
        	 		index = j;       	 		
        	 	}
        	 }
        	 aa[index]=0;
        	 b[i] = index; 
        }

    }

    public static void main(String[] args) {
	int n;
	int b[] = new int[3];
	int i=0;

	Scanner scan = new Scanner(System.in);
	n = scan.nextInt();
	int a[] = new int[n];
	for(i=0;i<n;i++) 
		a[i] = scan.nextInt();

	mostFreq3(a,n,b);

	for(i=0;i<3;i++)
		System.out.print(b[i] + " ");
}
}
