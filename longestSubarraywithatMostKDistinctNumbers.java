// longest subarray with at most 2 distinct numbers

import java.util.HashMap;
import java.util.Map;

class Main {
    public static void main(String[] args) {
        int[] nums={1,2,3,1,2,2,3,2,1,4};
        int len=nums.length;
        int k=2;
        int ans=0;
        int l=0;
        Map<Integer,Integer> hm=new HashMap<>();
        for(int r=0;r<len;r++){
            hm.put(nums[r],hm.getOrDefault(nums[r],0)+1);
            
            while(hm.size()>k){
                hm.put(nums[l],hm.get(nums[l])-1);
                if(hm.get(nums[l])==0){
                    hm.remove(nums[l]);
                }
                l++;
            }
          
            ans=Math.max(ans,r-l+1);
              System.out.println(r+" "+l+" "+ans);
        }
        System.out.println(ans);
    }
}
