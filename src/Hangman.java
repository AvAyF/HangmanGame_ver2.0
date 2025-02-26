public class Hangman {
    private final String word; // Загаданное слово
    private StringBuilder wordClear; // Прочерки у загаданного слова
    private int attemptsLeft; // Количество попыток
    private String guessedLetters; // Введенные буквы

    public Hangman(String word) {
        this.word = word.toUpperCase();
        this.wordClear = new StringBuilder("_".repeat(word.length()));
        this.attemptsLeft = setAttempts(word.length()); // Устанавливаем количество попыток
        this.guessedLetters = "";
    }

    private int setAttempts(int wordLength) {
        return Math.max(wordLength + 1, 6); // Количество попыток = длине слова + 1, но не меньше 6
    }

    public void startGame() {
        while (attemptsLeft > 0) {
            System.out.println("Слово: " + wordClear);
            System.out.println("Осталось попыток: " + attemptsLeft);
            String letter = WordInput.inputLetter(guessedLetters, isRussian(word)); // Определяем язык

            guessedLetters += letter; // Добавляем букву в список введенных

            if (word.contains(letter)) {
                updateWordClear(letter);
                if (wordClear.toString().equals(word)) {
                    endGame(true);
                    return;
                }
            } else {
                attemptsLeft--;
                if (attemptsLeft <= 6) { // Если осталось 6 или меньше попыток, рисуем виселицу
                    HangmanDrawer.drawHangman(attemptsLeft);
                }
            }
        }
        endGame(false);
    }

    private void updateWordClear(String letter) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter.charAt(0)) {
                wordClear.setCharAt(i, letter.charAt(0));
            }
        }
    }

    private void endGame(boolean isWin) {
        if (isWin) {
            System.out.println("Вы отгадали слово: " + word +
                            "\nСколь несправедлива судьба, придётся попрощаться..." +
                            "\nКазнить нельзя, помиловать!");
        } else {
            System.out.println("Вы не отгадали слово: " + word +
            "\nСправедливость восторжествовала!" +
                    "\nОтправить на виселицу!" +
                    "\nКазнить, нельзя помиловать!");
        }
    }

    private boolean isRussian(String word) {
        return word.matches("[А-ЯЁа-яё]+"); // Проверяем, содержит ли слово только русские буквы
    }
}
