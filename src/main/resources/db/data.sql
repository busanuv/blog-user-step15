insert into user_tb(username, password, email, created_at) values('ssar', '1234', 'ssar@nate.com', now());
insert into user_tb(username, password, email, created_at) values('cos', '1234', 'cos@nate.com', now());

insert into board_tb(title, content, user_id, created_at) values('제목1', '내용1', 1, now());
insert into board_tb(title, content, user_id, created_at) values('제목2', '내용2', 1, now());
insert into board_tb(title, content, user_id, created_at) values('제목3', '내용3', 2, now());

insert into reply_tb(comment, board_id, user_id, created_at) values('댓글1', 1, 1, now());
insert into reply_tb(comment, board_id, user_id, created_at) values('댓글2', 1, 2, now());