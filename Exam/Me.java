public class Me implements Tourist {

    static int budget = 1000;

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    public void visit(Boracay boracay) {
        if (budget < boracay.airFare){
            System.out.println("Not sure if makakapunta");
            
        }
        else {
                System.out.println("Enjoying my stay here in Boracay!");
                budget = budget - boracay.airFare;
            }
            
            checkBudget();
        }
    
    public void visit(Cebu cebu){
        if (budget < cebu.airFare){
            System.out.println("Not sure if makakapunta");
        }
        else {
                System.out.println("Nagkakape sa Cebu");
                budget = budget - cebu.airFare;
            }
            
            checkBudget();
        }
    
    public void visit(Batanes batanes){
        if (budget < batanes.airFare){
            System.out.println("Not sure if makakapunta");
        }
        else {
                System.out.println("Exploring Batanes rn yehey");
                budget = budget - batanes.airFare;
            }
            
            checkBudget();
        }

    public void visit(Bicol bicol){
        if (budget < bicol.airFare){
            System.out.println("Not sure if makakapunta");
        }
        else {
                System.out.println("Nasa Bicol me rn sn n kau");
                budget = budget - bicol.airFare;
            }
            
            checkBudget();
        }

    public void visit(Palawan palawan){
        if (budget < palawan.airFare){
            System.out.println("Not sure if makakapunta");
        }
        else {
                System.out.println("Swimming sa Palawan");
                budget = budget - palawan.airFare;
            }
            
            checkBudget();
        }

    public void visit(Sagada sagada){
        if (budget < sagada.airFare){
            System.out.println("Not sure if makakapunta");
        }
        else {
                System.out.println("First time here in Sagada");
                budget = budget - sagada.airFare;
            }
           
            checkBudget();
        }
    

    public void checkBudget() {
        System.out.println("my budget is " + budget);
    }


}