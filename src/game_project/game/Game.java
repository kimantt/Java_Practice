package game_project.game;

import java.util.Random;
import java.util.Scanner;

import game_project.user.UserDTO;

public abstract class Game {
	// 게임 공통 필요요소를 가진 추상 클래스

	Random random = new Random();

	public abstract void run(Scanner sc, UserDTO user);
	
}
