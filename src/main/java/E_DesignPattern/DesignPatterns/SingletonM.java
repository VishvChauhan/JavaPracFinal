package E_DesignPattern.DesignPatterns;

public class SingletonM {

    // private constructor
    private SingletonM() {}

    //static SingletonHolder class
    private static class SingletonHolder {

        private static final SingletonM INSTANCE = new SingletonM();
    }

    // getInstance method
    public static SingletonM getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
