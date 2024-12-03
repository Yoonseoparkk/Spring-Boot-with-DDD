//package com.example.demo.player.controller;
//
//import com.example.demo.player.entity.Player;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.demo.player.service.PlayerService;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@Slf4j
//@RestController
//@RequiredArgsConstructor
//@RequestMapping("/player")
//public class PlayerController {
//    final private PlayerService playerService;
//
//    @GetMapping("/create")
//    public Player createPlayer(@RequestParam("nickname") String nickname) {
//        log.info("createPlayer() called with nickname: {}", nickname);
//
//        Player player = playerService.createPlayer(nickname);
//        return player;
//    }
//
//    @GetMapping("/list")
//    public List<Player> playerList() {
//        log.info("playerList() called!");
//
//        return playerService.playerList();
//    }
//}