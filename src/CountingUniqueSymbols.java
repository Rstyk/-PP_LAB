import java.util.Scanner;

class CountingUniqueSymbols {
    private char symbol;
    private int count;

    public CountingUniqueSymbols(char character, int count) {
        this.symbol = character;
        this.count = count;
    }

    public char getCharacter() {
        return symbol;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Symbol: " + symbol + ", Count: " + count;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String userString = console.nextLine();

        char[] characters = userString.toCharArray();
        CountingUniqueSymbols [] charCounts = new CountingUniqueSymbols[characters.length];
        boolean[] counted = new boolean[characters.length];

        int uniqueCount = 0;

        for (int i = 0; i < characters.length; i++) {
            if (!counted[i]) {
                int count = 1;
                for (int j = i + 1; j < characters.length; j++) {
                    if (characters[i] == characters[j]) {
                        count++;
                        counted[j] = true;
                    }
                }
                charCounts[uniqueCount++] = new CountingUniqueSymbols(characters[i], count);
            }
        }

        for (int i = 0; i < uniqueCount; i++) {
            System.out.println(charCounts[i]);
        }
    }
}

