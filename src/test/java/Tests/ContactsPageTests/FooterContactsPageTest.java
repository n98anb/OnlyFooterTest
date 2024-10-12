package Tests.ContactsPageTests;

import Pages.MainPage;
import Tests.OnlyFooterTest;
import org.junit.Test;

public class FooterContactsPageTest extends OnlyFooterTest {
    MainPage contactsPage = new MainPage(URL).openContactsPage();

    /**
     * Тест на видимость footer`а (при необхобходимости запустить отдельно)
     */
    @Test
    public void checkContactsPageFooter(){
        checkFooter();
    }

    /**
     * Проверка наличия и правильности всех ссылок
     */
    @Test
    public void checkContactsPageHrefs(){
        checkHrefs();
    }


    /**
     * Проверка количества ссылок в footer
     */
    @Test
    public void checkContactsPageCountOfHrefs(){
        checkCountOfHref();
    }

    /**
     * Проверка наличия телефона в footer
     */
    @Test
    public void checkContactsPageTel(){
        checkTel();
    }

    /**
     * Проверка наличия почты в footer
     */
    @Test
    public void checkContactsPageMail(){
        checkMail();
    }

    /**
     * Проверка наличия awwwards в footer
     */
    @Test
    public void checkContactsPageAwwwards(){
        checkAwwwards();
    }

    /**
     * Проверка наличия telegram в footer
     */
    @Test
    public void checkContactsPageTg(){
        checkTg();
    }

    /**
     * Проверка наличия vimeo в footer
     */
    @Test
    public void checkContactsPageVimeo(){
        checkVimeo();
    }

    /**
     * Проверка наличия behance в footer
     */
    @Test
    public void checkContactsPageBehance(){
        checkBehance();
    }

    /**
     * Проверка наличия vk в footer
     */
    @Test
    public void checkContactsPageVK(){
        checkVK();
    }
}
