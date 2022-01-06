package javapractice;

public class java2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,5,1,60,41}; int count=0; int g=2;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]<g) {
				count++;
				System.out.println(arr[i]);
			}
			
		}
		System.out.println(count);

	}

}
