public int[] twoSum(int[] numbers, int target){
	HashMap<int, int> hash = new HashMap<int, int>();
	for(int i=0; i<numbers.length; i++){
		tt = target - numbers[i];
		if(hash.containsKey(tt){
			res = new int[2];
			res[0] = i;
			res[1] = hash.get(tt)
			return sort(res);
		}else{
			hash.put(numbers[i], i);
		}
	}
}