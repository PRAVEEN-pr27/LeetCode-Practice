import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] a, int target) {
        int ans[]=new int[2];
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<a.length;i++){
            int more=target-a[i];
            if(hm.containsKey(more)){
            ans[0]=hm.get(more);
            ans[1]=i;

            }
            else
              hm.put(a[i],i);
        }
        return ans;
    }
}
