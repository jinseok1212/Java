package quiz14;

public class BugsMusic implements SongList{
	
	private String[] list = new String[100];
	private int count = 0;
	@Override
	public void insertList(String song) {
		System.out.println("벅스 플레이리스트");
		for(int i = 0; i < list.length; i++) {
			if(song.equals("그만")) {
				break;
			}
			list[i] = song;
			count ++;
		}
	}
	@Override
	public void playList() {
		System.out.println(list[(int) (Math.random() * count)]);
	}
	@Override
	public int playLength() {
		return count;
	}
	
	/* SongList인터페이스를 상속받습니다.
	 * 마음대로 작성.
	 * 
	 */
	
}
