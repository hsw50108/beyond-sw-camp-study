package com.example.encore_spring_pjt.controller.vaild;

import com.example.encore_spring_pjt.controller.vaild.domain.UserRequestDto;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/valid")
public class RestValidController {

    // json 데이터 전달이 되었을 때를 가정
    // BindingResult : 유효성 검증에 실패한 메시지를 모아서 관리하는 객체
    @PostMapping("/create")
    public ResponseEntity create(@RequestBody @Valid UserRequestDto params, BindingResult bindingResult) {
        System.out.println("RestValidController.postMethodName");
        System.out.println("params : " + params);

        if (bindingResult.hasErrors()) {
            System.out.println("error message");
//            StringBuffer buffer = new StringBuffer();
            Map<String, String> map = new HashMap<>();

            List<ObjectError> list = bindingResult.getAllErrors();

            for (int i = 0; i < list.size(); i++) {
                FieldError field = (FieldError) list.get(i);
                String defaultMessage = list.get(i).getDefaultMessage();
                map.put(field.getField(), defaultMessage);
//                buffer.append(field.getField()).append(defaultMessage).append("\n");
//                System.out.println(field.getField() + ":" + defaultMessage);
            }
//            System.out.println(buffer);
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(map);
            return new ResponseEntity(map, HttpStatus.BAD_REQUEST);

        } else {
            System.out.println("no error message");
        }

        return new ResponseEntity(params, HttpStatus.OK);
    }

}
