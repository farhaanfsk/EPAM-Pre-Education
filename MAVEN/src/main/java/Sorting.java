import java.util.*;
class Sorting{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of digits to be sorted");
		int n= sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the numbers to be sorted");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int[] arr1=arr;
		int[] arr2=arr;
		BubbleSort b= new BubbleSort();
		QuickSort q = new QuickSort();
		MergeSort m = new MergeSort();
		b.sort(arr);
		System.out.println("The Bubble Sorted array is:");
		for(int i:arr) {
			System.out.println(i);
		}
		q.sort(arr1,0,arr1.length-1);
		System.out.println("The Quick Sorted array is:");
		for(int i:arr1) {
			System.out.println(i);
		}
		m.sort(arr2,0,arr2.length-1);
		System.out.println("The Merge Sorted array is:");
		for(int i:arr2) {
			System.out.println(i);
		}
	}
}


