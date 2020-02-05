package mark.com.dyrak.pack;

import java.util.HashMap;
import java.util.Map;

public class Gameloop {

	// private List<Card> battlefield; //the battlefield is there the current played
	// cards lie
	private Deck deck;
	private Map<Enum<Rank>, Integer> mapRankToValue;// for later game logic, to determine which card has higher value
	private Map<Integer, Player> players;
	private Card trumpCard;// it is determinate the trump site, it s important to keep track, because if
							// the card is drawn there have to be a reference to the suit

	protected void startGame() {

		int cardRankValue = 0;
		mapRankToValue = new HashMap<Enum<Rank>, Integer>();
		for (Rank r : Rank.values()) {
			mapRankToValue.put(r, cardRankValue);
			cardRankValue++;
		}

		players = new HashMap<Integer, Player>();// may have a better solution, but even if game is mostly with 2
													// players there might be more
		Player player1 = new Player("Player1");
		Player player2 = new Player("Player2");
		players.put(0, player1);
		players.put(1, player2);
		deck = new Deck();
		setTrumpCard();

		for (int i = 0; i < players.size(); i++) {
			for (int j = 0; j < 6; j++) {
				draw(players.get(i));
			}
			System.out.println(players.get(i).getName());
		}

	}

	private void setTrumpCard() {

		trumpCard = deck.getCards().get(0);
		System.out.println(trumpCard);
		deck.getCards().remove(0);
		deck.getCards().add(deck.getCards().size(), trumpCard);

	}

	private void draw(final Player player) {
		if (deck.getCards() != null) { // if deck isn't empty
			Card draw = deck.getCards().get(0);// get the first card
			deck.getCards().remove(0);// remove it from the deck
			player.getHand().add(draw);// give it to the player
			System.out.println(player.getHand());

		}
	}

	public Gameloop() {
		super();
		this.deck = new Deck();
	}

}
