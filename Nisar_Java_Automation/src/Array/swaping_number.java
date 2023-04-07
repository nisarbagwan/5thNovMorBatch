package Array;

public class swaping_number {
	static int a [];
public static void main(String[] args) {
int a  []= {11,22,33,44,55,66,77};
	
	for (int i=0;i<=a.length-1;i++) {
		System.out.println(a[i]);
	}
	for(int i=0;i<(a.length/2);i++) {  // (i<(a.index/2)
		int c;
		c=a[i];                          //a[i]= blank,a[0]
		a[i]=a[(a.length-1)-i];          // a[0]=a[5]   a[1]=a[4]  a[2]=a[3]  a[3]=a[3]   
		a[(a.length-1)-i]=c;
	}
	System.out.println("********");
	
		//System.out.println(a[0]);
		//System.out.println(a[1]);
		//System.out.println(a[2]);
		
		for (int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]);
		} 
	}
}

