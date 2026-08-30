package billing;
import java.util.Scanner;
import controller.CustomerController;
import services.CustomerService;
public class Billing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CustomerService cc = new CustomerController();
		while(true) {
			System.out.println("1.create Customer \n2.Display Customer \n3.Update Name  \n4.delete");
			int n=sc.nextInt();
			switch(n) {
			case 1:{
				cc.createCustomer();
				break;
			}
			
			case 2:{
				cc.displayCustomer();
				break;
		}
			
			case 3:{
				cc.changeName();
				break;
				}
			
			case 4:{
				cc.deleteCustomer();
				break;
			}
		
		
	}

		}
	}
}


