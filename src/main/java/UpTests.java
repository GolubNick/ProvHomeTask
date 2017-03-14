import managers.GetModel;
import managers.WebManager;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;

public class UpTests extends Assert {

    private final String URL = "http://book.theautomatedtester.co.uk";

    public GetModel getModel(){
        return GetModel.get();
    }

    @BeforeMethod
    protected void initDriver(){
        WebManager.get();
        open(URL);
    }

    @AfterMethod
    protected void closeDriver(){
    }
}
