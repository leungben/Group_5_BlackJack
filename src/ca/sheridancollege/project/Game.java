/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * The class that models your game. You should create a more specific child of this class and instantiate the methods
 * given.
 *
 * * Game: BlackJack - A game that counts 21, this game is usually played against the dealer. In the game, A is considered either 1 or 11
 * depending on whichever is most beneficial for him. Face cards are all considered 10. The user starts with 2 cards and can either stay
 * or hit. If he stays and his two cards are higher than the dealer after the dealer makes his move, he wins otherwise he loses. If he hits,
 * he will gain an extra random card after which he can continue to choose between hit and stay. When the user finally decides to hit stay 
 * and it becomes the dealer's turn where if the dealer is lower than the user, he hits until his cards are either above or he busts with above 21.
 * As a side note, if user obtains 21 he automatically Wins regardless of what the dealer has.
 * 
 * OOD Principles being used, There will be encapsulation with Abstract Classes that were originally given from the 
 * Original Project. There will be Two classes extending from them to allow for abstraction the classes and inheritence and
 * are respectively BlackJack.java, StandardCard.java. There is a lot of uses of cohesiveness and delegations.
 * Delegations is utilized by points and CardPicking each of which do a specific tasks. Points will only take the card in a given array
 * and figure out the number of points. CardPicking is only used to add a card to the dealer/user's hand and remove from the deck
 * Those two delegations are also prime examples of cohesiveness. Also There is loose coupling by utilizing enum 
 * as a variable we can easily change the deck to use different types of cards. or we can change the number of cards 
 * in the deck in order to utilize a larger deck.
 * 
 * If you take a look at the Visual Diagram, We have a user, which is then allowed choice to play game or not if they select
 * Y/y they will start the game, if they select no it will exit. Any other value will result in a loop with a display of invalid
 * afterwards they will obtain two cards from which they can either select 1 for hit or 2 for stay. any other number will result in invalid
 * After they have selected hit it will then automatically use the two classes Cardpicking and Points to respectively give them 
 * a card as well as calculate if they have busted or not. If they have busted game over otherwise they will have a choice to
 * hit or stay again. If they choose stay, The game will also automatically determine what your cards are if they are above 21
 * then if dealer is above 21. If dealer is above 21 you win. and then via if statements, in the declareWinner()method, 
 * you will either tie lose or win depending on what your points are versus the dealer's. Afterwards it will enter another loop
 * which will take you back to the start of the game asking if you want to play the game or not.
 * 
 * Any choices that divert from 1 or 2 will be considered invalid and will reloop the choices until 1/2 is selected
 * 
 * 
 * GitHub: The Repository was made public, https://github.com/leungben/Group_5_BlackJack the link to repository
 *  
 * @author Benedict Leung ID: 991329385
 * @author Sehnajpreet kaur ID: 991655975 
 * @author Abhai babu  ID: 991659790 
 */
public abstract class Game {

    private final String name;//the title of the game
    private ArrayList<Player> players;// the players of the game

    public Game(String name) {
        this.name = name;
        players = new ArrayList();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the players of this game
     */
    public ArrayList<Player> getPlayers() {
        return players;
    }

    /**
     * @param players the players of this game
     */
    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    /**
     * Play the game. This might be one method or many method calls depending on your game.
     */
    public abstract void play();

    /**
     * When the game is over, use this method to declare and display a winning player.
     */
    public abstract void declareWinner();

}//end class
