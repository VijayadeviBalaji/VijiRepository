package week1.day1.assignments;

public class LearnPrimeNumber {

	public static void main(String[] args) {
		//A number divisible by itself and 1 is a prime number
		
			int num=23;
			boolean flag=false;
				for(int i=2;i<=num/2;i++){      
				    if(num%i==0){      
				     System.out.println(num+" is not prime number");      
				     flag=true;      
				     break;  
				    }
			}
				if(flag==false) 
				{ 
					System.out.println(num+" is prime number");
				}  
	}

}
