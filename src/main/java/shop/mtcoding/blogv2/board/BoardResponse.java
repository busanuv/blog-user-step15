package shop.mtcoding.blogv2.board;

import lombok.Data;
import shop.mtcoding.blogv2.user.User;

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

    @Data
    public static class DetailDTO {
        private int id;
        private String title;
        private String content;
        private int userId;
        private String username;
        private boolean isOwner;

        public DetailDTO(Board board, User sessionUser){
            this.id = board.getId();
            this.title = board.getTitle();
            this.content = board.getContent();
            this.userId = board.getUser().getId();
            this.username = board.getUser().getUsername();
            if(sessionUser == null){
                this.isOwner = false;
            }else{
                this.isOwner = sessionUser.getId() == board.getUser().getId() ? true : false;
            }
        }
    }

}
