package AddressBooks;

import java.util.ArrayList;

public class ContactList {
    ArrayList<Contact> list = new ArrayList<>();

    public void AddNewPhoneNumber(Contact contact){
        list.add(contact);
    }

    public boolean SearchContact(String name){
        for (int i = 0; i < list.size() ; i++){
            Contact contact = list.get(i);
            if(contact.getName().equals(name)){
                System.out.println(" Name : " + contact.getName()+ " Company : "+ contact.getCompany()
                        +" Email : "+ contact.getEmail()+" PhoneNumber : "+ contact.getPhoneNumber());
                return true;
            }
        }
        System.out.println("Contact Not Found");
        return false;
    }
    public void Display(){
        for(Contact c : list){
            System.out.println(c.toString());
        }
    }
}
