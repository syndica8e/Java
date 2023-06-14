class Solution {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        int next = lower;
        List<String> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < lower) {
                continue;
            }
            if(nums[i] == next) {
                next++;
                continue;
            }
            list.add(add(next, nums[i] - 1));
            next = nums[i] + 1;
        }
        if(next <= upper) {
            list.add(add(next, upper));
        }
        return list;
    }

    private String add(int n1, int n2) {
        return n1 == n2 ? "" + n1 : n1 + "->" + n2;
    }
}