package day15.api.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class InputStreamEx {

	public static void main(String[] args) {
		/*
		 * Input이 붙어 있는 클래스는 1바이트 기반의 입력스트림 클래스 입니다.
		 * 1. 파일을 읽어들이는데 사용하는 클래스가 FileInputStream
		 * 
		 */
		
		String path = "C:\\Users\\jin\\Desktop\\course\\java\\upload\\hello.txt"; //파일명까지
		
		InputStream ios = null;
		
		try {
			ios = new FileInputStream(path);
//			//1바이트씩 읽기
//			while(true) {
//				int data = ios.read();
//				if(data == -1) {
//					break;
//				}
//				System.out.println((char)data); //문자는 2바이트인데, inputstream은 1바이트로 데이터를 읽기에 한글은 깨짐
//				//영어는 가능
//			}
			
		//바이트 배열로 한번에 읽기
		byte[] arr = new byte[100]; //100글자
		int length = ios.read(arr); //읽은 내용을 arr에 저장시킴
		System.out.println("데이터를 읽은 길이:" + length);
		System.out.println(Arrays.toString(arr));
			
		//바이트 배열을 반복시켜서 글자 출력
		int i = 0;
		while (i < length) {
			System.out.print((char)arr[i]);
			i++;
		}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ios.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
