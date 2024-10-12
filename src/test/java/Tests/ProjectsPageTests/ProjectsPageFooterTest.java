package Tests.ProjectsPageTests;

import Pages.MainPage;
import Tests.OnlyFooterTest;
import org.junit.Test;


public class ProjectsPageFooterTest extends OnlyFooterTest {
    MainPage projectsPage = new MainPage(URL).openProjectsPage();

    /**
     * Тест на видимость footer`а (при необхобходимости запустить отдельно)
     */
    @Test
    public void checkProjectsPageFooter(){
        checkFooter();
    }

    /**
     * Проверка наличия и правильности всех ссылок
     */
    @Test
    public void checkProjectsPageHrefs(){
        checkHrefs();
    }


    /**
     * Проверка количества ссылок в footer(отдельно, если предыдущий тест не прошел)
     */
    @Test
    public void checkProjectsPageCountOfHrefs(){
        checkCountOfHref();
    }

    /**
     * Проверка наличия телефона в footer(отдельно, если предыдущий тест не прошел)
     */
    @Test
    public void checkProjectsPageTel(){
        checkTel();
    }

    /**
     * Проверка наличия почты в footer(отдельно, если предыдущий тест не прошел)
     */
    @Test
    public void checkProjectsPageMail(){
        checkMail();
    }

    /**
     * Проверка наличия awwwards в footer(отдельно, если предыдущий тест не прошел)
     */
    @Test
    public void checkProjectsPageAwwwards(){
        checkAwwwards();
    }

    /**
     * Проверка наличия telegram в footer(отдельно, если предыдущий тест не прошел)
     */
    @Test
    public void checkProjectsPageTg(){
        checkTg();
    }

    /**
     * Проверка наличия vimeo в footer(отдельно, если предыдущий тест не прошел)
     */
    @Test
    public void checkProjectsPageVimeo(){
        checkVimeo();
    }

    /**
     * Проверка наличия behance в footer(отдельно, если предыдущий тест не прошел)
     */
    @Test
    public void checkProjectsPageBehance(){
        checkBehance();
    }

    /**
     * Проверка наличия vk в footer(отдельно, если предыдущий тест не прошел)
     */
    @Test
    public void checkProjectsPageVK(){
        checkVK();
    }
}
