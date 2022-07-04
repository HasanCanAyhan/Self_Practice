package day31_inheritance.practiceTasks.browserTask;

public class TestBrowserObjects {

    public static void main(String[] args) {

        ChromeBrowser chromeBrowser = new ChromeBrowser();
        chromeBrowser.openBrowser();
        chromeBrowser.closeBrowser();

        Opera opera = new Opera();
        opera.openBrowser();
        opera.closeBrowser();

    }

}
