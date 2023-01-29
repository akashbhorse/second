package practice3;

public class StrongArmNumber {

	public static void strongArmNumber(int num) {

		int power=power(num);

		int copyNum=num;

		int sum=0;

		while(copyNum!=0) {

			int lastDigit=copyNum%10;

			int factor=1;

			for (int i = 0; i < power; i++) {
				factor=factor*lastDigit;
			}
			sum=sum+factor;
			copyNum=copyNum/10;
		}

		if(sum==num) {
			System.out.println("Number is StrongArm");
		}else {
			System.out.println("number is not StrongArm");
		}
	}	

	public static int power(int num) {

		int n=0;
		while(num!=0) {
			n++;
			num=num/10;

		}
		return n;
	}
	public static void main(String[] args) {

		strongArmNumber(153);

	}

}
