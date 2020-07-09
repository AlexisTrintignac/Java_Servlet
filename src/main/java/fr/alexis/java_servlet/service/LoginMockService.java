package fr.alexis.java_servlet.service;

import java.util.HashMap;
import java.util.Map;

public class LoginMockService {

    private Map<String, String> accountList = new HashMap<String, String>();

    public LoginMockService() {
        this.accountList.put("Alexis", "19041999");
        this.accountList.put("Lucas", "azerty");
        this.accountList.put("Jordan", "babouche");
    }

    public boolean isAllowedToLogOn(String identifiant, String mdp) {
        if (this.accountList.containsKey(identifiant)) {
            if (this.accountList.get(identifiant) == mdp) {
                return true;
            }
        }
        return false;
    }
}
