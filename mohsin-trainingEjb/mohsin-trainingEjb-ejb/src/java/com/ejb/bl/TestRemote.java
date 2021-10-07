package com.ejb.bl;
import com.ejb.dl.TestLocalLocal;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.ejb.Stateful;
@Stateful
@LocalBean
public class TestRemote implements TestRemoteRemote{

    @EJB
    private TestLocalLocal local;// encapsulated one class properties and method another class
    // test remote encapsulated kiya hai testlocallocat class ko aur class local varable generate kiya hai
    int i=0;
    @Override
    public void printMessage(String msg) {
        i++;
        System.out.println("stateless obj=> " +i+" "+local);
        local.print(msg);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
