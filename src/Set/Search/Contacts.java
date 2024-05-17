package Set.Search;

import Set.Search.model.Contact;

import java.util.HashSet;
import java.util.Set;

public class Contacts {
    private Set<Contact> contacts;

    public Contacts() {
        this.contacts = new HashSet<>();
    }

    public void addContact(final String name, final int phone) {
        contacts.add(new Contact(name, phone));
    }

    public void showContacts() {
        System.out.println(contacts);
    }

    public Set<Contact> findByName(final String name) {
        Set<Contact> contactsByName = new HashSet<>();
        for (Contact c : contacts) {
            if (c.getName().startsWith(name)) {
                contactsByName.add(c);
            }
        }
        return contactsByName;
    }

    public Contact updateContactPhone(final String name, final int phone) {
        Contact updatedContact =  null;
        for (Contact c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                c.setPhone(phone);
                updatedContact = c;
                break;
            }
        }
        return updatedContact;
    }

    public static void main(String[] args) {
        final Contacts contacts = new Contacts();

        contacts.showContacts();

        contacts.addContact("John Doe", 123456);
        contacts.addContact("Jane Doe", 98765);
        contacts.addContact("Joao Zoe", 98767);
        contacts.addContact("Jaqueline Goe", 98768);
        contacts.addContact("Jaqueline Zoe", 98768);

        contacts.showContacts();

        System.out.println("Contacts with name \"Jaqueline\": " + contacts.findByName("Jaqueline"));

        System.out.println("New number of " + contacts.updateContactPhone("Jaqueline Goe", 789456));

        System.out.println("Contacts with name \"Jaqueline Goe\": " + contacts.findByName("Jaqueline Goe"));

        contacts.showContacts();
    }
}
