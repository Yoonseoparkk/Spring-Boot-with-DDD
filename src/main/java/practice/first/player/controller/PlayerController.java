package practice.first.player.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import practice.first.player.entity.Player;
import practice.first.player.service.PlayerService;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/player")
public class PlayerController {
    final private PlayerService playerService;

    @GetMapping("/create-player")
    public Player createPlayer() {
        log.info("/create-player() called");
        Player createdPlayer = playerService.createPlayer();

        return createdPlayer;
    }
}
