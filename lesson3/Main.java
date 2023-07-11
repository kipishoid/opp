package lesson3;

import lesson3.Game.Answer;
import lesson3.Game.GameStatus;
import lesson3.Game.Logging;
import lesson3.Game.Version;
import lesson3.Game.VersionGame.AbstractGame;
import lesson3.Game.VersionGame.EnGame;
import lesson3.Game.VersionGame.NumberGame;
import lesson3.Game.VersionGame.RuGame;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в игру <<Быки и коровы!>>\n" +
                "Правила игры:\n" +
                "За несколько попыток игрок должен отгадать, какое слово или число загадал компьютер.\n" +
                "Быки - (позиция), Коровы - (значение)\n" +
                "Старт!\n");
        Scanner scanner = new Scanner(System.in);
        boolean restartGame = true;
        while (restartGame) {
            System.out.print("Версии игры:\n" +
                    "Введите NUM - цифры\n" +
                    "Введите RU - русские слова\n" +
                    "Введите EN - английские слова\n");
            Version version = Version.valueOf(scanner.next());
            AbstractGame game = versionChoice(version);
            System.out.print("Введите длину слова: ");
            int lengthWord = scanner.nextInt();
            System.out.print("Введите количество попыток: ");
            int CountTry = scanner.nextInt();
            scanner.nextLine();
            game.start(lengthWord, CountTry);
            List<Logging> logging = new LinkedList<>(Arrays.asList(
                    new Logging("СТАРТ", game.getWord())));
            boolean isWin = false;
            boolean isLose = false;
            String input = null;
            Answer answer = null;
            while (!(isLose || isWin)) {
                System.out.print("слово - ");
                input = scanner.nextLine();
                answer = game.inputValue(input);
                if (answer != null)
                    System.out.println(answer);
                isWin = game.getGameStatus() == GameStatus.WIN;
                isLose = game.getGameStatus() == GameStatus.LOSE;
                logging.add(new Logging(input, answer));
            }
            finishGame(logging, isWin, input, answer);
            loggingGame(scanner, logging);
            System.out.print("Поиграем еще? Y/N: ");
            input = scanner.next();
            if (!(input.toUpperCase().equals("Y")))
                restartGame = false;
        }
        scanner.close();
    }

    private static void loggingGame(Scanner scanner, List<Logging> logging) {
        System.out.print("Посмотреть историю игры? Y/N: ");
        String input = scanner.next();
        if (input.toUpperCase().equals("Y")) {
            for (Logging log : logging) {
                System.out.println(log);
            }
        }
    }

    private static void finishGame(List<Logging> logging, boolean isWin, String input, Answer answer) {
        if (isWin) {
            System.out.println("Вы победили!");
            logging.add(new Logging("ПОБЕДА", input, answer));
        } else {
            System.out.println("Вы проиграли...");
            logging.add(new Logging("ПРОИГРЫШ", input, answer));
        }
    }

    private static AbstractGame versionChoice(Version version) {
        AbstractGame game = null;
        switch (version) {
            case RU -> game = new RuGame();
            case EN -> game = new EnGame();
            case NUM -> game = new NumberGame();
        }
        return game;
    }
}
