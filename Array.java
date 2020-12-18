
//User function Template for Java



class Solution
{
    long minNum(long A[], int N)
    {
        long sum=0;
        long add=1;
        // Your code goes h
        for(long n:A)
        {
            sum=sum+n;
            
            //System.out.println(sum);
            
        }
        //System.out.println(sum);
        
       // if(sum % 2 == 0){
            //return 0;
        //}
    
            while(sum%2==0)
            {
               
                sum=sum+add;
                add++;
                
            }
            
        
        return add;
    }
}
        int testcases = Integer.parseInt


// { Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
            int n = Integer.parseInt(br.readLine());
//            String line = br.readLine();
//            String[] q = line.trim().split("\\s+");
//            int n =Integer.parseInt(q[0]);
//            int m =Integer.parseInt(q[1]);
//            //int y =Integer.parseInt(q[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(a1[i]);
            }
//            String line2 = br.readLine();
//            String[] a2 = line2.trim().split("\\s+");
//            long b[] = new long[n];
//            for (int i = 0; i < n; i++) {
//                b[i] = Long.parseLong(a2[i]);
//            }
            Solution ob = new Solution();
            long ans=ob.minNum(a,n);
            System.out.println(ans);
        }
    }
}


  // } Driver Code Ends