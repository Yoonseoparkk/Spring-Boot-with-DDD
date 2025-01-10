package com.example.demo.board.controller.request_form;

import com.example.demo.board.service.request.ListBoardRequest;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor
public class ListBoardRequestForm {
    final private int page;
    final private int perPage;

    public ListBoardRequest toListBoardRequest() {
        return new ListBoardRequest(page, perPage);
    }
}