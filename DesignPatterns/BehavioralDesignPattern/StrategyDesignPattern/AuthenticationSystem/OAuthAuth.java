public class OAuthAuth implements AuthStrategy{
    @Override
    public boolean authenticate(String userId, String token) {
        System.out.println("Authentication via OAuth for : "+userId);
        return token != null && token.startsWith("oauth_");
    }
}
