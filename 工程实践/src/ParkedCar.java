/**
 * Created with IntelliJ IDEA.
 * User: 51ibm
 * Date: 12-11-11
 * Time: 下午3:36
 * To change this template use File | Settings | File Templates.
 */
public class ParkedCar extends Car {
    public ParkedCar(String proofNum,String carNum)
    {
       super(carNum) ;
        parkingProof = new   ParkingProof(proofNum) ;
    }
    public ParkingProof parkingProof;

}
