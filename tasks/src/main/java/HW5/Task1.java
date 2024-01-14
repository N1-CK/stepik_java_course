package HW5;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
import java.util.ArrayList;
import java.util.HashMap;

class PhoneBook {

    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();
        addContact("Вася", "111-11-11", phoneBook);
        addContact("Петя", "222-22-22", phoneBook);
        addContact("Вася", "333-33-33", phoneBook);
        ArrayList<String> vasysPhones = getPhonesByName("Вася", phoneBook);
        System.out.println("Телефоны Васи: " + vasysPhones);
        printAllContacts(phoneBook);
    }

    public static void addContact(String name, String phoneNumber, HashMap<String, ArrayList<String>> phoneBook) {
        ArrayList<String> phones = phoneBook.get(name);
        if (phones == null) {
            phones = new ArrayList<>();
            phones.add(phoneNumber);
            phoneBook.put(name, phones);
        } else {
            phones.add(phoneNumber);
        }
    }

    public static ArrayList<String> getPhonesByName(String name, HashMap<String, ArrayList<String>> phoneBook) {
        ArrayList<String> phones = phoneBook.get(name);
        if (phones == null) {
            phones = new ArrayList<>();
        }
        return phones;
    }

    public static void printAllContacts(HashMap<String, ArrayList<String>> phoneBook) {
        for (String name : phoneBook.keySet()) {
            System.out.print(name + ": ");
            ArrayList<String> phones = phoneBook.get(name);
            for (String phoneNumber : phones) {
                System.out.print(phoneNumber + " ");
            }
            System.out.println();
        }
    }
}
