interface Tourist {

    int budget = 0;

    void visit();

    void visit(Boracay boracay);

    void visit(Cebu cebu);

    void visit(Batanes batanes);

    void visit(Bicol bicol);

    void visit(Palawan palawan);

    void visit(Sagada sagada);

    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();

    
}
