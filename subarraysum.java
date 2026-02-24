// highest sub array, length of 3 sum
class Main {
    public static void main(String[] args) {
        int[] arr={3,2,4,1,5};
        int len=arr.length;
        int l=0;
        int k=3;
        int temp=0;
        int ans=0;
        for(int r=0;r<len;r++){
            temp+=arr[r];
            if(r-l==k){
                temp-=arr[l];
                l++;
            }
            if(r-l+1==k){
                ans=Math.max(ans,temp);
            }
        }
        System.out.print(ans);
    }
}
