package quiz20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileQuiz02 {

	public static void main(String[] args) {
		/*
		 * 1. 빠른 입력을 통해서, 사용자로부터 입력을 받습니다.
		 * 2. 사용자가 "그만"을 적을 때까지 입력 받아주면 됩니다.
		 * 3. 입력받은 내용을 BufferWriter를 이용해서 파일을 쓰세요. (파일명은 자유)
		 * 4. 단, 사용자가 엔터를 칠 때마다 데이터는 써져야합니다. flush
		 */
		BufferedReader br = null; //입력
		BufferedWriter bw = null; //출력
		try {
			String writerPath = "C:\\Users\\jin\\Desktop\\course\\java\\upload\\filequiz.txt";
			
			br = new BufferedReader(new InputStreamReader(System.in)); //키보드로 입력
			bw = new BufferedWriter(new FileWriter(writerPath));
			
			while(true) {
				System.out.print("입력>");
				String str = br.readLine(); //nextLine
				bw.write(str + "\n");
				if(str.equals("그만")) {
					break;
				}
				bw.flush();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
