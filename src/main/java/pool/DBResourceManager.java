package pool;

import java.util.Locale;
import java.util.ResourceBundle;

public class DBResourceManager {
    private final static DBResourceManager instance = new DBResourceManager();
   // Прописываем путь к конфиг файлу желательно с локализацией
    private ResourceBundle bundle =
            ResourceBundle.getBundle("db");
    public static DBResourceManager getInstance() {
        return instance;
    }
    public String getValue(String key){
        return bundle.getString(key);
    }
}
