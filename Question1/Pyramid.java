import java.io.Console;

public class Pyramid{
	public static void main(String[] args){
		Console c = System.console();
		String input = c.readLine("Please enter your number!");
		int x = Integer.parseInt(input);
		for(int a=0;a<x;a++){
			for(int b=0;b<x-a;b++){
				System.out.print(" ");
			}
			for(int d=0;d<=a;d++){
				System.out.print((d+1) + " ");
			}
			System.out.println();
		}
	}
}