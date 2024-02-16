package bootcampjavapamarican.spring.core;

// singleton @ salah satu design pattern untuk pembuatan objeck, dan sebuah objek hanya dibuat satu kali saja.
public class Database {

    private static Database database;

    public static Database getInstance(){
        if (database == null){
            database = new Database();
        }
        return database;
    }

    private Database(){

    }
}
