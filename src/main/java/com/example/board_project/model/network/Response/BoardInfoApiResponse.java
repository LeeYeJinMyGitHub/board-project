package com.example.board_project.model.network.Response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BoardInfoApiResponse {

    private Long id;
    private String title;
    private String contents;
}
