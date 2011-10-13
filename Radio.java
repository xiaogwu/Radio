/* Xiao G. Wu
 * CS111A - Assignment 7
 * 10/08/2011
 */

/** This class models a radio */

public class Radio {

    // Fields
    private boolean power;
    private int volume;
    private double tuning;
    private boolean mute;
    private double battery;
    private boolean band;

    // Default constructor
    public Radio() {
        power = false;
        volume = 5;
        tuning = 100.1;
        mute = false;
        battery = 100.0;
        band = false;
    }

    /** Constructor
     * @param pow - Radio power state, false = "off" and true = "on"
     * @param vol - Radio volume level, 1 to 10
     * @param freq - Radio tuning frequency
     * @param sound - Radio sound state, false = "muted" and true = "non-muted"
     * @param batt - Radio battery level 0 to 100%
     * @param mod - Radio modulation, false = "AM" and true = "FM"
     */

    public Radio(boolean pow, int vol, double freq, boolean sound, double batt, boolean mod) {
        power = pow;
        volume = vol;
        tuning = freq;
        mute = sound;
        battery = batt;
        band = mod;
    }
    
    // Setters
    
    /** This method sets the radio power state
     * @param pow - Power state, false = "off" and true = "on"
     */

    public void setPower(boolean pow) {

    }

    /** This method sets the radio volume
     * @param vol - Volume level, 1 to 10
     */

    public void setVolume(int vol) {

    }

    /** This method sets the radio tuning frequency
     * @param freq - Tuning frequency
     */

    public void setTuning(double freq) {

    }

    /** This method sets the radio mute state
     * @param sound - Sound state, false = "muted" and true = "non-muted"
     */

    public void setMute(boolean sound) {

    }

    /** This method sets the radio battery level
     * @param batt - Batter level, 0 to 100%
     */

    public void setBattery(double batt) {

    }

    /** This method sets the radio modulation band
     * @param mod - false = "AM" and true = "FM"
     */

    public void setBand(boolean mod) {

    }

    // Getters

    /** getPower method
     * @return The power state of the radio
     */

    public boolean getPower() {
        return power;
    }

    /** getVolume method
     * @return The volume of the radio
     */

    public int getVolume() {
        return volume;
    }

    /** getTuning method
     * @return The runing frequency of the radio
     */

    public double getTuning() {
        return tuning;
    }

    /** getMute method
     * @return The sound state of the radio
     */

    public boolean getMute() {
        return mute;
    }

    /** getBattery method
     * @return The battery level of the radio
     */

    public double getBattery() {
        return battery;
    }

    /** getBand method
     * @return The modulation of the radio
     */

    public boolean getBand() {
        return band;
    }
}
