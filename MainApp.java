public class MainApp {

    public static void main(String[] args) {
        
        Laptop laptop = new Laptop();
        Refrigirator refrigirator = new Refrigirator();
        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();

        PowerOutlet laptopAdapter = new LaptopAdapter(laptop);
        PowerOutlet refrigiratorAdapter = new RefrigiratorAdapter(refrigirator);
        PowerOutlet smartphoneAdapter = new SmartphoneAdapter(smartphoneCharger);
        
        System.out.println(laptopAdapter.plugIn());
        System.out.println(refrigiratorAdapter.plugIn());
        System.out.println(smartphoneAdapter.plugIn());

    }
}