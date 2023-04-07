package scanner;

public class Prime_numb {

	public static void main(String[] args) {
		
		int num=43;
		for(int i=0;i<=num%2;i++) {
			if(num % 2 == 0) {
			System.out.println("enete number is prime:"+num);
			}
			else {
				System.out.println("enete number is not prime:"+num);
				break;
			}
		}

	}

}
