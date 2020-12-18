public class Binarysearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int target=6;
        var p=search(arr,target,0,arr.length-1);
        System.out.println(p);
        

        
    }
    private static int search(int[] arr,int target,int left,int right){
        if(right<left)
          return -1;
        var middle=(left+right)/2;
        if(target==arr[middle]){
            return middle;
        }
        if(target<arr[middle]){
            return search(arr,target,0,middle-1);
        }
        return search(arr,target,middle+1,right);


     



    }
}
