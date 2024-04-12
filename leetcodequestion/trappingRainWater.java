class Solution {
    public int trap(int[] height) {
        int n= height.length;
        int x[]= new int[n];
        int y[]=new int[n];
        x[0]=height[0];
        for (int i=1;i<n;i++){
            x[i]= Math.max(height[i],x[i-1]);
        }
        y[n-1]=height[n-1];
        for (int j=n-2;j>=0;j--){
            y[j]=Math.max(y[j+1],height[j]);
        }
        int ans=0;
        for( int k=0;k<n;k++){
            ans+=(Math.min(x[k],y[k])- height[k]);
        }
        return ans;


    }
}