arr=[5,8,11,9,20]
size=len(arr)
def sort(arr):
    for i in range(1,size):
        current=arr[i];
        j=i-1;
        while (j>=0 and arr[j]>current):
            arr[j+1]=arr[j];
            j=j-1
        arr[j+1]=current;

sort(arr)
print(arr)

