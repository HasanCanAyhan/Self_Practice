package day18_garbageCollection.practiceTasks;

public class Contact { // Task 2

    public String name;
    public long phoneNumber;
    public String email;


    public void setInfo(String name, long phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void call(){
        System.out.println("calling " + name + " now");
    }

    public void sendMessage(){
        System.out.println("sending message to " + phoneNumber + " now" );
    }

    public void sendEmail(){
        System.out.println("sending email to " + email + " now");
    }

    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }
}
/*
2. Create a custom class named Contact
		Attributes:
			name
			phoneNumber
			email

		Action:
			setInfo(): sets all the fields
			call(): displays the message "Calling $name now"
			sendMessage(): displays the message "sending message to $phoneNumber now"
			sendEmail(): displays the message "sending email to $email now"


 */
