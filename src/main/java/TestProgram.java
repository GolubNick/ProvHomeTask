import org.testng.annotations.Test;

public class TestProgram extends UpTests{

    private final String TEXT = "Assert that this text is on the page";

    @Test
    public void doTest(){
        assertTrue(getModel().getMainPage().isVisible(),"The main page is visible");
        assertTrue(getModel().getMainPage().isChapter1Visible(),"The chapter1 link is visible");
        getModel().getMainPage().clickChapter1();

        assertTrue(getModel().getChapter1Page().isVisible(),"The page with text is visible");
        assertTrue(getModel().getChapter1Page().isAssertTextVisible(),"The assert text is visible");
        assertEquals(getModel().getChapter1Page().getAssertText(), TEXT, TEXT + " text is correct");
        assertTrue(getModel().getChapter1Page().isHomePageVisible(), "The home page link is visible");
        getModel().getChapter1Page().clickHomePage();

        assertTrue(getModel().getMainPage().isVisible(),"You were returned to main page successfully");
    }
}
