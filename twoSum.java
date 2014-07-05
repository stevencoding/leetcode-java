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