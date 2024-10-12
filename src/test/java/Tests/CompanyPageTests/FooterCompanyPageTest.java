package Tests.CompanyPageTests;

import Pages.MainPage;
import Tests.OnlyFooterTest;
import org.junit.Test;

public class FooterCompanyPageTest extends OnlyFooterTest {
    MainPage companyPage = new MainPage(URL).openCompanyPage();

    /**
     * Тест на видимость footer`а (при необхобходимости запустить отдельно)
     */
    @Test
    public void checkCompanyPageFooter(){
        checkFooter();
    }

    /**
     * Проверка наличия и правильности всех ссылок
     */
    @Test
    public void checkCompanyPageHrefs(){
        checkHrefs();
    }


    /**
     * Проверка количества ссылок в footer
     */
    @Test
    public void checkCompanyPageCountOfHrefs(){
        checkCountOfHref();
    }

    /**
     * Проверка наличия телефона в footer
     */
    @Test
    public void checkCompanyPageTel(){
        checkTel();
    }

    /**
     * Проверка наличия почты в footer
     */
    @Test
    public void checkCompanyPageMail(){
        checkMail();
    }

    /**
     * Проверка наличия awwwards в footer
     */
    @Test
    public void checkCompanyPageAwwwards(){
        checkAwwwards();
    }

    /**
     * Проверка наличия telegram в footer
     */
    @Test
    public void checkCompanyPageTg(){
        checkTg();
    }

    /**
     * Проверка наличия vimeo в footer
     */
    @Test
    public void checkCompanyPageVimeo(){
        checkVimeo();
    }

    /**
     * Проверка наличия behance в footer
     */
    @Test
    public void checkCompanyPageBehance(){
        checkBehance();
    }

    /**
     * Проверка наличия vk в footer
     */
    @Test
    public void checkCompanyPageVK(){
        checkVK();
    }
}
