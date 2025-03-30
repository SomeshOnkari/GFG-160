import java.util.*;
class SecondLargest {
    public static int getSecondLargest(int[] arr) {
        // Code Here
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        int secmax=-1;
        for(int i=0;i<n;i++){
            if (arr[i]>max){
                max= arr[i];
            }
        }
    
    for(int i=0;i<n;i++){
        if(arr[i]>secmax && max!=arr[i]){
            secmax=arr[i]; 
        }
    }
    return secmax;
   }

   public static void main(String[] args) {
    System.out.print("Enter size of Array : ");
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int arr[]= new int[n];
    for(int i=0 ;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.print("Given array is : ");
    for(int i=0 ;i<n;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
   System.out.print("Second Largest is : "+getSecondLargest(arr)); 
   sc.close(); 
 }
}