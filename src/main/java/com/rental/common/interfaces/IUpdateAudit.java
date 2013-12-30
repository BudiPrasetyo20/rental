package com.rental.common.interfaces;

import java.util.Date;

public interface IUpdateAudit {
	
	public String getLastUpdateBy();
    public void setLastUpdateBy(String lastUpdateBy);
    public Date getLastUpdateDate();
    public void setLastUpdateDate(Date lastUpdateDate);

}
