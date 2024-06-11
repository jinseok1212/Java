package quiz20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class FileQuiz01 {

	public static void main(String[] args) {
		
		/*
		 * 1. 스캐너로 읽을 파일명을 확장자 포함 입력 받습니다.
		 * 2. upload 폴더에 파일이 있다면, 이 파일을 uploadcopy로 복사해주세요.
		 *    파일이 없으면 "파일명이 없습니다" 예외구문을 출력합니다.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("파일명: ");
		String fileName = scan.next();
		InputStream ios = null;
		OutputStream fos = null;
		String inputPath = "C:\\Users\\jin\\Desktop\\course\\java\\upload\\" + fileName;
		String outputPath = "C:\\Users\\jin\\Desktop\\course\\java\\uploadcopy\\" + fileName;
		try {
			ios = new FileInputStream(inputPath);
			fos = new FileOutputStream(outputPath);
			byte[] arr = new byte[1000];
				
			int result;
			while((result = ios.read(arr)) != -1) {
				fos.write(arr, 0, result);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
			
		} catch (Exception e) {
			
		} finally {
			try {
				ios.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
			}
		}

	}
}
