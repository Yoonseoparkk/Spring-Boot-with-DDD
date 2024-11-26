package practice.first.player.repository;

import org.springframework.stereotype.Repository;
import practice.first.player.entity.Player;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PlayerRepositoryImpl implements PlayerRepository {
    static List<Player> playerList = new ArrayList<>();

    final String playerNickname = "player0";
    int playerCount = 0;

    @Override
    public Player create() {
        String nickname = playerNickname + ++playerCount;
        Player player = new Player(nickname);

        playerList.add(player);

        return player;
    }

    @Override
    public List<Player> select() {
        if (playerList.size() < 2) {
            return List.of();
        }

        List<Player> gamePlayerList = new ArrayList<>();

        int idx1 = (int) (Math.random() * playerList.size());
        int idx2 = (int) (Math.random() * playerList.size());
        while (idx2 == idx1) {
            idx2 = (int) (Math.random() * playerList.size());
        }

        gamePlayerList.add(playerList.get(idx1));
        gamePlayerList.add(playerList.get(idx2));

        return gamePlayerList;
    }
}
