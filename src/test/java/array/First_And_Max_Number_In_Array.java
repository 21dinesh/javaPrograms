package array;

public class First_And_Max_Number_In_Array {

	public static void main(String[] args) {
		int arr[] = { 9, 3, 4, 5, 76, 99, 89, 12 };
		int largest = arr[0];
		int second = arr[0]; // Initially setting second to the first element

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				second = largest; // Update second to previous largest
				largest = arr[i]; // Update largest to current element
			} else if (arr[i] > second && arr[i] != largest) {
				second = arr[i]; // Update second only if it's larger than the previous second
			}
		}

		System.out.println("largest number is " + largest);
		System.out.println("second number is " + second);
	}
}
