package adaptor.api.kakao;

import adaptor.SocialLogin;
import adaptor.UserProfile;
import adaptor.api.google.GoogleApi;
import adaptor.api.google.GoogleProfile;

public class KakaoAdaptor implements SocialLogin {

    private KakaoApi api = new KakaoApi();

    @Override
    public UserProfile login(String token) {
        KakaoProfile profile = api.getProfile(token);
        return new UserProfile(profile.name(), profile.mail());
    }
}
