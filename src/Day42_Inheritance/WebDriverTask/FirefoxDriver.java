package Day42_Inheritance.WebDriverTask;

public class FirefoxDriver extends RemoteDriver{

    public FirefoxDriver() {
        super("Firefox Driver","V83.0.1");
    }

    @Override
    public void get(String URL) {
        System.out.println("Opening "+URL+" from firefox driver");
    }

    @Override
    public void close() {
        System.out.println("Closing firefox driver");
    }

    @Override
    public void maximize() {
        System.out.println("Maximizing firefox driver");
    }
}
