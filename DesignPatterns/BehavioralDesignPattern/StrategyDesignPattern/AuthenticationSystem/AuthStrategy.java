//Strategy
public interface AuthStrategy {
    boolean authenticate(String userId, String credential);
}
