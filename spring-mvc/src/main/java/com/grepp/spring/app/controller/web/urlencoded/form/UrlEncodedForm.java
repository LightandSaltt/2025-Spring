package com.grepp.spring.app.controller.web.urlencoded.form;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

@AllArgsConstructor
//@RequiredArgsConstructor // -> 초기화가 반드시 변수 필요한 생성자 만들어줌
@Getter // -> getter 알아서 만들어줌
@Setter
@ToString
@NoArgsConstructor
public class UrlEncodedForm {

    @NotBlank
    private String userId;

    @Length(min = 4, max = 20)
    private String password;

    @Email(message = "이메일 양식 아닙니다.")
    private String email;

    @Length(min = 9, max = 11, message = "전화번호는 9~11자리입니다.")
    private String tel;

}
