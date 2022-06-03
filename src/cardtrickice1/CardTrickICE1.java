package cardtrickice1;

import java.util.Scanner;

/**
 * step 1: generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in the array 'card is found'
 *
 * @author sivagamasrinivasan,May 23rd
 * @author rana ibrahim 991655999, June 3rd
 */
public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //create Card object
        Card luckyCard = new Card();
        luckyCard.setValue(7);
        luckyCard.setSuits("diamond");
        
        //create random cards and print random cards
        Card[] magicHand = new Card[7];
        for (int i = 0; i < magicHand.length; i++) {
            Card card = new Card();
            card.setValue(Card.randomNumber());
            card.setSuits(Card.randomSuit());
            magicHand[i] = card;
        }
        System.out.println("Here are the randomized cards:\n");
        for (Card card : magicHand) {
            System.out.printf("%d of %s\n", card.getValue(), card.getSuits());
        }

        //step 2: take input
        System.out.print("\nPlease choose a suit:\n");
        System.out.println("- Diamonds");
        System.out.println("- Clubs");
        System.out.println("- Spades");
        System.out.println("- Hearts");
        String suit = input.next();
        System.out.print("\nChoose a number from 1 to 13: ");
        int number = input.nextInt();

        //step 3: match with array and print message
        boolean notInArray = false;
        for (int i = 0; i < magicHand.length; i++) {
            if (magicHand[i].getSuits().equalsIgnoreCase(suit) && magicHand[i].getValue() == number) {
                notInArray = false;
                System.out.println("\nYour card is in the magic hand of cards :)\n");
                break;
            } else {
                notInArray = true;
            }
        }
        if (notInArray) {
            System.out.println("\nYour card is not in the magic hand of cards :(\n");
        }

    }
}
