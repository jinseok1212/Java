package day15.api.io.buffered;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class BfReaderEx {

	public static void main(String[] args) {
		
		//빠른 입력
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//			System.out.print("입력>");
//			String str = br.readLine(); // 한줄 받기
//			System.out.println(str);
		String path = "C:\\Users\\jin\\Desktop\\course\\java\\upload\\hello4.txt";
		BufferedReader br = null;
		
		try {
			br= new BufferedReader(new FileReader(path));
			
			String str;
			while((str = br.readLine()) != null) { //더이상 읽을게 없으면 null
				System.out.println(str);
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				br.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
}
