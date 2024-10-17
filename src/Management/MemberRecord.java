package Management;

import java.util.Objects;

public class MemberRecord {
    private int member_id;
    private String type;
    private String  dateOfMembership;
    private int maxBookLimit;
    private String name;
    private String address;
    private String phoneNo;

    public MemberRecord(int member_id, String type, String dateOfMembership, int maxBookLimit, String name, String address, String phoneNo) {
        this.member_id = member_id;
        this.type = type;
        this.dateOfMembership = dateOfMembership;
        this.maxBookLimit = maxBookLimit;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    public int getMember_id() {
        return member_id;
    }

    public String getType() {
        return type;
    }

    public String getDateOfMembership() {
        return dateOfMembership;
    }

    public int getMaxBookLimit() {
        return maxBookLimit;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setMember_id(int member_id) {
        this.member_id = member_id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDateOfMembership(String dateOfMembership) {
        this.dateOfMembership = dateOfMembership;
    }

    public void setMaxBookLimit(int maxBookLimit) {
        this.maxBookLimit = maxBookLimit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        MemberRecord that = (MemberRecord) object;
        return member_id == that.member_id && maxBookLimit == that.maxBookLimit && Objects.equals(type, that.type) && Objects.equals(dateOfMembership, that.dateOfMembership) && Objects.equals(name, that.name) && Objects.equals(address, that.address) && Objects.equals(phoneNo, that.phoneNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(member_id, type, dateOfMembership, maxBookLimit, name, address, phoneNo);
    }

    @Override
    public String toString() {
        return "MemberRecord{" +
                "member_id=" + member_id +
                ", type='" + type + '\'' +
                ", dateOfMembership='" + dateOfMembership + '\'' +
                ", maxBookLimit=" + maxBookLimit +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                '}';
    }
}
