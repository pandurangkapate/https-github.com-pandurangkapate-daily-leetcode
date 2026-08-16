class Solution {
    public int removeDuplicates(int[] nums) {
        
        HashSet<Integer> set = new LinkedHashSet<Integer>();

        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }

        int k = set.size();
        int j = 0;

        for(int val: set){
            nums[j++] = val;
        }

        return k;
        
    }
}