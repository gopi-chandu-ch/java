import java.util.*;

class Main {
    public static boolean fun(HashMap<Character,Integer> hm1,HashMap<Character,Integer> hm2){
        if(hm1.size()!=hm2.size()) return false;
        for(char key:hm1.keySet()){
            if(!hm2.containsKey(key)){
                return false;
            }
            //char a=hm1.get(key);
            //char b=hm2.get(key);
            if(hm1.get(key)!=hm2.get(key)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1="abcd";
        String s2="bdca";
        HashMap<Character,Integer> hm1=new HashMap<>();
        HashMap<Character,Integer> hm2=new HashMap<>();
        for(int r=0;r<s1.length();r++){
            hm1.put(s1.charAt(r),hm1.getOrDefault(s1.charAt(r),0)+1);
        }
        System.out.println(hm1);
        for(int r=0;r<s2.length();r++){
            hm2.put(s2.charAt(r),hm2.getOrDefault(s2.charAt(r),0)+1);
        }
        System.out.println(hm2);
        boolean valid=fun(hm1,hm2);
        System.out.println(valid);
    }
}
