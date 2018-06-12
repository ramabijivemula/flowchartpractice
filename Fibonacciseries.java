
public class Fibonacciseries {
	public static void main (String[]args){
		int max=100;
		int i=0;
		int j=1;
		int k=0;
		System.out.println(i);
		System.out.println(j);
		while((i+j)<max){
			k=i+j;
			i=j;
			j=k;
			System.out.println(k);
			
		}
		
	}

}
