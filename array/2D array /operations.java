public class OperationsIn2DArray {

	public static int get(int[][] nums, int rIndex, int cIndex) {
		return nums[rIndex][cIndex];
	} // TC: O(1)

	public static void insert(int[][] nums, int rIndex, int cIndex, int val) {
		nums[rIndex][cIndex] = val;
	} // TC: O(1)

	public static void update(int[][] nums, int rIndex, int cIndex, int val) {
		nums[rIndex][cIndex] = val;
	} // TC: O(1)

	public static void delete(int[][] nums, int rIndex, int cIndex) {
		nums[rIndex][cIndex] = 0;
	} // TC: O(1)

	public static void main(String[] args) {
		int[][] nums1 = {{1,2}, {3,4}, {5,6}};
		get(nums1, 0, 0); // it will return, 1
		get(nums1, 1, 1); // it will return 4

		int[][] nums2 = new int[3][2]; // {{0,0}, {0,0}, {0,0}}
		insert(nums2, 0, 0, 1); // {{1,0}, {0,0}, {0,0}}
		insert(nums2, 0, 1, 2); // {{1,2}, {0,0}, {0,0}}
		insert(nums2, 1, 0, 3); // {{1,2}, {3,0}, {0,0}}
		insert(nums2, 1, 1, 4); // {{1,2}, {3,4}, {0,0}}
		insert(nums2, 2, 0, 5); // {{1,2}, {3,4}, {5,0}}
		insert(nums2, 2, 1, 6); // {{1,2}, {3,4}, {5,6}}

		int[][] nums3 = {{1,2}, {3,4}, {5,6}};
		update(nums3, 0, 0, 7); // {{7,2}, {3,4}, {5,6}}
		update(nums3, 1, 1, 8); // {{7,2}, {3,8}, {5,6}};
		update(nums3, 2, 0, 9); // {{7,2}, {3,8}, {9,6}};

		int[][] nums4 = {{1,2}, {3,4}, {5,6}};
		delete(nums4, 0, 0); // {{0,2}, {3,4}, {5,6}};
		delete(nums4, 0, 1); // {{0,0}, {3,4}, {5,6}}
		delete(nums4, 1, 0); // {{0,0}, {0,4}, {5,6}}
		delete(nums4, 1, 1); // {{0,0}, {0,0}, {5,6}}
		delete(nums4, 2, 0); // {{0,0}, {0,0}, {0,6}}
		delete(nums4, 2, 1); // {{0,0}, {0,0}, {0,0}}
	}

}
