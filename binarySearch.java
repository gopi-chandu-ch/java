
class Main {
    public static void main(String[] args) {
        int[] arr={0,1,1,2,2,3,4,5,6,7,8,9};
        int len=arr.length;
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int l=0,r=len-1;
        int t=3;
        while(l<=r){
            int m=l+(r-l)/2;
            if(arr[m]==t){
                System.out.println(m);
                break;
            }
            if(arr[m]<t){
                l=m+1;   
            }else{
                r=m-1;
            }
        }
    }
}
