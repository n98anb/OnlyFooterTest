package Pages;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    public MainPage(String url){
        sleep(4000);
        open(url);
    }
    public MainPage() {
    }

    private final static SelenideElement footer = $x("//footer//div[@class = 'sc-222969c7-4 bManhn']");
    private final static SelenideElement projects = $x("//a[@href = '/projects' and @class = 'headerAnchor']");
    private final static SelenideElement company = $x("//a[@href = '/company' and @class = 'headerAnchor']");
    private final static SelenideElement contacts = $x("//a[@href = '/contacts' and @class = 'headerAnchor']");
    private final static SelenideElement job = $x("//a[@href = '/job' and @class = 'headerAnchor']");
    private final static ElementsCollection footerLinks = $$x("//footer//a");

    public static SelenideElement returnFooter(){
        return footer;
    }

    public static List<String> getLinks(){
        List<String> links = new ArrayList<>();
        footerLinks.forEach(x->links.add(x.getAttribute("href")));
        return links;
    }

    public ProjectsPage openProjectsPage(){
        sleep(1000);
        projects.click();
        return new ProjectsPage();
    }

    public ContactsPage openContactsPage(){
        sleep(2000);
        contacts.click();
        sleep(1000);
        return new ContactsPage();
    }

    public CompanyPage openCompanyPage(){
        sleep(1000);
        company.click();
        return new CompanyPage();
    }

    public JobPage openJobPage(){
        sleep(1000);
        job.click();
        return new JobPage();
    }
}
