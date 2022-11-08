package se.Lexicon;


import java.util.Arrays;

public class SalesPerson extends Employee {
    //fields
    private String[] clients = new String[0];
    private int acquiredClients;

    public SalesPerson(String name) {
        super(name);
    }
//constructor

    //methods


    @Override
    public void calculateSalary() {
        if (clients != null) {
            int addOnSalary = 500 * clients.length;

            if (acquiredClients != 0) {
                int addOnSalary1 = 1000 * acquiredClients;
                setSalary(25000 + addOnSalary + addOnSalary1);
            }
        }

    }

    public String salespersonInformation() {
        return "Employee id : " +getId() + "  Clients Information : " + Arrays.toString(clients) + " acquiredClients: " + acquiredClients;
    }

    @Override
    public String toString() {
        return "SalesPerson{" +
                "clients=" + Arrays.toString(clients) +
                ", acquiredClients=" + acquiredClients +
                '}';
    }

    public void addClientToClients(String client){
        // todo:
        String[] newClient = Arrays.copyOf(clients,clients.length + 1);
        newClient[newClient.length -1] = client;
        clients = newClient;

        // define a method that can expand the clients array and add a new element on it
    }


    //getters & setters
    public String[] getClients() {
        return clients;
    }

    public void setClients(String[] clients) {
        this.clients = clients;
        calculateSalary();
    }

    public int getAcquiredClients() {
        return acquiredClients;
    }

    public void setAcquiredClients(int acquiredClients) {
        this.acquiredClients = acquiredClients;
        calculateSalary();
    }
}
