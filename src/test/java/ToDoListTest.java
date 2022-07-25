import com.company.base.BaseTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ToDoListTest extends BaseTest {

    @BeforeMethod
    static void setupClass() {
        initialization();
        toDoListPage.toDoListClick();
    }

    @Test(priority = 1)
    public void checkElementOnPage (){
        switchWindow();
        sleep(2);
        toDoListPage.checkAllElements();
    }

    @Test(priority = 2)
    public void addingAndDeletingElements (){
        switchWindow();
        toDoListPage.addingNewElements();
        toDoListPage.deletingNewElements();
    }

    @Test (priority = 3)
    public void deletingDefaultElements(){
        switchWindow();
        toDoListPage.deleteGoToPotion();
        sleep(2);
        toDoListPage.deleteBuyNewRobes();
        sleep(2);
        toDoListPage.deletePracticeMagic();
        sleep(2);
    }

    @AfterMethod
    static void setDownClass() {
        driver.quit();
    }
    //comment for commit user check
}
