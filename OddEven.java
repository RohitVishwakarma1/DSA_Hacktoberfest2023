//Java Program to print Odd and Even Numbers from an Array

public class OddEvenInArrayExample{  
public static void main(String args[]){  
int a[]={1,2,5,6,3,2};  
System.out.println("Odd Numbers:");  
for(int i=0;i<a.length;i++){  
if(a[i]%2!=0){  
System.out.println(a[i]);  
}  
}  
System.out.println("Even Numbers:");  
for(int i=0;i<a.length;i++){  
if(a[i]%2==0){  
System.out.println(a[i]);  
}  
}  
}}  
Test it Now
Output:

Odd Numbers:
1
5
3
Even Numbers:
2
6
2
