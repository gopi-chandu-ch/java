import java.util.*;
class Main {
    public static boolean fun(String s){
        Set<Character> hs=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            hs.add(ch);
        }
            if(hs.size()==3){
                return true;
            }else{
                return false;
            }
    }
    public static void main(String[] args) {
        String s="aabha";
        int ans=0,k=3;
       for(int i=0;i<s.length()-3+1;i++){
           boolean temp=fun(s.substring(i,i+3));
           if(temp==true){
               ans+=1;
           }
       }
       System.out.print(ans);
    }
}


-----------------------------------------------------------------o(n)-----------------------------
    
class Main {
    public static void main(String[] args) {
        String s = "ababc";
        int len=s.length();
        int l=0;
        int ans=0;
        Map<Character,Integer> hm=new HashMap<>();
        for(int r=0;r<len;r++){
            char ch=s.charAt(r);
            hm.put(ch,hm.getOrDefault((ch,0)+1));
            if(r-l+1>3){
                char lch=s.charAt(l);
                hm.put(lch,hm.get(lch)-1);
                if(hm.get(lch)==0){
                    hm.remove(lch);
                }
                l++;
            }
            if(r-l+1==3&&hm.size()==3){
                ans+=1;
            }
        }
        System.out.print(ans);
    }
}
