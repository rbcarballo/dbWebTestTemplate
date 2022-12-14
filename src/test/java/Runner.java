import org.junit.Test;

public class Runner {

    @Test
    public void runTest() throws InterruptedException {
        String mainUrl = "https://dbonline.deutsche-bank.es/portalserver/olbesportal/login";
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver107.exe");

    }
}
