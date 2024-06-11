package day15.api.io.directory;

import java.io.File;

public class CreateDirectory {

	public static void main(String[] args) {
		
		/*
		 * 자바에서는 외부경로로 폴더를 생성할 때 File클래스를 사용합니다.
		 */
		String path = "C:\\Users\\jin\\Desktop\\course\\java\\upload\\뉴폴더";
		
		try {
			File file = new File(path);
			//폴더가 있는지 확인하고 생성
//			if(!file.exists()) { //존재하면 true, 존재하지 않으면 false
//				file.exists();
//			} else {
//				System.out.println("폴더가 존재함");
//			}
			
			//폴더 삭제
			if(file.exists()) {
				file.delete(); //빈 폴더일때 삭제 (파일이 폴더 안에 있으면 삭제되지 않음)
				System.out.println("폴더삭제성공");
			} else {
				System.out.println("폴더삭제실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
