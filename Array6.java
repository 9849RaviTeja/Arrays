package array2;

public class Array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,20,30,40,50,60,70,80,90,100};
		int[] arr=new int[a.length];
		int index=0;
		/*for(int i=a.length;i<a.length;i--) {
arr[index] =a[i];
index++;
	}
		for( int i=0;i<a.length/2;i++) {
			
			arr[index]=a[i];
			index++;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}*/
		for(int i=a.length-1;i>0;i--) {
			if(index%2==0 &&index<10) {
			arr[index] =a[i];
			System.out.println(arr[index] +" +"+index);
			}
			index=index+2;
				}
		 index=1;
for( int i=0;i<a.length/2;i++) {
			if(index%2!=0) {
			arr[index]=a[i];
			System.out.println(arr[index] +" +"+index);
			index=index+2;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" "+i);
		}

}}
