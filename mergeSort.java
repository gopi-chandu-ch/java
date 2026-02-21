class Main {
   public static void divide(int[] arr,int left,int right){
       //if(left>right) return;
       
       int mid=(left+right)/2;
       for(int i=left;i<=right;i++){
           System.out.print(arr[i]+" ");
       }
       System.out.println();
       if(left==right) return;
       divide(arr,left,mid);
       divide(arr,mid+1,right);
       merge(arr,left,mid,right);
   }
   public static void merge(int[] arr,int left,int mid,int right){
       int[] temp=new int [right-left+1];
       int i=left;
       int j=mid+1;
       int k=0;
       while(i<=mid && j<=right){
           if(arr[i]<arr[j]){
               temp[k++]=arr[i++];
           }else{
               temp[k++]=arr[j++];
           }
       }
       while(i<=mid){
           temp[k++]=arr[i++];
       }
       while(j<=right){
           temp[k++]=arr[j++];
       }
       for(int x=0;x<temp.length;x++){
           arr[left+x]=temp[x];
       }
   }

    public static void main(String[] args) {
        int[] arr={3,4,2,3,1,5,3};
        int len=arr.length-1;
        divide(arr,0,len);
        System.out.println("---After sorting----");
        for(int i=0;i<len;i++){
            System.out.print(" "+arr[i]);
        }
        
    }
}
