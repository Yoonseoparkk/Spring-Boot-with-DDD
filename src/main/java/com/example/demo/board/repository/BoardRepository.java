package com.example.demo.board.repository;

import com.example.demo.board.entity.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface BoardRepository extends JpaRepository<Board, Long> {
    @Query("SELECT b FROM Board b JOIN FETCH b.writer ORDER BY b.boardId DESC")
    Page<Board>  findAllWithWriter(Pageable pageable);

    @Query("SELECT b FROM Board b JOIN FETCH b.writer w JOIN FETCH w.account WHERE b.boardId = :boardId")
    Optional<Board> findByIdWithWriter(Long boardId);
}