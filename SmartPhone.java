package week1.Assignments;

public class SmartPhone extends AndroidPhone {

	public void ConnectWatsapp() {
		System.out.println("Connect Watsapp");

	}

	public static void main(String[] args) {

		SmartPhone obj = new SmartPhone();
		obj.ConnectWatsapp();
		obj.takeVideo();
		obj.savecontact();
		obj.makecall();
		obj.sendmsg();

	}

}
