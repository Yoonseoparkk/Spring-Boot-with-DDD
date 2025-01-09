package com.example.demo.board.service.response;

import com.example.demo.board.entity.Board;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter
@RequiredArgsConstructor
public class ListBoardResponse {
    private final List<Board> boardList;
    private final long totalItems;
    private final int totalPages;

    // 날짜를 포맷하며 반환하는 메소드
    public List<Map<String, Object>> getBoardListWithNicknames() {
        return boardList.stream().map(board -> {
            Map<String, Object> boardMap = new HashMap<>();
            boardMap.put("boardId", board.getBoardId());
            boardMap.put("title", board.getTitle());
            boardMap.put("content", board.getContent());
            boardMap.put("nickname", board.getWriter().getNickname());
            boardMap.put("createDate", formatDate(board.getCreateDate()));  // 날짜 포맷 적용
            return boardMap;
        }).collect(Collectors.toList());
    }

    // 날짜 포맷팅 함수
    private String formatDate(LocalDateTime dateTime) {
        if (dateTime == null) return "";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return dateTime.format(formatter);
    }
}