import java.util.Scanner;
public class IfElse{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
		if (n>=1 && n<=100){
        	if (n%2 == 1){
            	System.out.println("Weird");
			}

       		 else {

				if (n%2 == 0 && n>=2 && n<=5){
							System.out.println("Not Weired");
			}
				else if (n%2 == 0 && n>=6 && n<=20){
							System.out.println("Weired");
			}
				else if (n%2 == 0 && n>20){
							System.out.println("Not Weired");
			}
		}
	}
   }
}