public class Vehicle {

    protected int milesToGo;
    protected boolean hasDriver;

    protected int minAge;
    protected String type;

    Driver driver;

    public Vehicle(int milesToGo) {
        this.milesToGo = milesToGo;
        hasDriver=false;
       int minAge= 30;
       this.type = "Vehicle";

    }
    public Vehicle(){
        this.milesToGo=100;
        hasDriver=false;
        minAge= 18;
    }



    public void setDriver(Driver driver) {
        if(driver.getAge() <= minAge)
        { System.out.println("Driver not changed, "+driver.getName()+" is " +driver.getAge() +
                " you must be "+minAge+" or older to Drive a " + type);
        this.driver = driver;
    } else {
            System.out.println("Driver changed to "+driver.getName());
            this.hasDriver =true;

        }
    }

    public void drive(){
        if (hasDriver != true){ System.out.println("diddni drive no driver");

    } else { System.out.println("vroom");}
    }}
