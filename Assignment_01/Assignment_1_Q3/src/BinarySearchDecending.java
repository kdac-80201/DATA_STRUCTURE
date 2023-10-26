public class BinarySearchDecending {

	public static int searchByBinary(int[] arr, int key, int length) {
		int start = 0;
		int end = length;
		while (start < end) {
			int mid = (start + end) / 2;
			if (arr[mid] == key) {
				return mid;
			}
			if(arr[mid] > key) {
				start = mid - 1;
			}
			else if(arr[mid] < key)
				end = mid + 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 9, 8, 7, 6, 5, 3, 2, 1 };
		int key = 2;
		int cont = searchByBinary(arr, key, arr.length);
		if(cont == -1)
			System.out.println("Element not found ");
		else
			System.out.println("Element is at "+cont+" index");
	}

}
