class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        res = new ArrayList<List<Integer>>();
        List<Integer> cur = new ArrayList();
        BackTrackAlgo(nums, target, cur, 0);
        return res;
    }

        public void BackTrackAlgo(int[] nums, int target, List<Integer> cur, int i){
            if(target == 0){
                res.add(new ArrayList<>(cur));
                return ;
            }
            if (target < 0 || i >= nums.length){
                return ;
            }
            cur.add(nums[i]);
            BackTrackAlgo(nums,target-nums[i], cur, i);
            cur.remove(cur.size()-1);
            BackTrackAlgo(nums,target, cur, i+1);
        }
}
