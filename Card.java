package mark.com.dyrak.pack;

public class Card {
	
	private Rank rank;//taken from enum rank.java
	private Suit suit;//taken from enum suit.java
	
	
	public Card(Rank r, Suit s) {
		super();
		this.rank=r;
		this.suit=s;
	}


	public Rank getRank() {
		return rank;
	}


	public void setRank(Rank rank) {
		this.rank = rank;
	}


	public Suit getSuit() {
		return suit;
	}


	public void setSuit(Suit suit) {
		this.suit = suit;
	}


	@Override
	public String toString() {
		return " [rank=" + rank + ", suit=" + suit + "]";
	}
	

}
