package day31_inheritance.practiceTasks.browserTask;

public class Opera extends Browser{

    @Override
    public void openBrowser() {
        System.out.println("opening opera browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing opera browser");
    }

}
