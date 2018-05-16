package it.polimi.se2018.events;

import it.polimi.se2018.model.Position;

/**
 * This class represents the event related to the toolCard TapWheel
 * @author fabio
 */
public class TapWheelEvent {

    private int roundIndex;
    private int diceIndex;
    private Position firstDicePosition;
    private Position secondDicePosition;
    private Position newFirstDicePosition;
    private Position newSecondDicePosition;

    /**
     * Constructor of the class
     * @param userInput It's the string that contains the parameters
     * @throws IllegalArgumentException If the string does not contain valid parameters
     */
    public TapWheelEvent(String userInput) {
        try {
            String[] input = userInput.split("\\s+");
            roundIndex = Integer.parseInt(input[0]) - 1;
            diceIndex = Integer.parseInt(input[1]) - 1;
            firstDicePosition = new Position(Integer.parseInt(input[2]) - 1, Integer.parseInt(input[3]) - 1);
            if(input.length == 10) {
                secondDicePosition = new Position(Integer.parseInt(input[4]) - 1, Integer.parseInt(input[5]) - 1);
                newFirstDicePosition = new Position(Integer.parseInt(input[6]) - 1, Integer.parseInt(input[7]) - 1);
                newSecondDicePosition = new Position(Integer.parseInt(input[8]) - 1, Integer.parseInt(input[9]) - 1);
            } else {
                newFirstDicePosition = new Position(Integer.parseInt(input[4]) - 1, Integer.parseInt(input[5]) - 1);
            }
        }
        catch (IndexOutOfBoundsException e) {
            throw new IllegalArgumentException("Paramentri insufficienti");
        }
        catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Parametri non numerici o sbagliati");
        }
    }

    /**
     * @return The roundIndex attribute
     */
    public int getRoundIndex() {
        return roundIndex;
    }

    /**
     * @return The diceIndex attribute
     */
    public int getDiceIndex() {
        return diceIndex;
    }

    /**
     * @return The firstDicePosition attribute
     */
    public Position getFirstDicePosition() {
        return firstDicePosition;
    }

    /**
     * @return The secondDicePosition attribute
     */
    public Position getSecondDicePosition() {
        return secondDicePosition;
    }

    /**
     * @return The newFirstDicePosition attribute
     */
    public Position getNewFirstDicePosition() {
        return newFirstDicePosition;
    }

    /**
     * @return The newSecondDicePosition attribute
     */
    public Position getNewSecondDicePosition() {
        return newSecondDicePosition;
    }

    /**
     * @return The name of this class
     */
    @Override
    public String toString() {
        return "TapWheelEvent";
    }
}
