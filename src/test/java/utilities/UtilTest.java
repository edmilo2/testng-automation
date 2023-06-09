package utilities;

    public class UtilTest {

        public static void main(String[] args) {
            Driver.getDriver().get("http://google.com");
            System.out.println(Driver.getDriver().getTitle());
            ApplicationFlow.pause(500);
            ApplicationFlow.scroll(500);
            ApplicationFlow.pause(500);
            ApplicationFlow.scroll(500);
            ApplicationFlow.pause(500);
            ApplicationFlow.scroll(500);
            Driver.getDriver().quit();
            Driver.getDriver().get("http://google.com");



        }
    }


