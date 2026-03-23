/*  [1,1,1,3,3,2,2]
import java.util.*;
class Main {
    public static void main(String[] args) {
     int[] arr={1,1,1,3,3,2,2,2};
     int len=arr.length;
     HashMap<Integer,Integer> hm=new HashMap<>();
     ArrayList<Integer> ar=new ArrayList<>();
     for(int i=0;i<len;i++){
         hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);}
         for(int key:hm.keySet()){
             if(hm.get(key)>=3){
                 ar.add(key);
             }
         }
     
     System.out.println(ar);
    }
}*/
/* import java.util.*;
class MAin{
     public static void main(String[] args) {
     int[] arr={1,1,1,3,3,2,2,2};
     int len=arr.length;
     HashMap<Integer,Integer> hm=new HashMap<>();
     ArrayList<Integer> ar=new ArrayList<>();
     for(int num:arr){
         hm.put(num,hm.getOrDefault(num,0)+1);
         if(hm.get(num)==3){
             ar.add(num);
         }
     }
     System.out.println(ar);
     }
     
}*/

/* import java.util.*;
class Main{
    public static void main(String[] args){
        String str="abcabcbb";
        int len=str.length();
        HashMap<Character,Integer> hm=new HashMap<>();
        int l=0;
        int ans=0;
        for(int r=0;r<len;r++){
            char rch=str.charAt(r);
            hm.put(rch,hm.getOrDefault(rch,0)+1);
            while(hm.get(rch)>1){
                char lch=str.charAt(l);
                hm.put(lch,hm.get(lch)-1);
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        System.out.println(ans);
    }
}
*/
/*
import java.util.*;

class Main {
    public static void main(String[] args) {
        String str = "abcabcbb";
        int len = str.length();

        int l = 0;
        int ans = 0;
        int start = 0; // to track starting index of best substring

        HashMap<Character, Integer> hm = new HashMap<>();

        for (int r = 0; r < len; r++) {
            char rch = str.charAt(r);

            hm.put(rch, hm.getOrDefault(rch, 0) + 1);

            while (hm.get(rch) > 1) {
                char lch = str.charAt(l);
                hm.put(lch, hm.get(lch) - 1);
                l++;
            }

            // update answer and starting index
            if (r - l + 1 > ans) {
                ans = r - l + 1;
                start = l;
            }
        }

        // print substring
        System.out.println(str.substring(start, start + ans));
    }
}
*/
/* 
import java.util.*;
class Main{
    public static void main(String[] args){
        int[] marks={1,2,4,6,3,2,4,7,5};
        int len=marks.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        int hscorer=Integer.MIN_VALUE;
        for(int i=0;i<len;i++){
            int rch=marks[i];
            hm.put(rch,hm.getOrDefault(rch,0)+1);
            for(int key:hm.keySet()){
                hscorer=Math.max(hscorer,key);
            }
        }
        
        System.out.println(hm);
        System.out.println(hscorer);
    }
}*/
// the hashmap itself sorted before trying below code for sorting check the above code
/* import java.util.*;
class Main{
    public static void main(String[] args){
        int[] marks={7,1,2,4,6,3,2,4,7,5};
        int len=marks.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        int hscorer=Integer.MIN_VALUE;
        for(int i=0;i<len;i++){
            int rch=marks[i];
            hm.put(rch,hm.getOrDefault(rch,0)+1);
            for(int key:hm.keySet()){
                hscorer=Math.max(hscorer,key);
            }
        }
        TreeMap<Integer,Integer> tm=new TreeMap<>(hm); 
        System.out.println(tm);
        System.out.println(hscorer);
    }
}*/
