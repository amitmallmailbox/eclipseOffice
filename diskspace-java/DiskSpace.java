import java.util.Arrays;
///Submitted on 23rd May 14
public class DiskSpace {

	public int minDrives(int[] used, int[] total) {
		int usedSum = 0;
		for (int i = total.length - 1; i >= 0; i--) {
			usedSum += used[i];
		}
		Arrays.sort(total);
		int i;
		for (i = total.length - 1; i >= 0 || usedSum > 0; i--) {
			usedSum -= total[i];
		}
		return total.length - i;
	}

}
