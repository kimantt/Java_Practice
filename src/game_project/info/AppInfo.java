package game_project.info;

public class AppInfo {
	// 애플리케이션 정보 (싱글톤)
	
	private String title;
	private String developer;
	private String contents[];
	
	private static AppInfo instance;
	
	private AppInfo() { // 초기값 설정
        this.title = "★★게임";
        this.developer = "홍길동";
        this.contents = new String[]{"가위바위보", "숫자 맞추기"};
    }
	
	public static AppInfo getInstance() {
        if (instance == null) {
            instance = new AppInfo();
        }
        return instance;
    }
	
	@Override
	public String toString() { // 출력할 정보 오버라이딩
		
		// 각각의 콘텐츠의 뒤에 "게임"을 추가한 새로운 배열 생성
		String contentInfo[] = new String[contents.length];
		for (int i = 0; i < contents.length; i++) {
			contentInfo[i] = contents[i] + " 게임";
		}
		
		// 반환할 문자열 정의
		String returnString = "제목 : " +  this.title + 
							  "\n제작자 : " + this.developer + 
							  "\n내용 : " + String.join("/", contentInfo);
		
		return returnString;
	}
	
}
