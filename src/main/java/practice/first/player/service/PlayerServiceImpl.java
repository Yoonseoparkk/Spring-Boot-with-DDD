package practice.first.player.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import practice.first.player.entity.Player;
import practice.first.player.repository.PlayerRepository;

@Service
@RequiredArgsConstructor
public class PlayerServiceImpl implements PlayerService {
    final private PlayerRepository playerRepository;

    @Override
    public Player createPlayer() {
        return playerRepository.create();
    }
}
