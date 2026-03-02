class Main {
    public static void main(String[] args) {
        int[] arr={1,1,0,1,0,0,0,1,0,0,1,1,1};
        int len=arr.length;
        int count0=0;
        int count1=0;
        int k=1;
        int ans=0;
        int l=0;
        for(int r=0;r<len;r++){
            if(arr[r]==0){
                count0++;
            }else{
                count1++;
            }
            while(Math.min(count0,count1)>k){
                if(arr[l]==0){
                    count0--;
                }else{
                    count1--;
                }
                l++;
            ans=Math.max(ans,r-l+1);    
            }
        }
        System.out.print(ans);
    }
}
