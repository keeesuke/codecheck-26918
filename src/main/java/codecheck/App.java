package codecheck;

public class App {
	public static void main(String[] args) {
			if(args.length == 0){}
			else{
				 if(args[0].equals("World")){
						System.out.println("Hello World!");
					}else if(args[0].equals("織田信長")){
						System.out.println("Hello 織田信長!");
					}else if(args[0].equals("codecheck")){
						System.out.println("Hello codecheck!");
					}
			}
	}
}
