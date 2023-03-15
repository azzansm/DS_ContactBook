package ContactBook;
import java.util.*;
public class ContactDetails {
    LinkedList<Contacts>list;
    public ContactDetails(){
        list = new LinkedList<>();
    }
    public void addContact(Contacts contacts){
        list.add(contacts);
    }
    public int findContact(String name){
        for(int i=0;i<list.size();i++){
            Contacts contacts = list.get(i);
            if(contacts.getName().equalsIgnoreCase(name)){
                return i;
            }
        }
        return -1;
    }
    public int findContact2(String email){
        for(int i=0;i<list.size();i++){
            Contacts contacts = list.get(i);
            if(contacts.getEmail().equalsIgnoreCase(email)){
                return i;
            }
        }
        return -1;
    }
    public void delContact(String name){
        int pos = findContact(name);
        if(pos<0){
            System.out.println("Contact not found");
        }
        list.remove(pos);
        System.out.println("Contact deleted");
    }
    public void display(){
        if(list.isEmpty()){
            System.out.println("The list has no records\n");
        }
        for(Contacts c:list){
            System.out.println(c.toString());
        }
    }
}