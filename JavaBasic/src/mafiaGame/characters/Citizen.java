package mafiaGame.characters;

/**
 * 시민 클래스
 */
public class Citizen implements Person {
	private String role = "citizen";
	private String nickname = "kimquel";
	
	@Override
	public String getNickname() {
		return nickname;
	}
	
	/**
	 * 마을에서 방출할 사람을 투표한다. 
	 * @param targetName 투표할 대상의 닉네임
	 */
	@Override
	public void vote(String targetName) {
		System.out.println(nickname + "님이 " + targetName + "님에게 투표하였습니다.");
	}
	
	/**
	 * 자신의 정체를 공개한다. 
	 */
	@Override
	public void revealMySelf() {
		System.out.println(nickname + "님의 정체는 " + role + "이었습니다!");
	}
}
