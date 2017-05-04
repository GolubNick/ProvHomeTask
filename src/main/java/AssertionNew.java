import com.codeborne.selenide.Screenshots;
import com.codeborne.selenide.testng.ScreenShooter;
import static com.codeborne.selenide.Selenide.screenshot;
import static org.testng.internal.EclipseInterface.*;

import org.apache.commons.io.FileUtils;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;

import java.io.File;

@Listeners({ScreenShooter.class})
public class AssertionNew extends Assert{
    public static  double stepNumber = 0.0;

    public void logBusiness(double stepNumber, String message){
        this.stepNumber = stepNumber;
        Reporter.log("<p><font color=\"000000\" style=\"background-color:#C0C0C0\">" + stepNumber + ") " + message + "</font></p>");
    }

    public static void assertTrue(boolean condition, String message) {
        stepNumber += 0.1;
        String step = String.valueOf(stepNumber).split("00")[0];
        String pathFile = takeScreenShot(message.replace(" ",""));
        if(condition) {
            Reporter.log("<p><font color=\"000000\" style=\"background-color:#C0C0C0\">"
                    +"<a href=\"" + pathFile + "\">" + step + ") " + message + "</a></font></p>");
            Reporter.log("<p><font color=\"FFFFFF\" style=\"background-color:#228B22\">"
                    +format(Boolean.valueOf(condition), Boolean.TRUE, message)+"</font></p>");

        }
        else {
            Reporter.log("<p><font color=\"000000\" style=\"background-color:#C0C0C0\">"
                    +"<a href=\"" + pathFile + "\">" + step + ") " + message + "</a></font></p>");
            Reporter.log("<p><font color=\"FFFFFF\" style=\"background-color:#FF0000\">"
                    + format(Boolean.valueOf(condition), Boolean.TRUE, message) + "</font></p>");
        }
    }

    static String format(Object actual, Object expected, String message) {
        String formatted = "";
        if (null != message) {
//            formatted = message + "<br> ";
        }

        return formatted + ASSERT_LEFT + expected + CLOSING_CHARACTER + " actual " + OPENING_CHARACTER + actual + ASSERT_RIGHT;
    }

    private static String takeScreenShot(String nameFile){

        String pathFile = "D:\\workspace\\provectus\\test-output\\html\\" + nameFile + System.currentTimeMillis() / 1000L + ".png";
        try {
            File scrFile = Screenshots.takeScreenShotAsFile();
            FileUtils.copyFile(scrFile, new File(pathFile));
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return pathFile;
    }
}
