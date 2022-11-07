package se.Lexicon;


import java.util.Arrays;

public class SalesPerson extends Employee {
    //fields
    private String[] clients;
    private int acquiredClients;

    public SalesPerson(String name) {
        super(name);
    }
//constructor

    //methods


    @Override
    public void calculateSalary(){
        if (clients != null) {
            int addOnSalary = 500 * clients.length;

            if (acquiredClients != 0) {
                int addOnSalary1 = 1000 * acquiredClients;
                setSalary(25000 + addOnSalary + addOnSalary1);
            }
        }

    }

    public String salespersonInformation(){
        StringBuilder stringBuilder = new StringBuilder();

        if (clients == null || clients.length == 0){
            return "No certificates";}
        for (String clients : clients){
            stringBuilder.append(clients).append(" - ");}
        if (acquiredClients == 0){
            return "No old clients";}


        return stringBuilder.toString() + "number of old clients: " + acquiredClients ;
    }
    @Override
    public String toString() {
        return "Salesman: {" + "Name: " + getName() +
                ", Clients: " + Arrays.toString(clients)  +
                '}';
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
