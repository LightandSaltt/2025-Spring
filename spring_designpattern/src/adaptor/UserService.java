package adaptor;

import adaptor.api.google.GoogleAdaptor;
import adaptor.api.kakao.KakaoAdaptor;

public class UserService {

    public UserProfile login(String provider, String token) {
        // 로직 처리
        // 어댑터를 만들어주면 해결
        SocialLogin socialLogin = null;

        switch (provider.toUpperCase()){
            case "kakao": socialLogin = new KakaoAdaptor();
                break;
            case "google": socialLogin = new GoogleAdaptor();
                break;
            default:
                throw new RuntimeException("지원하지 않습니다.");
        }

        UserProfile profile = socialLogin.login(token);
        System.out.println(profile);
        return profile;
    }
}
