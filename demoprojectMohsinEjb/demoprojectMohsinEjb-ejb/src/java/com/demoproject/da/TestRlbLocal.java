
package com.demoproject.da;
import java.util.Date;
import javax.ejb.Local;
@Local
public interface TestRlbLocal {
    public void saveData(int id,int vid,String redisld,String action,String mod_type,int status,Date dtCreate,int cid,int segid);
    public void retriveData();
}
