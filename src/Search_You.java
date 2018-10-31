import java.util.Scanner;

public class Search_You {
	public static void main(String[] args){
		Me me=new Me();
		boolean heart=false;
		@SuppressWarnings("resource")
		Scanner Scan=new Scanner(System.in);
		do{
			String Y_Name=Scan.nextLine();
			heart=me.search_you(Y_Name);
		}while(heart==false);
		System.out.println("Hello World!");
	}
}