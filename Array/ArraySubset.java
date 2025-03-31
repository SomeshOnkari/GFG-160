import java.util.*;
public class ArraySubset {
        public static  boolean isSubset(int a[], int b[]) {
            // Your code here
            HashMap<Integer,Integer> hm = new HashMap<>();
            
            
            for(int i=0 ; i<a.length ; i++){
                int x= a[i];
                if(!hm.containsKey(x)){
                    hm.put(x,1);
                }
                else{
                    hm.put(x,hm.get(x)+1);
                }
            }
            
            for(int i=0 ; i<b.length; i++){
                int x =b[i];
                if(hm.containsKey(x) &&  hm.get(x)>0){
                hm.put(x,hm.get(x)-1);
                }
                  else   return false;
            }
        return true;    
        }
        public static void main(String[] args) {
            System.out.print("Enter size of Array1: ");
            Scanner sc= new Scanner(System.in);
            int n= sc.nextInt();
            System.out.println();
            int arr[]= new int[n];
            
            for(int i=0 ;i<n;i++){
                arr[i]=sc.nextInt();
            }

            System.out.print("Enter size of Array2: ");
            int m=sc.nextInt();
            int arr2[]=new int[m];

            for(int i=0 ;i<m;i++){
                arr2[i]=sc.nextInt();
            }
           
            System.out.print("Given array1 is : ");
            for(int i=0 ;i<n;i++){
              System.out.print(arr[i]+" ");
            }

            System.out.print("\nGiven array2 is : ");
            for(int i=0 ;i<m;i++){
              System.out.print(arr2[i]+" ");
            }
            System.out.println();
         System.out.println("given array is subset (true/false) : " + isSubset(arr,arr2)); 
           sc.close(); 
         }
    }
