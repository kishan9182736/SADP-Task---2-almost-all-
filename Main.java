class Main{
    public static void main(String[] args) {
        Car c1= new Car();
        Car c2= new Car();
        Car c3= new Car();

        System.out.println(c1.color);
        System.out.println(c1.name);
        c2.name ="hunda";
        System.out.println(c2.name );
    }
}

class Car{
    String name ="BMW";
    String color = "black";
    int price = 50000;

    void drive (){
        System.out.println("boom,booom,boooooomm");
    }
    void lock(){
        System.out.println("car is now locked");
    }
    void unlock(){
        System.out.println("car is bow unlocked");
    }

}





