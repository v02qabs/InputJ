package hiro;
import java.util.Scanner;
public class InputJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("終了するには、Quit を入力せよ。：");
			new  InputJ().E();
			
	}
	private void E() {
		String quit = new InputJ().InputJ();
		if(quit.equals(quit)) {
			System.out.println("終了します。");
			System.exit(0);
		}
		else{
			System.out.println("エラー");
		}
	}

	public String InputJ() {
		// TODO Auto-generated method stub
		Scanner scan_scan = new Scanner(System.in);
		String scaned_string = scan_scan.next();
		return scaned_string;
	}

}
