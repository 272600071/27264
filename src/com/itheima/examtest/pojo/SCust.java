package com.itheima.examtest.pojo;

public class SCust {
    private Integer cid;

    private String custName;

    private String custType;

    private String custPhone;

    private String custAddress;

    private Integer custLinkUser;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    public String getCustType() {
        return custType;
    }

    public void setCustType(String custType) {
        this.custType = custType == null ? null : custType.trim();
    }

    public String getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone == null ? null : custPhone.trim();
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress == null ? null : custAddress.trim();
    }

    public Integer getCustLinkUser() {
        return custLinkUser;
    }

    public void setCustLinkUser(Integer custLinkUser) {
        this.custLinkUser = custLinkUser;
    }

	@Override
	public String toString() {
		return "SCust [cid=" + cid + ", custName=" + custName + ", custType="
				+ custType + ", custPhone=" + custPhone + ", custAddress="
				+ custAddress + ", custLinkUser=" + custLinkUser + "]";
	}
    
}