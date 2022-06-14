package week1.day1.assignments;

public class LearnFibinocciSeries {

	public static void main(String[] args) {
		// FibonacciSeries input:8 output will be:0, 1, 1, 2, 3, 5, 8, 13
		int range=12, firstNum=0 , secondNum=1;
		
		for (int i=0; i<=range; i++) {
			System.out.println(firstNum);
			int sum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = sum;
			
			
		}
		

	}

}
