package com.rental.common.interfaces;

import java.util.Date;

public interface ICreateAudit {
    public boolean isNew();
    public String getCreateBy();
    public void setCreateBy(String createBy);
    public Date getCreateDate();
    public void setCreateDate(Date createDate);
}
