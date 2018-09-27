package json;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.StringWriter;

public class Main {
    public static void main(String[] args) throws JSONException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Artem", 27);
        jsonObject.put("Vany", 7);
        jsonObject.put("Lera", 24);
        jsonObject.put("Vova", 22);
        jsonObject.put("Sveta", 32);
        jsonObject.get("Artem");
        System.out.println(jsonObject);
    }
}
