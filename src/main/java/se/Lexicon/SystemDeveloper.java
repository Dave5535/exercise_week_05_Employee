package se.Lexicon;

import java.util.Arrays;

public class SystemDeveloper extends Employee {

    //fields
    private String[] certificates = new String[0];

    private String[] languages = new String[0];


    //constructors
    public SystemDeveloper(String name) {
        super(name);
    }

    //methods
    @Override
    public void calculateSalary() {
        if (certificates != null) {
            int addOnSalary = 1000 * certificates.length;

            if (languages != null) {
                int addOnSalary1 = 1500 * languages.length;
                setSalary(25000 + addOnSalary + addOnSalary1);
            }
        }

    }

    public String DeveloperInformation(){

        return "Employee id : " + getId() +"  Clients Information : " + Arrays.toString(certificates) + "  acquiredClients: " + Arrays.toString(languages);
    }


    @Override
    public String toString() {
        return "SystemDeveloper{" +
                "certificate=" + Arrays.toString(certificates) +
                ", languages=" + Arrays.toString(languages) +
                '}';
    }

    public void addCertificates(String certificate){
        // todo:
        String[] newcertificate = Arrays.copyOf(certificates,certificates.length + 1);
        newcertificate[newcertificate.length -1] = certificate;
        certificates = newcertificate;

        // define a method that can expand the clients array and add a new element on it
    }
    public void addLanguages(String client){
        // todo:
        String[] newlanguages = Arrays.copyOf(languages,languages.length + 1);
        newlanguages[newlanguages.length -1] = client;
        languages = newlanguages;

        // define a method that can expand the clients array and add a new element on it
    }

    //getters & setters
    public String[] getCertificate() {
        return certificates;
    }

    public void setCertificate(String[] certificate) {
        this.certificates = certificate;
        calculateSalary();
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
        calculateSalary();
    }

}
