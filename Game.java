import java.util.List;
import java.util.ArrayList;

public class Game {

	//Class/ Instance attributes - visible everywhere in class
	List <Card> handPlayerOne= new ArrayList<Card>();
	List <Card> handPlayerTwo = new ArrayList<Card>();
	Card currentCard;
	boolean winner = false;
	
	
		public static void main(String[] args) {
			Game game1 = new Game ();
			game1.buildDeck();
			Deck uno = new Deck (game1.buildDeck());
			uno.shuffle();
			game1.deal(uno);	
			game1.displayHands();
			game1.start(uno);
			
			//Homework
			//Have playerone look for a card that matches color or number
			//If match remove from hand
			// If no match add card to hand
			
			//Have playertwo e look for a card that matches color or number
			//If match remove from hand
			// If no match add card to hand
			//handPlayerOne.remove(x)
			
			
			
			
		}	
	
	

	private void deal(Deck uno) {
		for (int numCard=0; numCard <7 ; numCard++) {
			//System.out.println(uno.deal().toString());
			handPlayerOne.add(uno.deal());
			handPlayerTwo.add(uno.deal());
			}
		}

	private void playCard (List <Card> player, Deck uno) {
		boolean foundCard = false;
		String color = currentCard.getColor();
		//System.out.println("Color = " + color);
		String value = currentCard.getValue();
		//System.out.println("Color = " + color);
		for (Card c : player) {
		// compare c's color or value to our String value
			if (color.equals(c.getColor()) || value.equals(c.getValue()) || color.equals("Black") || c.getColor().equals("Black")){
				//System.out.println("Found Match!!");
				player.remove(c);
				//System.out.println(c.toString());
				currentCard = c;
				foundCard = true;
				break;
				
				
			}
	}
		
		System.out.println(" ");
		System.out.println(" Face Up Card ...");
		System.out.println(" =================");
		System.out.println(currentCard.toString());
		displayHands();
		if ( foundCard == false)
			player.add(uno.deal());
		
}

