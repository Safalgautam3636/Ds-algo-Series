package javaDSAlgos;
import java.util.*;
class implement{
	public void reverse(int arr[],int begin,int end) {
		while(begin<end) {
			int temp=arr[begin];
			arr[begin]=arr[end];
			arr[end]=temp;
			begin++;end--;
		}
		
	}
	 public void fun(int arr[],int n,int d) {
		 reverse(arr,0,d-1);
		 reverse(arr,d,n-1);
		 reverse(arr,0,n-1);
	 }
}
public class Arrayrot {
   public static void main(String args[]) {
	   implement im=new implement();
	   int arr[]= {1,2,3,4,5};
	   int d=2;
	   im.fun(arr,5,d);
	   for(int i:arr) {
		   System.out.print(i+" ");
	   }
	   
   }
}
