package Customerm;
import java.util.*;
public class Menu {
	public static void main(String[] args) {
    	//adding values to ArrayList
        List<Customer> CustomerList=new ArrayList<>();
        CustomerList.add(new Customer(1,"Shefali",20000,17));
        CustomerList.add(new Customer(2,"Bunny",40000,35));
        CustomerList.add(new Customer(3,"Mayank",60000,20));
        CustomerList.add(new Customer(4,"Dimple",40000,24));
        CustomerList.add(new Customer(5,"Rama",70000,29));
        CustomerList.add(new Customer(6,"Rajesh",180000,26));
        CustomerList.add(new Customer(7,"Giresh",30000,22));
        CustomerList.add(new Customer(8,"Heena",20000,28));
        CustomerList.add(new Customer(9,"Ishita",50000,21));
        CustomerList.add(new Customer(10,"Shilpa",120000,30));
        
        CustomerList CustomerList1 = new CustomerList(CustomerList);
        System.out.println("Enter key");
        Scanner s=new Scanner(System.in);
        int key=s.nextInt();
         //switch case
        switch (key){
            case 1: //Press 1 will display all the record
                
                CustomerList1.sort();
                CustomerList1.display();
                break;
            case 2: //Press 2 will update the Customer if Id is present in record else it will pass the message inavlid id
                System.out.println("Enter Customer id");
                int id = s.nextInt();
                System.out.println("Enter Customer updated purchaseAmount");
                int purchaseAmount = s.nextInt();
                if(CustomerList1.update(id,purchaseAmount)){
                    CustomerList1.display();
                }
                else{
                    System.out.println("Invalid id provided");
                    
                }
                break;
            case 3:
                break;
        }
    }
}


