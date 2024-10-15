package mafiaGame.logic;

import mafiaGame.characters.Citizen;
import mafiaGame.characters.Doctor;
import mafiaGame.characters.Mafia;
import mafiaGame.characters.Police;

public class Main {
	public static void main(String[] args) {
		MafiaTool mTool = new MafiaTool();
		
		Mafia mafia = new Mafia();
		Citizen citizen = new Citizen();
		
		// 추가된 코드
		Doctor doctor = new Doctor();
		Police police = new Police();
		
		mTool.executeGame(mafia, citizen);
		mTool.executeGame(citizen, mafia);
		
		// 추가된 코드
		mTool.executeGame(doctor, mafia);
		mTool.executeGame(police, mafia);
	}
}
