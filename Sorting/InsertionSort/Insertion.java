public class Insertion {
    public static void main(String[] args) {
        int[] arr={1,10,55,3,80};
        sort(arr);
       }
   public static void sort(int arr[]){
       int size=arr.length;
       for(int i=1;i<size;i++)
       {
       int current=arr[i];
       int j=i-1;
         while(j>=0 && arr[j]>current){
             arr[j+1]=arr[j];
             j--;
            }
         arr[j+1]=current;

         }
         for(int a:arr){
            System.out.print(a+" ");
        }
        
       }
   }
    


