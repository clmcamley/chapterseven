//Exercise 7.29

public class PickAndSumCards {
    public static void main(String[] args) {
        int[] deck = new int[52];
        int sum = 0;
        int numberOfPicks = 0;

        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }

        //I don't understand how to interpret "display the number of picks that yields the sum of 24"
        //so I will do the three ways that I think are possible interpretations of this:

        //First interpretation: continue to pick until the sum is 24 and display how many picks that took

        do {
            sum = 0;

            for (int i = 0; i < deck.length; i++) {
                int index = (int)(Math.random() * deck.length);
                int temp = deck[i];
                deck[i] = deck[index];
                deck[index] = temp;
            }
    
            for (int i = 0; i < 4; i++) {
                int rank = deck[i] % 13;
                sum += rank;
            }

            numberOfPicks++;
        } while (sum != 24);

        System.out.printf("It took %d picks of to get a sum of 24.\n", numberOfPicks);

        //Second interpretation: In one shuffle of the deck, pick the whole deck and count how many picks sum to 24

        sum = 0;
        numberOfPicks = 0;

        for (int i = 0; i < deck.length; i++) {
            int index = (int)(Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }

        for (int j = 0; j < 13; j++) {
            for (int i = 0; i < 4; i++) {
                int rank = deck[i] % 13;
                sum += rank;
            }

            if (sum == 24) {
                numberOfPicks++;
            }
        }

        System.out.printf("%d picks yielded a sum of 24 in one shuffle of the deck.\n", numberOfPicks);

        //Third interpretation: How many possible ways are there to draw 4 cards out of a deck that sum to 24?

        numberOfPicks = 0;

        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 13; j++) {
                for (int k = 0; k < 13; k++) {
                    for (int l = 0; l < 13; l++) {
                        if ((i + j + k + l) == 24) {
                            numberOfPicks++;
                        }
                    }
                }
            }
        }

        System.out.printf("There are %d possible picks that yield a sum of 24 in a 52-card deck.", numberOfPicks);
    }
}