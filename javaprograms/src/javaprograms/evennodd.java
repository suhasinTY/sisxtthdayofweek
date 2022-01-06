package javaprograms;

public class evennodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {2,4,5,2,1,3,5,6,7,8,1};
int evencount=0;
int oddcount=0;
for(int i=0;i<arr.length;i++)
{
	if(arr[i]%2==1)
	{
		oddcount++;	
	}
	else
	{
		evencount++;
	}
}
System.out.println(evencount+"evencount");
System.out.println(oddcount+"oddcount");
	}

}
