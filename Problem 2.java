import java.util.Scanner;
class Car
{
    int speed;
    int regularPrice;
    String color;
    Car(int speed,int regularPrice,String color)
    {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
        
    }
    int getSalePrice()
    {
        return regularPrice;
    }

}
class Truck extends Car
{
    int weight;
    Truck(int speed,int regularPrice,String color,int weight)
    {
        super(speed,regularPrice,color);
        this.weight = weight;
    }
    int getSalePrice()
    {
        if(weight>2300)
        {
            System.out.println("Discount on sale Price(10%): "+regularPrice/100);
            return regularPrice*9/100;
        }
        else
        {
            System.out.println("Discount on sale Price(20%): "+2*regularPrice/100);
            return regularPrice*8/100;
        }
    }
    
}
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------Enter details of truck: ------------------------------------------");
        int speed;
        int regularPrice;
        String color;
        int weight;
        System.out.println("Enter Colour: ");
        color = sc.nextLine();
        System.out.println("Enter speed: ");
        speed = sc.nextInt();
        System.out.println("Enter Price: ");
        regularPrice = sc.nextInt();
        System.out.println("Enter Weight: ");
        weight = sc.nextInt();
        Car t1 = new Truck(speed,regularPrice,color,weight);
        System.out.println("Speed: "+t1.speed+" Price: "+t1.regularPrice+" Colour: "+t1.color+" Sale Price: "+t1.getSalePrice());
        System.out.println("-------------------------------------------------------------------------------------------------");
    }
}
