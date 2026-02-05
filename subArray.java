// subarray with equilateral triangle
class Main {
    public static void subArray(int[] a){
        int b=a.length+1;
        for(int i = 0;i<a.length+1;i++){
            b=a.length-i+1;
            for(int j = i;j<a.length+1;j++){
                System.out.print(" ".repeat(b));
                for(int k = i;k<j;k++){
                    System.out.print(a[k]+" ");
                    b=Math.abs(k-a.length);
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Sub_Array");
        int[] array={1,2,3,4,5,6,7,8,9};
        subArray(array);
    }
}
