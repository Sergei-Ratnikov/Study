package Study;

class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;
    
    void range() {
        System.out.println("Range = " + fuelcap * mpg);
    }
}

class ClassWithMethod {
    public static void main (String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sport = new Vehicle();
        
        int range1, range2;
        
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;
        
        sport.passengers = 2;
        sport.fuelcap = 14;
        sport.mpg = 12;
        
        System.out.println("Mini carry " + minivan.passengers);
        
        minivan.range();
        
    }
}