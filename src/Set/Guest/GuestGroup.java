package Set.Guest;

import Set.Guest.model.Guest;

import java.util.HashSet;
import java.util.Set;

public class GuestGroup {
    private Set<Guest> guestSet;

    public GuestGroup() {
        this.guestSet = new HashSet<>();
    }

    public void addGuest(final String name, final int inviteCode) {
        guestSet.add(new Guest(name, inviteCode));
    }

    public void removeGuestByInviteCode(final int inviteCode) {
        Guest guestToRemove = null;

        for (Guest guest : guestSet) {
            if (guest.getInviteCode() == inviteCode) {
                guestToRemove = guest;
                break;
            }
        }
        guestSet.remove(guestToRemove);
    }

    public int countGuests() {
        return guestSet.size();
    }

    public void showGuests(){
        System.out.println(guestSet);
    }

    public static void main(String[] args) {
        final GuestGroup group = new GuestGroup();

        group.addGuest("Daniel", 0234);
        group.addGuest("Daniel", 0234);
        group.addGuest("Danilo", 0232);
        group.addGuest("Danilo", 0232);
        group.addGuest("Denilson", 023245);

        System.out.println("There are " + group.countGuests() + " invited people to your party!");
        group.showGuests();

        group.removeGuestByInviteCode(0234);
        System.out.println("There are " + group.countGuests() + " invited people to your party!");

    }
}
