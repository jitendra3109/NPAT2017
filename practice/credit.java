import java.util.*;
import java.io.*;

public class credit{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();		
		for (int  i = 0; i < n ;i++ ) {
			int price = in.nextInt();
			int m = in.nextInt();
			int[] arr = new int[m];
			for (int j = 0 ; j < m ; j++ ) {
				arr[j] = in.nextInt();
			}
            int index1 =0,index2 =0;
			for (int j =0; j< m-1 ;j++ ) {				
			
				if(arr[j]>=price)
					continue;
				
				index1=j;
				
				
				for(int k=j+1;k<m;++k)
				{
					if((arr[k]+arr[j])==price){
						index2=k;
						j=m;
						break;
						}
				}
			}
			System.out.println("Case #"+(i+1)+": "+(index1+1)+" "+(index2+1));

	}
  }
}