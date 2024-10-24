package seedu.address.ui;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;

import javafx.stage.Stage;

@ExtendWith(ApplicationExtension.class)
public class HelpWindowTest {

    private HelpWindow helpWindow;

    @Start
    public void start(Stage primaryStage) {
        helpWindow = new HelpWindow(primaryStage);
    }

    @Test
    public void checkUserGuideUrl() {
        assertEquals("https://ay2425s1-cs2103t-w13-1.github.io/tp/UserGuide.html", HelpWindow.USERGUIDE_URL);
    }

    @Test
    public void checkOpenUrlInBrowser() {
        assertDoesNotThrow(() -> {
            helpWindow.showHelp();
        });
    }
}
