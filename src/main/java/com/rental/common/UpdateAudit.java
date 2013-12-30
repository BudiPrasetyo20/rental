package com.rental.common;

import java.util.Date;

public interface UpdateAudit {
	
	public String getLastUpdateBy();
    public void setLastUpdateBy(String lastUpdateBy);
    public Date getLastUpdateDate();
    public void setLastUpdateDate(Date lastUpdateDate);

}
