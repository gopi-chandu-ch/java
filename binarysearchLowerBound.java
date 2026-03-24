// binary search lower bound finding target where it can place and sumuntaneously finding biggest element in left side of given target
class Main {
    public static void main(String[] args) {
        int[] arr={0,1,2,4,5,6,7,8,9};
        int len=arr.length;
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int l=0,r=len-1;
        int t=0;
        System.out.println("Target: "+t);
        while(l<=r){
            int m=l+(r-l)/2;
            if(arr[m]<t){
                l=m+1;   
            }else{
                r=m-1;
            }
        }
        
        System.out.println("Index can place for given element :"+l);
        System.out.println("for a given num left element is :"+r);
    }
}
