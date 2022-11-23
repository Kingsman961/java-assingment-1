//Java Program to copy all elements of one array into another array
public class m1 {

	public static void main(String[] args) {
		int[] a1= {10,20,30,40,50};
		int[] a2=new int[a1.length];
		int i=0;
		for(i=0;i<(a1.length);i++)
		{
		    a2[i]=a1[i];
		    System.out.println(a2[i]);
		}
	}
}
