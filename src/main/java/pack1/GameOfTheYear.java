package pack1;

public class GameOfTheYear {

	public static void main(String[] args) {
		
		Game game1 = new Game("Dragon Age", 97 );
		Game game2 = new Game("NO mans sky", 100);
		
		game1.setGameName("Neverwinter");
		String nameOfG2 = game2.getGameName();
		
		System.out.println(game1.summary);
		
		RPG.averageScore(15, 58);
	}
	
	

	
}
