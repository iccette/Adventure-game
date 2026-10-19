import java.util.Scanner;

public class AdventureGame {

    public static void displayHelp() {
        System.out.println("\nAvailable commands:");
        System.out.println("north - Walk north");
        System.out.println("south - Walk south");
        System.out.println("east - Walk east");
        System.out.println("west - Walk west");
        System.out.println("look - Look around");
        System.out.println("search - Search for clues");
        System.out.println("take - Pick up a key");
        System.out.println("open - Open a chest");
        System.out.println("sleep - Rest");
        System.out.println("help - Show available commands");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean playing = true;
        int turns = 0;

        System.out.println("Welcome to the Mysterious Castle!");
        System.out.println("Find the secret word to escape.");
        displayHelp();

        while (playing && input.hasNextLine()) {
            System.out.print("\nEnter a command: ");
            String command = input.nextLine().trim().toLowerCase();

            // Help does not count as a turn.
            if (command.equals("help")) {
                displayHelp();
                continue;
            }

            turns++;

            switch (command) {
                case "north":
                case "go north":
                    System.out.println(
                        "You walk north and find a locked iron gate."
                    );
                    break;

                case "south":
                case "go south":
                    System.out.println(
                        "You walk south into a dusty library."
                    );
                    break;

                case "east":
                case "go east":
                    System.out.println(
                        "You walk east and discover a dark hallway."
                    );
                    break;

                case "west":
                case "go west":
                    System.out.println(
                        "You walk west into an abandoned kitchen."
                    );
                    break;

                case "look":
                    System.out.println(
                        "You see stone walls and a flickering candle."
                    );
                    break;

                case "search":
                    System.out.println(
                        "You find a note: 'The opposite of captivity "
                        + "is the key to escape.'"
                    );
                    break;

                case "take":
                    System.out.println(
                        "You pick up a small golden key."
                    );
                    break;

                case "open":
                    System.out.println(
                        "You open a chest and find an old map."
                    );
                    break;

                case "sleep":
                    System.out.println(
                        "You rest on a dusty bed and wake up refreshed."
                    );
                    break;

                case "freedom":
                    System.out.println(
                        "A secret door opens. You escape the castle!"
                    );
                    playing = false;
                    break;

                default:
                    System.out.println("Unknown command.");
                    displayHelp();
                    break;
            }
        }

        System.out.println("\nTotal turns: " + turns);
        input.close();
    }
}