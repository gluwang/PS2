
public class MyInteger {
	
	private int value;
	
	public MyInteger(int value){
		this.value = value;
	}
	
	public int getValue(){
		return this.value;
	}
	
	public boolean isEven(){
		return (this.value % 2 == 0);
	}
	
	public boolean isOdd(){
		return (this.value % 2 == 1);
	}
	
	public boolean isPrime(){
		for(int x=2; x <= this.value/2; x++){
			if(this.value % x == 0){
				return false;
			}
		}
		return true;
	}
	
	public static boolean isEven(int x){
		return (x % 2 == 0);
	}
	
	public static boolean isOdd(int y){
		return (y % 2 == 1);
	}
	
	public static boolean isPrime(int z){
		for(int x=2; x <= z/2; x++){
			if(z % x == 0){
				return false;
			}
		}
		return true;
	}
	
	public static boolean isEven(MyInteger n){
		return (n.isEven());
	}
	
	public static boolean isOdd(MyInteger m){
		return (m.isOdd());
	}
	
	public static boolean isPrime(MyInteger l){
		return (l.isPrime());
	}
	
	public boolean equals(int x){
		return(this.value == x);
	}
	
	public boolean equals2(MyInteger n){
		return(this.value == n.getValue());
	}
	
	public static int parseInt(char[] c){
		int sum = 0;
		for(int x: c ){
			sum += x;
		}
		return sum;
	}
	
	public static int parseInt2(String s){
		return(s.length());
	}
	
	public static void main(String[] args){
		MyInteger n = new MyInteger(6);
		System.out.println(((MyInteger) n).isEven());
		System.out.println(MyInteger.isEven(5));
		
		char[] c = {1,2,3,4,5};
		System.out.println(MyInteger.parseInt(c));
		
		System.out.println(MyInteger.parseInt2("welcome"));
		System.out.println(MyInteger.isEven(n));
	}
}
