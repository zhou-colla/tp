package seedu.address.ui;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HelpWindowTest {

    private HelpWindow helpWindow;

    @BeforeEach
    public void setUp() {
        helpWindow = new HelpWindow();
    }

    @Test
    public void createHelpWindowWithNoException() {
        assertDoesNotThrow(()-> {
            new HelpWindow();
        });
    }

    @Test
    public void openHelpWindowUrlWithNoException() {
        assertDoesNotThrow(()-> {
            helpWindow.showHelp();
        });
    }
}
