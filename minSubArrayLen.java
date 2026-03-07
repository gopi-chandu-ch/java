

class Main {
    public static void main(String[] args) {
        int[] nums={7,7,7,7,7,12,7,7};
        int len=nums.length;
        int k=12;
        int l=0;
        int temp=0;
        int ans=Integer.MAX_VALUE;
        for(int r=0;r<len;r++){
            temp+=nums[r];
            while(temp>=k){
                System.out.println(nums[l]+" "+nums[r]+" "+ans);
                ans=Math.min(ans,r-l+1);
                temp-=nums[l];
                l++;
            }
        }
        System.out.println(ans);
    }
}
