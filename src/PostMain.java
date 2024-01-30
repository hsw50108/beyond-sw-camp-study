import com.encore.post.domain.PostRequestDto;
import com.encore.post.service.PostService;
import com.encore.post.view.PostView;

import java.time.LocalDateTime;

public class PostMain {
    public static void main(String[] args) {
//        PostService postService = new PostService();
//        System.out.println("debug >>>> main caller -> service savePost working method");

        // case01
        //String result = postService.savePost("dongwook", "공지사항", "휴강입니다.", LocalDateTime.now(), 100, true);
        //System.out.println(result);

        // case02

//        PostRequestDto request = new PostRequestDto("dongwook", "공지사항", "휴강입니다.", LocalDateTime.now(), 100, true);
//        String msg = postService.savePost(request);
//        System.out.println("Result >>>" + msg);

        // case03
        // view를 이용한 사용자 입력과 연결
//        PostView view = new PostView();
//        view.menu();

        // case04
        // 불필요하게 발생되는 객체생성을 효율적으로 관리하기 위해서 얕은복사 개념을 사용할 수 있다.

        PostService postService = new PostService();
        PostRequestDto postRequestDto = new PostRequestDto();

        PostView postView = new PostView(postService, postRequestDto);
//        PostView postView = new PostView(new PostService(), new PostRequestDto());

        postView.menu();
    }

}
