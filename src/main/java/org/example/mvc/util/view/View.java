package org.example.mvc.util.view;

import lombok.*;

// FrontController 인 DispatcherServlet 인 화면의 분기방식과 응답 페이지 정보를 반환 받을 수 있도록
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class View {
    private String responseJsp; // 응답페이지 정보
    private boolean isFlag; // true -> forward, false -> redirect


}
