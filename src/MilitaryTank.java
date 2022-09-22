public class MilitaryTank extends Vehicle {


    public MilitaryTank() {

        milesToGo = 2000;
        System.out.println("Tank created " + milesToGo + " miles to go!");
        minAge = 25;
        type = "tank";
    }
    public void setDriver(Driver driver) {
        if(driver.getAge() <= minAge)
        { System.out.println("Driver not changed, "+driver.getName()+" is " +driver.getAge() +
                " you must be "+minAge+" or older to Drive a " + type);;
            this.driver = driver;
        } else {
            System.out.println("Driver changed to "+driver.getName());
            this.hasDriver =true;

        }
    }

    public void drive(){
        if (hasDriver != true){ System.out.println("Tank didn't drive, it has no driver");

        } else {

            int milesToDeduct= 5;
            this.milesToGo=milesToGo-milesToDeduct;


            System.out.println("Tank drove " + milesToDeduct+ " miles - "+milesToGo+ " miles to go");}
    }

}


