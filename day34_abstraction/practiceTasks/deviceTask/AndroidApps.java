package day34_abstraction.practiceTasks.deviceTask;

public interface AndroidApps extends Downloadable{

    String appStoreName = "Play Store"; //  public static final , we can call through Class Name
    String OS = "Android";

}
/*
5. Create a child interface of Downloadable named AndroidApps:
			Variables:
				AppStoreName, OS
 */