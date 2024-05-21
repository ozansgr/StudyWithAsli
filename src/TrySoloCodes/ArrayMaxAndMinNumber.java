package TrySoloCodes;

public class ArrayMaxAndMinNumber {
	
	public static void main(String[] args) {
		
		int[] arr = {5, 8, 2, 10, 15, 3, 7};

        int max = arr[0];
        int min = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                secondLargest = max;
                max = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != max) {
                secondLargest = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("Second largest number: " + secondLargest);
        } else {
            System.out.println("Second largest number does not exist.");
        }
		
		
		
		
		
		
		
		
	}

}
