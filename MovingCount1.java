package src;

/*
 * 题目描述
 * 地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，每一次只能向左，右，上，下四个方向移动一格，
 * 但是不能进入行坐标和列坐标的数位之和大于k的格子。 
 * 例如，当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18。
 * 但是，它不能进入方格（35,38），因为3+5+3+8 = 19。
 * 请问该机器人能够达到多少个格子？
 */
/*
 * 思路；
 * 总体定义一个count记录
 * 定义一个rows*cols长度的数组，初始为0，如果记录过就改为1，
 * 定义一个函数，可以将数据改为记录个数。如输入35，输出8（3+5）；
 */
public class MovingCount1 {
	static int count = 0;

	public int movingCount(int threshold, int rows, int cols) {
		boolean[] num = new boolean[rows * cols];
		passCount(threshold, rows, cols, 0, 0, num);
		return count;

	}

	public boolean passCount(int threshold, int rows, int cols, int i, int j, boolean[] num) {
		if ((anum(i) + anum(j)) > threshold)
			return false;
		int index = i * cols + j;
		if (threshold < 1 || i < 0 || i > rows || j < 0 || j > cols || index >= num.length || num[index] == true)
			return false;
		if (num[index] == false)
			count++;
		num[index] = true;
		if (passCount(threshold, rows, cols, i - 1, j, num)
				|| passCount(threshold, rows, cols, i + 1, j, num)
				|| passCount(threshold, rows, cols, i, j - 1, num)
				|| passCount(threshold, rows, cols, i, j + 1, num))
			return true;
		return false;
	}

	public int anum(int n) {
		int result = 0;
		while (n > 0) {
			int num = n % 10;
			n = n / 10;
			result += num;
		}
		return result;
	}
	/*其他方法
	 * public int movingCount(int threshold, int rows, int cols) {
        int flag[][] = new int[rows][cols]; //记录是否已经走过
        return helper(0, 0, rows, cols, flag, threshold);
    }
 
    private int helper(int i, int j, int rows, int cols, int[][] flag, int threshold) {
        if (i < 0 || i >= rows || j < 0 || j >= cols || numSum(i) + numSum(j)  > threshold || flag[i][j] == 1) return 0;    
        flag[i][j] = 1;
        return helper(i - 1, j, rows, cols, flag, threshold)
            + helper(i + 1, j, rows, cols, flag, threshold)
            + helper(i, j - 1, rows, cols, flag, threshold)
            + helper(i, j + 1, rows, cols, flag, threshold)
            + 1;
    }
 
    private int numSum(int i) {
        int sum = 0;
        do{
            sum += i%10;
        }while((i = i/10) > 0);
        return sum;
    }
	 * 
	 * 
	 */

	public static void main(String[] args) {
		MovingCount1 m = new MovingCount1();
		//m.movingCount(5,10,10);
		System.out.println(m.movingCount(15,20,20));
	}
}
