import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
public class  AddServerImpl extends UnicastRemoteObject implements AddServerIntf
{

public  AddServerImpl()throws  RemoteException{}
 public int add (int d1,int d2)


{
    return (d1+d2);
} 

}
