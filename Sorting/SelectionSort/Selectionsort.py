a=[1,5,8,9,6,10]
b=len(a)
#print(len(a))
def sort(a):
    for i in range(b-1):
        min=i;
        for j in range(i+1,b):
            if a[i]<a[min]:
                min=j
        temp=a[min]
        a[min]=a[i]
        a[i]=temp;
    print(a)
sort(a)
