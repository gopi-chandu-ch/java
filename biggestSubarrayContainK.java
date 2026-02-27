//hear printing the biggest subbary containg two ones

class Main {
    public static void main(String[] args) {
        int[] arr={1,2,1,4,1,5,8,5,4,1,4};
        int len=arr.length;
        int k=2;
        int l=0;
        int temp=0;
        int ans=0;
        for(int r=0;r<len;r++){
            if(arr[r]==1){
                temp++;
            }
            while(temp>k){
                if(arr[l]==1){
                temp--;
                }
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        System.out.println(ans);
    }
}
