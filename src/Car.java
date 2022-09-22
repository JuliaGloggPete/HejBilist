public class Car extends Vehicle{



    public Car() {


            milesToGo = 100;
            System.out.println("Car created " + milesToGo + " miles to go!");
            minAge=18;
        this.type= "car";

    }
    public void setDriver(Driver driver) {
        if(driver.getAge() <= minAge)
        { System.out.println("Driver not changed, "+driver.getName()+" is " +driver.getAge() +
                " you must be "+minAge+" or older to Drive a " + this.type);
            this.driver = driver;
        } else {
            System.out.println("Driver changed to "+driver.getName());
            this.hasDriver =true;

        }
    }

    public void drive(){
        if (hasDriver != true){ System.out.println("Car didn't drive, it has no driver");

        } else {

            int milesToDeduct= 10;
            this.milesToGo=milesToGo-milesToDeduct;


            System.out.println("Car drove " + milesToDeduct+ " miles - "+milesToGo+ " miles to go");}
    }
}
