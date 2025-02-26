public class HangmanGame {
    public static void main(String[] args) {
        System.out.println("Приветствуем Вас в игре Виселица!");
        System.out.println("Один холоп вводит слово, другой должен угадать его по буквам.");

        String word = WordInput.inputWord();
        Hangman game = new Hangman(word);

        HangmanDrawer.drawHangman(6); // Начальное состояние виселицы
        game.startGame();

        WordInput.closeScanner(); // Закрываем Scanner после завершения игр
    }
}
