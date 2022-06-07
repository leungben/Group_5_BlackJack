/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 * 
 * 
 * Game: BlackJack - A game that counts 21, this game is usually played against the dealer. In the game, A is considered either 1 or 11
 * depending on whichever is most beneficial for him. Face cards are all considered 10. The user starts with 2 cards and can either stay
 * or hit. If he stays and his two cards are higher than the dealer after the dealer makes his move, he wins otherwise he loses. If he hits,
 * he will gain an extra random card after which he can continue to choose between hit and stay. When the user finally decides to hit stay 
 * and it becomes the dealer's turn where if the dealer is lower than the user, he hits until his cards are either above or he busts with above 21.
 * As a side note, if user obtains 21 he automatically Wins regardless of what the dealer has.
 * 
 * GitHub: The Repository was made private, all collaborators will be required to accept invite from link in order to view repository.
 * I have sent a collaboration request to parashap@sheridan.desire2learn.com in order to allow you to view repository
 * 
 * @author Benedict Leung ID: 991329385
 * @author Dillon Pennell ID: 991388695
 * @author Sehnajpreet kaur ID: 991655975 
 * @author Abhai babu  ID: 991659790 
 */
public abstract class Card {
    //default modifier for child classes

    /**
     * Students should implement this method for their specific children classes
     *
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    @Override
    public abstract String toString();

}
