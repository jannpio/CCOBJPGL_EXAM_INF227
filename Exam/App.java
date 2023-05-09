public class App {
    public static void main(String[] args) throws Exception {
        
        Locations boracay = new Boracay();
        Locations batanes = new Batanes();
        Locations bicol = new Bicol();
        Locations cebu = new Cebu();
        Locations palawan = new Palawan();
        Locations sagada = new Sagada();

        Me tourist = new Me();
        
        
        boracay.accept(tourist);
        System.out.println();
        batanes.accept(tourist);
        System.out.println();
        bicol.accept(tourist);
        System.out.println();
        cebu.accept(tourist);
        System.out.println();
        palawan.accept(tourist);
        System.out.println();
        sagada.accept(tourist);   
        
    }
}