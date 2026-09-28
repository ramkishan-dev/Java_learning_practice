class chekPrime{
	public static void main(String [] args){
		int num;
		boolean isPrime= true;
// Take input from command line and convert String to Integer
		num= Integer.parseInt(args[0]);
		for(int i=2; i<=num/2; i++){
			if(num%i==0){
				isPrime=false; //not prime
			break; //exit
			}
		}
		if(isPrime) System.out.println(" Prime");
		else System.out.print("not Prime");
	}
	
}