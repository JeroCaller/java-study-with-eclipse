package mafiaGame.characters;

/**
 * 마피아 클래스. 
 */
public class Mafia implements Person {
	private String role = "mafia";
	private String nickname = "Javas";
	
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
