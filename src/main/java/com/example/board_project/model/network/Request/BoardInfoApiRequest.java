package com.example.board_project.model.network.Request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BoardInfoApiRequest {

    private Long id;
    private String title;
    private String contents;
}
