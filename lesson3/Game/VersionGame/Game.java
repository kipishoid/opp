package lesson3.Game.VersionGame;

import lesson3.Game.Answer;
import lesson3.Game.GameStatus;

public interface Game {
    void start(int lengthWord, int countTry);

    Answer inputValue(String value);

    GameStatus getGameStatus();
}
