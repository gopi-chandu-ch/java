// hear we are checking the longest sub array which contains k  times of zero's
class Main {
    public static void main(String[] args) {
        int[] arr={1,1,0,1,0,0,0};
        int len=arr.length;
        int k=2;
        int temp=0;
        int ans=0;
        int l=0;
        for(int r=0;r<len;r++){
            if(arr[r]==0){
                temp++;
            }
            while(temp>k){
                if(arr[l]==0){
                    temp--;
                }
                l++;
                
            }
            ans=Math.max(ans,r-l+1);
        }
        System.out.print(ans);
    }
}
