package day49_Abstraction.RemoteDriverClass;

public class ChromeDriver extends RemoteDriver{
    @Override
    public void executeScript(String script) {
        System.out.println("Script "+script+" is executing");
    }

    @Override
    public void TakeScreeshot(String name) {
        System.out.println("Taking screenshot on chrome");
    }

    @Override
    public void get(String URL) {
        System.out.println("Navigating to "+URL+" on Chrome");
    }

    @Override
    public void close() {
        System.out.println("Closing Chrome driver");
    }

    @Override
    public void quit() {
        System.out.println("Quiting chrome");
    }
}
