package ex01;

public class ForEx07 {

	public static void main(String[] args) {
		
		int[] arr = {1,5,4,3,2};
		
		for(int i=0; i<5; i++)
			System.out.print(arr[i] + " ");
		System.out.println("\n-------향상된 for문--------");
		
		for(int num : arr)
			System.out.print(num + " ");
		System.out.println("\n-------배열의 합--------");
		
		int sum =0;
		for(int i=0; i<5; i++) {
			sum += arr[i];
		}
		System.out.print("sum : " + sum);
		System.out.println("\n=========최대값========");
		
		int max = arr[0];
		for(int i=0; i<arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}
		System.out.println("max : " + max);
		
	}

}
