package com.example.board_project.repository;

import com.example.board_project.model.entity.BoardInfo;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BoardInfoRepository extends JpaRepository<BoardInfo,Long> {
    Optional<BoardInfo> findById(Long Id);


}
