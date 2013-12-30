package com.rental.common;

import java.util.Date;

public interface CreateAudit {
    public boolean isNew();
    public String getCreateBy();
    public void setCreateBy(String createBy);
    public Date getCreateDate();
    public void setCreateDate(Date createDate);
}
