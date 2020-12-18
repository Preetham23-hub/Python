test=int(input()) 
for i in range(test):
    n,d=map(int,input().strip().split())
    ar=[]
    ar = [x for x in input().split()] 
    arr=list(map(int,ar))
         
        
    def leftRotate(arr, d, n): 
                    for i in range(d): 
                        leftRotatebyOne(arr, n) 
                  
                # Function to left Rotate arr[] of size n by 1*/  
    def leftRotatebyOne(arr, n): 
                    temp = arr[0] 
                    for i in range(n-1): 
                        arr[i] = arr[i + 1] 
                    arr[n-1] = temp 
    
       # print ("% d"% arr[i], end =" ") 
        
    leftRotate(arr, d, n)
    print(*arr,sep = " ")
    
    # for i in arr:
    #     print(i,end=" ")
                  
                # utility function to print an array */ 
                # def printArray(arr, size): 
                #     for i in range(size): 
                #         print ("% d"% arr[i], end =" ") 
                  
                   
            # Driver program to test above functions */ 
                   
                # for i in arr:
                #     print(i,end=",")
    
     
    #printArray(arr, n) 