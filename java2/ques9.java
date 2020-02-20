//9.  Design classes having attributes for furniture where there are wooden chairs and tables, metal chairs and tables.
//     There are stress and fire tests for each products.


abstract class Furniture{
    abstract void stress();
    abstract void fire();
    abstract void showdetails();
}
class WoodenChairs extends Furniture {
    String color ="Brown";
    String size="Small";
    public void stress(){
        System.out.println("Stress test is passed by wooden chair.");
    }
    public void fire(){
        System.out.println("Fire test is passed by wooden chair.");
    }
    public void showdetails(){
        System.out.println("---------------------------------------");
        System.out.println("Color of chair : "+color);
        System.out.println("Size of chair : "+size);
        stress();
        fire();
    }

}
class WoodenTables extends Furniture{
    String color ="Golden Brown";
    String size="Large";
    public void stress(){
        System.out.println("Stress test is passed by wooden table.");
    }
    public void fire(){
        System.out.println("Fire test is passed by wooden table.");
    }
    public void showdetails(){
        System.out.println("---------------------------------------");
        System.out.println("Color of wooden table : "+color);
        System.out.println("Size of wooden table : "+size);
        stress();
        fire();
    }
}
class MetalChairs extends Furniture{
    String color ="Metal Brown";
    String size="Medium";
    public void stress(){
        System.out.println("Stress test is passed by metal chair.");
    }
    public void fire(){
        System.out.println("Fire test is passed by metal chair.");
    }
    public void showdetails(){
        System.out.println("---------------------------------------");
        System.out.println("Color of  metal chair : "+color);
        System.out.println("Size of metal chair : "+size);
        stress();
        fire();
    }
}
class MetalTables extends Furniture{
    String color ="Golden Brown";
    String size="Large";
    public void stress(){
        System.out.println("Stress test is passed by metal table.");
    }
    public void fire(){
        System.out.println("Fire test is passed by metal table.");
    }
    public void showdetails(){
        System.out.println("---------------------------------------");
        System.out.println("Color of metal table : "+color);
        System.out.println("Size of metal table : "+size);
        stress();
        fire();
    }
}
class Driver {
    public static void main(String[] args) {
          Furniture MC =new MetalChairs();
          MC.showdetails();
          Furniture WC = new WoodenChairs();
          WC.showdetails();
          Furniture MT =new MetalTables();
          MT.showdetails();
          Furniture WT = new WoodenTables();
          WT.showdetails();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter type of furniture ie. WoodenChairs, Tables, MetalChairs");
//        String type = sc.next();
//        Furniture d = null;
//        if(type.equals("WoodenChairs")){
//            d = new WoodenChairs();
//        }
//        else if(type.equals("Tables"))
//        {
//            d = new Tables();
//        }
//        else if(type.equals("MetalChairs"))
//
//        {
//            d = new MetalChairs();
//        }
//        d.fire();
//        d.stress();
//        d.showdetails();
    }}