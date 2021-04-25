package day13_SwitchStatement;

public class Browsers {

    public static void main(String[] args) {

        String browserName = "ie";

        boolean valid = browserName == "chrome" || browserName =="safari" || browserName =="opera"
                || browserName == "firefox" || browserName == "edge" || browserName == "ie";

        String selectedBrowser = "";

        if(valid){
            if(browserName== "chrome") {
                selectedBrowser = "Chrome browser is selected";
            }else if (browserName =="safari"){
                selectedBrowser = "Safari browser is selected";
            }else if (browserName == "opera"){
                selectedBrowser = "Opera browser is selected";
            }else if (browserName == "firefox"){
                selectedBrowser = "Firefox browser is selected";
            }else if (browserName=="edge"){
                selectedBrowser = "Edge browser is selected";
            }else{
                selectedBrowser = "IE browser selected";
            }
        }else{
            System.out.println("No such a browser");
        }
        System.out.println(selectedBrowser);


    }


}
