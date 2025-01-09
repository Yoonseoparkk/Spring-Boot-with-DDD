package com.example.demo.board.service;

import com.example.demo.board.service.request.ListBoardRequest;
import com.example.demo.board.service.response.ListBoardResponse;

public interface BoardService {
    ListBoardResponse list(ListBoardRequest request);
}