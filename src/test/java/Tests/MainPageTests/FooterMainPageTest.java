package Tests.MainPageTests;

import Pages.MainPage;
import Tests.OnlyFooterTest;
import org.junit.Test;

public class FooterMainPageTest extends OnlyFooterTest {
    MainPage mainPage = new MainPage(URL);

    /**
     * Тест на видимость footer`а (при необхобходимости запустить отдельно)
     */
    @Test
    public void checkMainPageFooter(){
        checkFooter();
    }

    /**
     * Проверка наличия и правильности всех ссылок
     */
    @Test
    public void checkMainPageHrefs(){
        checkHrefs();
    }


    /**
     * Проверка количества ссылок в footer
     */
    @Test
    public void checkMainPageCountOfHrefs(){
        checkCountOfHref();
    }

    /**
     * Проверка наличия телефона в footer
     */
    @Test
    public void checkMainPageTel(){
        checkTel();
    }

    /**
     * Проверка наличия почты в footer
     */
    @Test
    public void checkMainPageMail(){
        checkMail();
    }

    /**
     * Проверка наличия awwwards в footer
     */
    @Test
    public void checkMainPageAwwwards(){
        checkAwwwards();
    }

    /**
     * Проверка наличия telegram в footer
     */
    @Test
    public void checkMainPageTg(){
        checkTg();
    }

    /**
     * Проверка наличия vimeo в footer
     */
    @Test
    public void checkMainPageVimeo(){
        checkVimeo();
    }

    /**
     * Проверка наличия behance в footer
     */
    @Test
    public void checkMainPageBehance(){
        checkBehance();
    }

    /**
     * Проверка наличия vk в footer
     */
    @Test
    public void checkMainPageVK(){
        checkVK();
    }
}