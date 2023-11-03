package shop.mtcoding.blogv2.board;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import shop.mtcoding.blogv2._core.error.ex.Exception500;
import shop.mtcoding.blogv2.user.User;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RequiredArgsConstructor
@Service
public class BoardService {
    private final BoardRepository boardRepository;

    @Transactional
    public void 게시글쓰기(BoardRequest.SaveDTO requestDTO, User sessionUser){
        try {
            boardRepository.save(requestDTO.toEntity(sessionUser));
        }catch (Exception e){
            log.error("DB error : "+e.getMessage());
            throw new Exception500("게시글쓰기 오류");
        }
    }

    public List<BoardResponse.DTO> 게시글목록보기() {
        List<Board> boardListPS = boardRepository.findAll();
        return boardListPS.stream().map(board -> new BoardResponse.DTO(board)).collect(Collectors.toList());
    }
}
