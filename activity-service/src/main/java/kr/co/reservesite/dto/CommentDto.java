package kr.co.reservesite.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentDto {

    private Long id;
    private Long userId;
    private String nickname;
    private String content;
    private int likeCnt;
}
