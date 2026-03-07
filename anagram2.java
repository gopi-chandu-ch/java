import java.util.*;

class Main {
    public static boolean fun( HashMap<Character,Integer> hms, HashMap<Character,Integer> hmp){
        if(hms.size()!=hmp.size()) return false;
        for(char key:hmp.keySet()){
            if(!hms.containsKey(key)){
                return false;
            }
            int a=hms.get(key);
            int b=hmp.get(key);
            if(a!=b){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s="abcddcba";
        String p="ab";
        int k=p.length();
        HashMap<Character,Integer> hmp=new HashMap<>();
        for(int i=0;i<p.length();i++){
            char chp=p.charAt(i);
            hmp.put(chp,hmp.getOrDefault(chp,0)+1);
        }
        HashMap<Character,Integer> hms=new HashMap<>();
        int l=0;
        for(int r=0;r<s.length();r++){
            char chs=s.charAt(r);
            hms.put(chs,hms.getOrDefault(chs,0)+1);
            if(r-l==k){
                chs=s.charAt(l);
                hms.put(chs,hms.get(chs)-1);
                if(hms.get(chs)==0){
                    hms.remove(chs);
                }
                l++;
            }
            if(r-l+1==k){
                boolean valid=fun(hms,hmp);
                if(valid){
                    System.out.print(l+" ");
                }
            }
        }
    }
}
