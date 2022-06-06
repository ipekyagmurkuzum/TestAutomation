package javascript;

import base.BaseTests;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class JavascriptTests extends BaseTests {

    @Test
    public void testScrollToTable(){
        homePage.clickLargeAndDeepDom().scrollToTable();
    }

    @Test
    public void testInfiniteScroll() {
        homePage.clickInfiniteScroll().scrollToParagraph(5);
    }

    @Test
    public void testChangedDropdownMenu(){
        var dropdown = homePage.clickDropDown();
        dropdown.changeDropdownMenu();

        var optionsToSelect = List.of("Option 1", "Option 2");
        optionsToSelect.forEach(dropdown::selectFromDropdown);

        var selectedOptions = dropdown.getSelectedOptions();
        assertTrue(selectedOptions.containsAll(optionsToSelect));
        assertEquals(selectedOptions.size(), optionsToSelect.size());
    }
}
