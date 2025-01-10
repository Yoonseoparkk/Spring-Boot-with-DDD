package com.example.demo.board.service;

import com.example.demo.board.entity.Board;
import com.example.demo.board.service.request.CreateBoardRequest;
import com.example.demo.board.service.request.ListBoardRequest;
import com.example.demo.board.service.response.ListBoardResponse;

public interface BoardService {
    ListBoardResponse list(ListBoardRequest request);
    Board register(CreateBoardRequest createBoardRequest);
}