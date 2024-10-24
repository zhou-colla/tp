package seedu.address.ui;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.testfx.framework.junit5.ApplicationTest;

import javafx.stage.Stage;


public class HelpWindowTest extends ApplicationTest {

    private HelpWindow helpWindow;
    @Override
    public void start(Stage primaryStage) throws Exception {
        helpWindow = new HelpWindow();
        helpWindow.show();
    }

    @Test
    public void checkUserGuideUrl() {
        assertEquals("https://ay2425s1-cs2103t-w13-1.github.io/tp/UserGuide.html", HelpWindow.USERGUIDE_URL);
    }

    @Test
    public void checkOpenUrlInBrowser() {
        assertDoesNotThrow(() -> {
            helpWindow.isShowing();
        });
    }
}
