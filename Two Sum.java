import java.util.*;

public class TwoSum{
	public int[] twoSum(int[] numbers, int target){
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		int[] res = new int[2];
		for(int i=0; i<numbers.length; i++){
			int tt = target - numbers[i];
			if(hash.containsKey(tt)){
				res[0] = i+1;
				res[1] = hash.get(tt);
				Arrays.sort(res);
			}else{
				hash.put(numbers[i], i+1);
			}
		}
		return res;
	}

    public static void main(String[] args){
        TwoSum sol = new TwoSum();
        int[] tc1_1 = {1, 2, 3, 4};
        int tc1_2 = 5;
        int[] res1 = sol.twoSum(tc1_1, tc1_2);
 		System.out.println(Arrays.toString(res1));
 	}
}
