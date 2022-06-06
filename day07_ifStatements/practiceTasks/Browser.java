package day07_ifStatements.practiceTasks;

public class Browser {

    public static void main(String[] args) {

        String browser = "firefox"; // Assume that the valid browsers are: chrome, firefox, opera, safari, edge.

        String result1 = "";
        String result = "";


        if(browser.equals("chrome") || browser.equals("firefox") || browser.equals("opera") ||
                browser.equals("safari") || browser.equals("edge")){

            if (browser.equals("chrome")){
                result1 = "chrome";

            } else if (browser.equals("firefox")) {
                result1 = "firefox";

            } else if (browser.equals("opera")) {
                result1 = "opera";
            } else if (browser.equals("safari")){
                result1 = "safari";
            }else{
                result1 = "edge";
            }

            result = result1 + " Browser is selected";
            System.out.println(result);

        }else{
            result = "Invalid Size";
            System.out.println(result);
        }



    }
}
/*

2. Create a class called Browser. Write a program that can display the name of selected browser
        1. declare a String variable named browserName
        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge.
        3. if the browser name does not match with the valid browser names, out put should be: Invalid Browser Name

        Ex:
            String browser = "chrome";

        Output:
            Chrome Browser is selected

        Note: MUST use nested if
 */