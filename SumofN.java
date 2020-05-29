package array2;

public class SumofN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]={4, 5, 6};
int[] a1=new int[arr.length];

for(int i=0;i<arr.length;i++) {
	int sum=0;
	for(int j=0;j<arr.length;j++) {
		if(i!=j) {
			sum=sum+arr[j];
		}
		
	}
	a1[i]=sum;
	
}
for(int i=0;i<a1.length;i++) {
	System.out.println(a1[i]);
}
	}

}
