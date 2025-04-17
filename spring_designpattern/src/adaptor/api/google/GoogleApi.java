package adaptor.api.google;

public class GoogleApi {

    public GoogleProfile getProfile(String token) {
        return new GoogleProfile("google user", "google@google.com");
    }
}
