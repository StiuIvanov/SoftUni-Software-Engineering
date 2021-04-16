package RawData;

public class Tires {
    private double tire1Pressure = 0;
    private int tire1Age = 0;

    private double tire2Pressure = 0;
    private int tire2Age = 0;

    private double tire3Pressure = 0;
    private int tire3Age = 0;

    private double tire4Pressure = 0;
    private int tire4Age = 0;

    public Tires(double tire1Pressure, int tire1Age,
                 double tire2Pressure, int tire2Age,
                 double tire3Pressure, int tire3Age,
                 double tire4Pressure, int tire4Age) {
        this.tire1Pressure = tire1Pressure;
        this.tire1Age = tire1Age;
        this.tire2Pressure = tire2Pressure;
        this.tire2Age = tire2Age;
        this.tire3Pressure = tire3Pressure;
        this.tire3Age = tire3Age;
        this.tire4Pressure = tire4Pressure;
        this.tire4Age = tire4Age;
    }

    public double averagePressure(){
        double average =(tire1Pressure + tire2Pressure +
                tire3Pressure + tire4Pressure) / 4;
        return average;// TODO: 2/2/2021 maybe return boolean for <1
    }

    public boolean pressureIsBellow1 (){
        if (tire1Pressure<1 || tire2Pressure <1 ||
                tire3Pressure <1 || tire4Pressure <1){
            return true;
        }

        return false;
    }

}
