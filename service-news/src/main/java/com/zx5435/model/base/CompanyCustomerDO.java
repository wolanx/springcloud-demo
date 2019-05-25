package com.zx5435.model.base;

public class CompanyCustomerDO {

    private int id;
    private String pinyin;
    private String cname;
    private String sname;
    private int type;
    private String address;
    private String phone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "CompanyCustomerDO{" +
                "id=" + id +
                ", pinyin='" + pinyin + '\'' +
                ", cname='" + cname + '\'' +
                ", sname='" + sname + '\'' +
                ", type=" + type +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
