package adaptor;

// 페북, 카카오, 구글등 다양한 로그인에 대처하기 위한 레코드
public record UserProfile(
    String name,
    String email
) { }