package Day42_Inheritance.WebDriverTask;

public class RemoteDriver {

    public String name, version;

    public RemoteDriver(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public void get(String URL){
        System.out.println("opening the default driver");
    }

    public void close(){
        System.out.println("closing the remote driver");
    }

    public void maximize(){
        System.out.println("Maximizing the remote driver");
    }

    @Override
    public String toString() {
        return "RemoteDriver{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
