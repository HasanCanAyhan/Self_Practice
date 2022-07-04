package day31_inheritance.practiceTasks.browserTask;

public class FireFox extends Browser{

    @Override
    public void openBrowser() {
        System.out.println("opening firefox browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing chrome browser");
    }
}
