package Tests.JobPageTests;

import Pages.MainPage;
import Tests.OnlyFooterTest;
import org.junit.Test;

public class FooterJobPageTest extends OnlyFooterTest {
    MainPage jobPage = new MainPage(URL).openJobPage();

    /**
     * Тест на видимость footer`а (при необхобходимости запустить отдельно)
     */
    @Test
    public void checkJobPageFooter(){
        checkFooter();
    }

    /**
     * Проверка наличия и правильности всех ссылок
     */
    @Test
    public void checkJobPageHrefs(){
        checkHrefs();
    }


    /**
     * Проверка количества ссылок в footer
     */
    @Test
    public void checkJobPageCountOfHrefs(){
        checkCountOfHref();
    }

    /**
     * Проверка наличия телефона в footer
     */
    @Test
    public void checkJobPageTel(){
        checkTel();
    }

    /**
     * Проверка наличия почты в footer
     */
    @Test
    public void checkJobPageMail(){
        checkMail();
    }

    /**
     * Проверка наличия awwwards в footer
     */
    @Test
    public void checkJobPageAwwwards(){
        checkAwwwards();
    }

    /**
     * Проверка наличия telegram в footer
     */
    @Test
    public void checkJobPageTg(){
        checkTg();
    }

    /**
     * Проверка наличия vimeo в footer
     */
    @Test
    public void checkJobPageVimeo(){
        checkVimeo();
    }

    /**
     * Проверка наличия behance в footer
     */
    @Test
    public void checkJobPageBehance(){
        checkBehance();
    }

    /**
     * Проверка наличия vk в footer
     */
    @Test
    public void checkJobPageVK(){
        checkVK();
    }
}
