public class HangmanDrawer {
    public static void drawHangman(int attemptsLeft) {
        switch (attemptsLeft) {
            case 6:
                System.out.println("  +---+  \n" +
                        "      |  \n" +
                        "      |  \n" +
                        "      |  \n" +
                        "      |  \n" +
                        "    =====");
                break;
            case 5:
                System.out.println("  +---+  \n" +
                        "  O   |  \n" +
                        "      |  \n" +
                        "      |  \n" +
                        "      |  \n" +
                        "    =====");
                break;
            case 4:
                System.out.println("  +---+  \n" +
                        "  O   |  \n" +
                        "  |   |  \n" +
                        "      |  \n" +
                        "      |  \n" +
                        "    =====");
                break;
            case 3:
                System.out.println("  +---+  \n" +
                        "  O   |  \n" +
                        " /|   |  \n" +
                        "      |  \n" +
                        "      |  \n" +
                        "    =====");
                break;
            case 2:
                System.out.println("  +---+  \n" +
                        "  O   |  \n" +
                        " /|\\  |  \n" +
                        "      |  \n" +
                        "      |  \n" +
                        "    =====");
                break;
            case 1:
                System.out.println("  +---+  \n" +
                        "  O   |  \n" +
                        " /|\\  |  \n" +
                        " /    |  \n" +
                        "      |  \n" +
                        "    =====");
                break;
            case 0:
                System.out.println("  +---+  \n" +
                        "  O   |  \n" +
                        " /|\\  |  \n" +
                        " / \\  |  \n" +
                        "      |  \n" +
                        "    =====");
                break;
            default:
                System.out.println("Ошибка: некорректное количество попыток.");
                break;
        }
    }
}
