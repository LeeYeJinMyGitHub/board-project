package com.example.board_project.model.entity;

import com.example.board_project.dto.BoardInfoDto;
import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Builder
@Accessors(chain = true)
public class BoardInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String contents;

    public BoardInfo(BoardInfoDto boardInfoDto) {
      this.id = boardInfoDto.getId();
      this.title = boardInfoDto.getTitle();
      this.contents = boardInfoDto.getContents();
  }

  public static BoardInfo createBoardInfo(BoardInfoDto boardInfoDto){
    return new BoardInfo(boardInfoDto);
  }
}
