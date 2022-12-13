package resorces.testdata;

import org.testng.annotations.DataProvider;

/**
 * Created by Jay Vaghani
 */
public class TestData {

    @DataProvider(name = "credentials")
    public Object[][] getData(){
        Object[][] data = new Object[][]{
                {"test1gmail.com", "test123"},
                {"test2gmail.com", "test456"},
                {"test3gmail.com", "test789"},
        };
        return data;
    }
}
