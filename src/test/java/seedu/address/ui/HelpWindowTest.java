package seedu.address.ui;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HelpWindowTest {
    @Test
    public void constantsAreSetCorrectly() {
        String expectedUrl = "https://ay2425s1-cs2103t-w13-1.github.io/tp/UserGuide.html";
        assertEquals("https://ay2425s1-cs2103t-w13-1.github.io/tp/UserGuide.html",
                HelpWindow.USERGUIDE_URL);
        assertEquals("Refer to the user guide: https://ay2425s1-cs2103t-w13-1.github.io/tp/UserGuide.html",
                HelpWindow.HELP_MESSAGE);
    }
}
