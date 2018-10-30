import java.util.Scanner;

public class ConnectGit {

	public static void main(String[] args) {
		System.out.println("Connect git");
		
		Scanner sr = new Scanner(System.in);
		String num = sr.nextLine();
		System.out.printf("입력하신 숫자는 %s입니다.", num);  // 주석도 한글이 깨지나?
		
		System.out.println("재연결후 다시 커밋하기");
	}

}
