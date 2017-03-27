package twosum_1;
import java.util.HashMap;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		if (nums.length <= 1) return new int[] {};
		HashMap<Integer, Integer> compliments = new HashMap<>();
		for (int i = 0; i < nums.length; i++){
			if (compliments.containsKey(nums[i])){
				return new int[] {compliments.get(nums[i]), i};
			}
			else {
				compliments.put(target - nums[i], i);
			}
		}
		return new int[]{};
    }
}
