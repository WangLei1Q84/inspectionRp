package com.wanglei.model;

/**
 * Created by wangl on 2018/4/27.
 */
public class User {
    private String name;
    private  String realName;
    private String company;
    private  String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (getName() != null ? !getName().equals(user.getName()) : user.getName() != null) return false;
        if (getRealName() != null ? !getRealName().equals(user.getRealName()) : user.getRealName() != null)
            return false;
        if (getCompany() != null ? !getCompany().equals(user.getCompany()) : user.getCompany() != null) return false;
        return getPhone() != null ? getPhone().equals(user.getPhone()) : user.getPhone() == null;

    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getRealName() != null ? getRealName().hashCode() : 0);
        result = 31 * result + (getCompany() != null ? getCompany().hashCode() : 0);
        result = 31 * result + (getPhone() != null ? getPhone().hashCode() : 0);
        return result;
    }
}
