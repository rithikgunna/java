import java.util.*;  
public class ThirdLargestInArrayExample1{  
public static int getThirdLargest(int[] a, int total){  
Arrays.sort(a);  
return a[total-1];  
}  
public static void main(String args[]){  
int e[]={1,2,5,6,3,2};  
int h[]={44,66,99,77,33,22,55};  
System.out.println("Third Largest: "+getThirdLargest(e,6));  
System.out.println("Third Largest: "+getThirdLargest(h,7));  
}}  