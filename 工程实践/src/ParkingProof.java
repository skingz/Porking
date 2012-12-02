/**
 * Created with IntelliJ IDEA.
 * User: 51ibm
 * Date: 12-11-11
 * Time: 下午3:29
 * To change this template use File | Settings | File Templates.
 */
public class ParkingProof {
    public  String proofNum;
    public   ParkingProof(String proofNum)
    {
        this. proofNum = proofNum;

    }

    public  boolean equel(Object Obj)
    {
        return  ((ParkingProof)Obj).proofNum == this.proofNum;
    }


}
