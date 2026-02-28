//the max length of sub array which contains k no.of odd numbers
class Main {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,6,7,3};
        int n=arr.length;
        int k=2;
        int temp=0;
        int ans=0;
        int l=0;
        for(int r=0;r<n;r++){
            if(arr[r]%2==1){
                temp++;
            }
            while(temp>k){
                if(arr[l]%2==1){
                    temp--;
                }
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        System.out.println(ans);
    }
}
