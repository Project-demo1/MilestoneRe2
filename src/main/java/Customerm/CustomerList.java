package Customerm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Customerm.Customer;
public class CustomerList {
	private List<Customer> CustomerList;                //Customer class

    public CustomerList(List<Customer> CustomerList) {
        this.CustomerList = CustomerList;
    }
        public void display(){
            int i=1;
            for(Customer Customer:this.CustomerList){
                System.out.println("Customer"+i+" ::: id: "+Customer.getId()+" name: "+Customer.getName()+" purchaseAmount: "+Customer.getpurchaseAmount()+" age: "+Customer.getAge());
                i++;
            }
        }
        //comparator
        public void sort(){
            Collections.sort(this.CustomerList,new Comparator<Customer>() { 
                @Override
                public int compare(Customer Customer1, Customer Customer2) {
                    return Customer1.getName().compareTo(Customer2.getName());
                }
            });
        }
       // to update the field using Id
        public boolean update(int id, int purchaseAmount) {
            boolean flag=false;
            for(Customer Customer:this.CustomerList){
                if(Customer.getId()==id){
                    flag=true;
                    Customer.setpurchaseAmount(purchaseAmount);
                }
            }
            return flag;
        
    
    }

}



