package Tests;


import static Pages.MainPage.getLinks;
import static Pages.MainPage.returnFooter;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;


/**
 * Класс, в котором заданы методы для тестирования footer`ов на страницах сайтов
 */
public class OnlyFooterTest extends BaseTest{

    public final static String URL = "https://only.digital/";

    /**
     * Тест на видимость footer`а (при необхобходимости запустить отдельно)
     */
    public void checkFooter(){
        assertEquals(true, returnFooter().scrollIntoView(true).exists());
    }

    /**
     * Проверка наличия и правильности всех ссылок
     */
    public static void checkHrefs(){
        assertAll("Проверка наличия всех ссылок",
                () -> assertEquals(7, getLinks().size()),
                () -> assertTrue(getLinks().contains("mailto:hello@only.com.ru")),
                () -> assertTrue(getLinks().contains("https://www.awwwards.com/Ilyaredko/")),
                () -> assertTrue(getLinks().contains("https://t.me/onlycreativedigitalagency")),
                () -> assertTrue(getLinks().contains("https://vimeo.com/onlydigital")),
                () -> assertTrue(getLinks().contains("https://www.behance.net/onlydigitalagency")),
                () -> assertTrue(getLinks().contains("https://vk.com/onlydigitalagency")),
                () -> assertTrue(getLinks().contains("tel:+74957409979"))
        );
    }

    /**
     * Проверка количества ссылок в footer(отдельно, если предыдущий тест не прошел)
     */
    public void checkCountOfHref(){
        assertEquals(7, getLinks().size());
    }

    /**
     * Проверка наличия телефона в footer(отдельно, если предыдущий тест не прошел)
     */
    public void checkTel(){
        assertTrue(getLinks().contains("tel:+74957409979"));
    }

    /**
     * Проверка наличия почты в footer(отдельно, если предыдущий тест не прошел)
     */
    public void checkMail(){
        assertTrue(getLinks().contains("mailto:hello@only.com.ru"));
    }

    /**
     * Проверка наличия awwwards в footer(отдельно, если предыдущий тест не прошел)
     */
    public void checkAwwwards(){
        assertTrue(getLinks().contains("https://www.awwwards.com/Ilyaredko/"));
    }

    /**
     * Проверка наличия telegram в footer(отдельно, если предыдущий тест не прошел)
     */
    public void checkTg(){
        assertTrue(getLinks().contains("https://t.me/onlycreativedigitalagency"));
    }

    /**
     * Проверка наличия vimeo в footer(отдельно, если предыдущий тест не прошел)
     */
    public void checkVimeo(){
        assertTrue(getLinks().contains("https://vimeo.com/onlydigital"));
    }

    /**
     * Проверка наличия behance в footer(отдельно, если предыдущий тест не прошел)
     */
    public void checkBehance(){
        assertTrue(getLinks().contains("https://www.behance.net/onlydigitalagency"));
    }

    /**
     * Проверка наличия vk в footer(отдельно, если предыдущий тест не прошел)
     */
    public void checkVK(){
        assertTrue(getLinks().contains("https://vk.com/onlydigitalagency"));
    }
}
