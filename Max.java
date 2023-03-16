public class Max
public  int findMaxArray(int[] array){
		if (array == null || array.length == 0) {
			return Integer.MIN_VALUE;
		}
		int maxSum = Integer.MIN_VALUE;
		int currentSum = 0;
		for (int i = 0; i < array.length; i++) {
			if (currentSum < 0) {
				currentSum = array[i];
			}else {
				currentSum += array[i];
			}
			maxSum = Math.max(maxSum, currentSum);
		}
		return maxSum;
	}