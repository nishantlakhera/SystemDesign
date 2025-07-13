//Context
public class AuthService {
    private AuthStrategy strategy;

    public void setAuthStrategy(AuthStrategy strategy){
        this.strategy = strategy;
    }

    public void login(String userId, String credential){
        if(strategy == null){
            System.out.println("No authentication strategy set.");
            return;
        }
        boolean result = strategy.authenticate(userId, credential);
        if(result){
            System.out.println("✅Authentication successful. \n");
        }else{
            System.out.println("❌Authentication failed. \n");
        }
    }
}
