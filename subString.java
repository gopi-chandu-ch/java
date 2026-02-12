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
