package mark.com.dyrak.pack;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private String name;
	private List<Card> hand;
	
	//just make a player. Cards will be given later
	public Player(String name) {
		super();
		this.name = name;
		this.hand=new ArrayList<Card>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
	


}
