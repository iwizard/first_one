package pack1;

public class Game implements IGame {

	public String gameName;
	public int averageScore;
	public String communityChoice;
	public String summary;

	public int getAverageScore() {
		return averageScore;
	}

	public void setAverageScore(int averageScore) {
		this.averageScore = averageScore;
	}

	public String getCommunityChoice() {
		return communityChoice;
	}

	public void setCommunityChoice(String communityChoice) {
		this.communityChoice = communityChoice;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;

	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public Game(String name, int score) {
		this.gameName = name;
		this.averageScore = score;
	}

	static Game gameOfYear(Game g1, Game g2) {
		if (g1.gameName.contains("Neverwinter")) {
			return g1;
		} else
			return g2;
	}

	static int averageScore(int crit, int aud) {
		if (aud < crit) {
			System.out.println("Buy the game!!!");
		}
		return aud;
		
	 }
	
	public String summary (String[] args){
		 System.out.println("This is a placeholder");
		return this.summary;
	}

	public void go1() {
		System.out.println("Interface method 1");
		
	}

	public void go2() {
		System.out.println("Interface method 2");

		
	}

}
