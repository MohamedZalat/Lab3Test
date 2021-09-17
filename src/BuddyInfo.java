public class BuddyInfo {
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    private String name;

    public BuddyInfo() {
        this("Moe", "123");
    }

    public BuddyInfo(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public boolean equals(Object o) {
        if (!(o instanceof BuddyInfo)) {
            return false;
        }

        BuddyInfo buddyInfo = (BuddyInfo) o;

        return buddyInfo.name.equals(this.name) && buddyInfo.phoneNumber.equals(this.phoneNumber);
    }

    private String phoneNumber;

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Moe", "321");
        System.out.println("Hello " + buddy.getName());
    }
}
