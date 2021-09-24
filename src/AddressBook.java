import java.util.ArrayList;

public class AddressBook {
    public ArrayList<BuddyInfo> buddyInfos;

    public AddressBook() {
        buddyInfos = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddyInfo) {
        buddyInfos.add(buddyInfo);
    }

    public void removeBuddy(BuddyInfo buddyInfo) {
        buddyInfos.remove(buddyInfo);
    }

    public int getSize() {
        return buddyInfos.size();
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Moe", "123");
        AddressBook addressBook = new AddressBook();

        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
        System.out.println("random");
    }
}
