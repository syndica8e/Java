import java.util.HashMap;

class Twosum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> maps = new HashMap<>();
        for ( int i = 0 ; i < nums.length ; i++ ){
            maps.put(nums[i], i);
        }
        for ( int i = 0 ; i < nums.length ; i ++){
            int compare = target - nums[i];
            if ( maps.containsKey(compare) && maps.get(compare) != i){
                return new int[] { i , maps.get(compare)};
            }
        }
        return null;
}
}

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].