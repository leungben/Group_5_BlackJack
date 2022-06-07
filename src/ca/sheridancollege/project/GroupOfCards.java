/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 *
 * * Game: BlackJack - A game that counts 21, this game is usually played against the dealer. In the game, A is considered either 1 or 11
 * depending on whichever is most beneficial for him. Face cards are all considered 10. The user starts with 2 cards and can either stay
 * or hit. If he stays and his two cards are higher than the dealer after the dealer makes his move, he wins otherwise he loses. If he hits,
 * he will gain an extra random card after which he can continue to choose between hit and stay. When the user finally decides to hit stay 
 * and it becomes the dealer's turn where if the dealer is lower than the user, he hits until his cards are either above or he busts with above 21.
 * As a side note, if user obtains 21 he automatically Wins regardless of what the dealer has.
 * 
 * 
 * 
 * @author Benedict Leung ID: 991329385
 * @author Dillon Pennell ID: 991388695
 * @author Sehnajpreet kaur ID: 991655975 
 * @author Abhai babu  ID: 991659790 
 */
public class GroupOfCards {

    //The group of cards, stored in an ArrayList
    private ArrayList<Card> cards;
    private int size;//the size of the grouping

    public GroupOfCards(int size) {
        this.size = size;
    }

    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     */
    public ArrayList<Card> getCards() {
        return cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the max size for the group of cards
     */
    public void setSize(int size) {
        this.size = size;
    }

}//end class
