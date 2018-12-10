package cn.itcast.pojo;

public class Department {
    private Integer dpId;

    private String deName;

    public Integer getDpId() {
        return dpId;
    }

    public void setDpId(Integer dpId) {
        this.dpId = dpId;
    }

    public String getDeName() {
        return deName;
    }

    public void setDeName(String deName) {
        this.deName = deName == null ? null : deName.trim();
    }
}