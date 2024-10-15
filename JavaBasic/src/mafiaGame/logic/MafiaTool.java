package mafiaGame.logic;

import mafiaGame.characters.Citizen;
import mafiaGame.characters.Doctor;
import mafiaGame.characters.Mafia;
import mafiaGame.characters.Person;
import mafiaGame.characters.Police;

/**
 * 마피아 게임을 실행하는 간단한 로직
 */
public class MafiaTool {
	void executeGame(Person votePerson, Person targetPerson) {
		votePerson.vote(targetPerson.getNickname());
		votePerson.revealMySelf();
	}
}
