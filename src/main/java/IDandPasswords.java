import java.util.HashMap;

public class IDandPasswords {

    HashMap<String, String> loginInfo = new HashMap<>();

    public IDandPasswords(HashMap<String, String> loginInfo) {
        this.loginInfo = loginInfo;
    }

    public IDandPasswords() {

        loginInfo.put("Bro", "pizza");
        loginInfo.put("Brometheus", "PASSWORD");
        loginInfo.put("BroCode", "abc123");
    }

    protected HashMap<String, String> getLoginInfo() {
        return loginInfo;
    }


}
