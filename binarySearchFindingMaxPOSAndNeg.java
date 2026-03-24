//Finding max positive and negitive from given array

//  [-3,-2,-1,-1,0,0,1,2]

class Main {
    public static int fun(int[] arr,int t){
        int len=arr.length;
        int l=0,r=len-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(arr[m]>=t){
                  r=m-1; 
            }else{
                l=m+1;
            }
        }
        return l;
    }
    public static void main(String[] args) {
        int[] arr={-3,-2,-1,-1,0,0,1,2};
        int len=arr.length;
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int neg=fun(arr,0);
        int one=fun(arr,1);
        int pos=len-one;
        System.out.println(len+" "+neg+" "+one);
        System.out.println(Math.max(neg,pos));
    }
}
