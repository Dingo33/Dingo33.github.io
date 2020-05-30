import java.util.Scanner;

public class DecToHex{
	public static void main(String[] args){
		System.out.print("Enter decimal number: ");
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			System.out.println(hexConvert(n));
			System.out.print("Enter decimal number: ");			
		}
	}

	public static String hexConvert(int n){
		String str = "";
		int rem;
		
		while(n > 0){
			rem = n % 16;
			switch(rem){
				case 10:
					str = 'A' + str;
					break;
				case 11:
					str = 'B' + str;
					break;
				case 12:
					str = 'C' + str;
					break;
				case 13:
					str = 'D' + str;
					break;
				case 14:
					str = 'D' + str;
					break;
				case 15:
					str = 'F' + str;
					break;
				default:
					str = rem + str;
					break;
			}
			n /= 16;

		}
		return str;
	}
}