	//These are arrays of objects
	private Card[] buildDeck() {
		Card [] card = {
				new Card ("Blue" , "0"),
				new Card ("Blue" , "1"),
				new Card ("Blue" , "2"),
				new Card ("Blue" , "3"),
				new Card ("Blue" , "4"),
				new Card ("Blue" , "5"),
				new Card ("Blue" , "6"),
				new Card ("Blue" , "6"),
				new Card ("Blue" , "7"),
				new Card ("Blue" , "8"),
				new Card ("Blue" , "9"),
				new Card ("Blue" , "1"),
				new Card ("Blue" , "2"),
				new Card ("Blue" , "3"),
				new Card ("Blue" , "4"),
				new Card ("Blue" , "5"),
				new Card ("Blue" , "6"),
				new Card ("Blue" , "6"),
				new Card ("Blue" , "7"),
				new Card ("Blue" , "8"),
				new Card ("Blue" , "9"),
				new Card ("Blue" , "Skip"),
				new Card ("Blue" , "Skip"),
				new Card ("Blue" , "Reverse"),
				new Card ("Blue" , "Reverse"),
				new Card ("Blue" , "Draw Two"),
				new Card ("Blue" , "Draw Two"),
				
				new Card ("Yellow" , "0"),
				new Card ("Yellow" , "1"),
				new Card ("Yellow" , "2"),
				new Card ("Yellow" , "3"),
				new Card ("Yellow" , "4"),
				new Card ("Yellow" , "5"),
				new Card ("Yellow" , "6"),
				new Card ("Yellow" , "6"),
				new Card ("Yellow" , "7"),
				new Card ("Yellow" , "8"),
				new Card ("Yellow" , "9"),
				new Card ("Yellow" , "1"),
				new Card ("Yellow" , "2"),
				new Card ("Yellow" , "3"),
				new Card ("Yellow" , "4"),
				new Card ("Yellow" , "5"),
				new Card ("Yellow" , "6"),
				new Card ("Yellow" , "6"),
				new Card ("Yellow" , "7"),
				new Card ("Yellow" , "8"),
				new Card ("Yellow" , "9"),
				new Card ("Yellow" , "Skip"),
				new Card ("Yellow" , "Skip"),
				new Card ("Yellow" , "Reverse"),
				new Card ("Yellow" , "Reverse"),
				new Card ("Yellow" , "Draw Two"),
				new Card ("Yellow" , "Draw Two"),
				
				new Card ("Red" , "0"),
				new Card ("Red" , "1"),
				new Card ("Red" , "2"),
				new Card ("Red" , "3"),
				new Card ("Red" , "4"),
				new Card ("Red" , "5"),
				new Card ("Red" , "6"),
				new Card ("Red" , "6"),
				new Card ("Red" , "7"),
				new Card ("Red" , "8"),
				new Card ("Red" , "9"),
				new Card ("Red" , "1"),
				new Card ("Red" , "2"),
				new Card ("Red" , "3"),
				new Card ("Red" , "4"),
				new Card ("Red" , "5"),
				new Card ("Red" , "6"),
				new Card ("Red" , "6"),
				new Card ("Red" , "7"),
				new Card ("Red" , "8"),
				new Card ("Red" , "9"),
				new Card ("Red" , "Skip"),
				new Card ("Red" , "Skip"),
				new Card ("Red" , "Reverse"),
				new Card ("Red" , "Reverse"),
				new Card ("Red" , "Draw Two"),
				new Card ("Red" , "Draw Two"),
				
				new Card ("Green" , "0"),
				new Card ("Green" , "1"),
				new Card ("Green" , "2"),
				new Card ("Green" , "3"),
				new Card ("Green" , "4"),
				new Card ("Green" , "5"),
				new Card ("Green" , "6"),
				new Card ("Green" , "6"),
				new Card ("Green" , "7"),
				new Card ("Green" , "8"),
				new Card ("Green" , "9"),
				new Card ("Green" , "1"),
				new Card ("Green" , "2"),
				new Card ("Green" , "3"),
				new Card ("Green" , "4"),
				new Card ("Green" , "5"),
				new Card ("Green" , "6"),
				new Card ("Green" , "6"),
				new Card ("Green" , "7"),
				new Card ("Green" , "8"),
				new Card ("Green" , "9"),
				new Card ("Green" , "Skip"),
				new Card ("Green" , "Skip"),
				new Card ("Green" , "Reverse"),
				new Card ("Green" , "Reverse"),
				new Card ("Green" , "Draw Two"),
				new Card ("Green" , "Draw Two"),
				
				new Card ("Black" , "Wild"),
				new Card ("Black" , "Wild"),
				new Card ("Black" , "Wild"),
				new Card ("Black" , "Wild"),
				new Card ("Black" , "Draw Four Wild"),
				new Card ("Black" , "Draw Four Wild"),
				new Card ("Black" , "Draw Four Wild"),
				new Card ("Black" , "Draw Four Wild")
		};
		
		return card;
	}
		
	private void displayHands() {
		//System.out.println("+++++++++++++++++++++++++++++++++++ ");
		System.out.println("\n");
		System.out.println("Hand for Player One");
		System.out.println("======================");
		for (Card c : handPlayerOne) {
		
			System.out.println(c.toString ());
			
		}
		
		System.out.println("\n");
		System.out.println("Hand for Player Two");
		System.out.println("======================");
		for (Card c : handPlayerTwo) {
		
			System.out.println(c.toString ());
			//System.out.println("+++++++++++++++++++++++++++++++++++ ");
			
		}
	}
	
		private void start(Deck uno) {
			System.out.println("\n");
			System.out.println("Starting Game");
			System.out.println("======================");
			currentCard = uno.deal();
			System.out.println(currentCard.toString());
			
			int counter = 0;
			do {
				counter++;
				System.out.println(">>>PLAYER ONE<<< ");
				
				
				playCard(handPlayerOne, uno);
				
				System.out.println(">>>PLAYER TWO<<< ");
				
				playCard(handPlayerTwo, uno);
				System.out.println();
			}
			while (counter < 54);
			
			
		}	
	}


	
	
	
	// ODEV cardlari match edecek hale getirmek
		
	

	
	
	
	
	

