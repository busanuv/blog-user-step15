package shop.mtcoding.blogv2.board;

import lombok.Data;

public class BoardResponse {



    @Data
    public static class DTO {
        private int id;
        private String title;

        public DTO(Board board){
            this.id = board.getId();
            this.title = board.getTitle();
        }
    }

}
