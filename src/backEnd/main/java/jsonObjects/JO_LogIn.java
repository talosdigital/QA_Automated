package jsonObjects;

import org.json.JSONObject;

public class JO_LogIn {
        public JSONObject correctLogIn(){
        JSONObject json = new JSONObject();
        json.put("username","brayan.posada@talosdigital.com");
        json.put("rememberMe",true);
        json.put("password","asdasd");
        return json;
    }
}
