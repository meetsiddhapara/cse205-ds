class Solution {
    public int smallestEvenMultiple(int n) {
        int ans=0;
        if(n>=1 && n<=150){
            if(n%2==0 )
            ans=n;
            else
            ans=n*2;
        }
        return ans;
    }
}