package com.example.board_project.service;

import com.example.board_project.dto.BoardInfoDto;
import com.example.board_project.model.entity.BoardInfo;
import org.springframework.transaction.annotation.Transactional;
import com.example.board_project.repository.BoardInfoRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@Transactional
@AllArgsConstructor
public class BoardInfoApiLogicService {

  @Autowired
  private BoardInfoRepository boardInfoRepository;

  public void savePosts(BoardInfoDto boardInfoDto) {
    boardInfoRepository.save(BoardInfo.createBoardInfo(boardInfoDto));
  }

  public BoardInfoDto getContents(BoardInfoDto boardInfoDto) {

    BoardInfoDto retObj = new BoardInfoDto();

    System.out.println(boardInfoDto.getId());
    System.out.println(boardInfoDto.getTitle());
    System.out.println(boardInfoDto.getContents());

    try {
      retObj.setId(boardInfoDto.getId());
      retObj.setTitle(boardInfoDto.getTitle());
      retObj.setContents(boardInfoDto.getContents());
    } catch (Exception e) {
      log.error("findLog", e);
    }

    return retObj;
  }



}
