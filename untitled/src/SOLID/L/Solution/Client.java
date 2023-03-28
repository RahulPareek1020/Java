//Object of any child class should be as-is substitutable in a variable of parent type, without requiring any code changes
//
//No Special treatment/ change required for any child class
//Objects of child class should behave the same way as the objects of base class

package SOLID.L.Solution;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<FlyingBirds> fBirds = new ArrayList<FlyingBirds>();
        List<NonFlyingBirds> nfBirds = new ArrayList<NonFlyingBirds>();

        ArrayList<ArrayList<BirdsV3>> birds = new ArrayList<ArrayList<BirdsV3>>();
        //birds.add(fBirds);
        //birds.add(nfBirds);
    }
}
