public class bubblesort {
    public static void main(String[] args) {
        int arr[]={5,9,99,10,9};
        sort(arr);

    }
    public static void sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[j-1]>arr[j]) {
                      int temp=arr[j];
                      arr[j]=arr[j-1];
                      arr[j-1]=temp;
                      
                }

            }
            
        }
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
    
}
