import java.util.Scanner;
public class MyProgram{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int chocolate = input.nextInt();
		if (chocolate>=1 && chocolate<=300){
        	if (chocolate<=150){
            	System.out.println("Buy A Chocolet");
			}
			else if (chocolate<150 && chocolate>=110 ){
            	System.out.println("Buy A Rose");
			}
		}
	}
}