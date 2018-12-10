package cn.itcast.pojo;

public class Employee {
    private Integer epId;

    private String epName;

    private String gender;

    private String epEmail;

    private Integer dId;

    public Integer getEpId() {
        return epId;
    }

    public void setEpId(Integer epId) {
        this.epId = epId;
    }

    public String getEpName() {
        return epName;
    }

    public void setEpName(String epName) {
        this.epName = epName == null ? null : epName.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getEpEmail() {
        return epEmail;
    }

    public void setEpEmail(String epEmail) {
        this.epEmail = epEmail == null ? null : epEmail.trim();
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }
}