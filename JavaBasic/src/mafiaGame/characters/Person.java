package mafiaGame.characters;

public interface Person {
	String getNickname();
	void vote(String targetName);
	void revealMySelf();
}
