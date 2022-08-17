public class Saida{

	public static void main(String arg[]){
		int x = 10;
		int y = 5;
		System.out.println("\n\nSoma: "+soma(x,y));
		System.out.println("\n\nSubtracao: "+sub(x,y));
		System.out.println("\n\nMultiplicacao: "+mult(x,y));
		System.out.println("\n\nDivisao: "+div(x,y));
		
	}	

	public static int soma(int x, int y){
		return (x+y);
	}
	public static int sub(int x, int y){
		return (x-y);
	}
	public static int mult(int x, int y){
		return 	(x*y);
	}
	public static int div(int x, int y){
		return (x/y);
	}
}