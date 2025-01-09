package com.example.demo.board.controller;

import com.example.demo.board.controller.request_form.ListBoardRequestForm;
import com.example.demo.board.controller.response_form.ListBoardResponseForm;
import com.example.demo.board.service.BoardService;
import com.example.demo.board.service.response.ListBoardResponse;
import com.example.demo.redis_cache.service.RedisCacheService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {
    final private BoardService boardService;
    final private RedisCacheService redisCacheService;

    @GetMapping("/list")
    public ListBoardResponseForm boardList(@ModelAttribute ListBoardRequestForm requestForm) {
        log.info("boardList() -> {}", requestForm);

        ListBoardResponse response = boardService.list(requestForm.toListBoardRequest());

        return ListBoardResponseForm.from(
                List.of(response),  // 하나의 ListBoardResponse 객체를 List로 감싸서 전달
                (int) response.getTotalItems(),
                response.getTotalPages()
        );
    }
}