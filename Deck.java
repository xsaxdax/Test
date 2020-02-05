package mark.com.dyrak.pack;

import java.util.ArrayList;

import java.util.List;

public class Deck {

	private List<Card> cards;

	public Deck() {
		cards = new ArrayList<Card>();
		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				cards.add(new Card(r, s));
			}
		}
	}

	@Override
	public String toString() {
		return " " + cards;
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

}
