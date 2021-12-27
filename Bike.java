/*
* This is the Bike class.
*
* @author  Hussein Mansour
* @version 1.0
* @since   2021-12-17
*/

/**
* Bike class inheritance from Vehicle.
*/
public class Bike extends Vehicle {


    /**
    * Bike.
    */
    private String ring;

    /**
    * Sets the Bike ring bell.
    *
    * @param ring Set ring bell.
    */

    // Setter.
    public final void setRingBell(String ring) {
        this.ring = ring;
    }

    // Getter.
    public final String getRingBell() {
        return ring;
    }
}
