public class Bonuses {

	public int[] getDivision(int[] points) {
		int sum = 0;
		for (int point : points) {
			sum += point;
		}
		int allocated = 0;
		int[] aP = new int[points.length];
		for (int i = 0; i < points.length; i++) {
			int j = (points[i]*100)/sum;
			allocated += j;
			aP[i] = j;
		}
		int remaining = 100 - allocated;
		int len = aP.length;
		
		for (int i = 1; i <= remaining;) {
			int start = len - i;
			
			for (int k = len - i - 1; k >=0; k--) {
				if (aP[k] == aP[k + 1]) {
					start --;
					k--;
				} else {
					break;
				}
			}
			
			for (int j = start; j <= len - i && i <= remaining; j++) {
				i++;
				aP[j]++;
			}
			
		}
		return aP;
	}

}
