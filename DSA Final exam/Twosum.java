import java.util.HashMap;
import java.util.Map;

public class Twosum {
    public static int[] twoSum(int[] num, int key) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < num.length; i++) {
            int comp = key - num[i];
            
            if (map.containsKey(comp)) {
                return new int[] { map.get(comp), i };
            }
            map.put(num[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = {9, 3, 5, 17, 12};
        int target = 21;
        int[] result = twoSum(nums, target);

        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
