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
}
