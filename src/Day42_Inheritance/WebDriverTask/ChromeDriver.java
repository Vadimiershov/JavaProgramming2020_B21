package Day42_Inheritance.WebDriverTask;

public class ChromeDriver extends RemoteDriver{

    public ChromeDriver() {
        super("Chrome Browser","V84.0.1");
    }

    @Override
    public void get(String URL) {
        System.out.println("opening "+URL+" chrome driver");
    }

    @Override
    public void close() {
        System.out.println("closing the chrome driver");
    }

    @Override
    public void maximize() {
        System.out.println("maximizing the chrome driver");
    }
}
