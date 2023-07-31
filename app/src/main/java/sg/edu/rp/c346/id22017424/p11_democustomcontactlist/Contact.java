package sg.edu.rp.c346.id22017424.p11_democustomcontactlist;

public class Contact {
    private String name;
    private int countryCode;

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", countryCode=" + countryCode +
                ", phoneNum=" + phoneNum +
                ", gender=" + gender +
                '}';
    }

    private int phoneNum;

    public void setName(String name) {
        this.name = name;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public char getGender() {
        return gender;
    }

    private char gender;

    public Contact(String name, int countryCode, int phoneNum, char gender) {
        this.name = name;
        this.countryCode = countryCode;
        this.phoneNum = phoneNum;
        this.gender = gender;
    }
}
