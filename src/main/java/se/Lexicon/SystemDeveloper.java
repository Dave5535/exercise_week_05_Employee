package se.Lexicon;

import java.util.Arrays;

public class SystemDeveloper extends Employee {

    //fields
    private String[] certificate;

    private String[] languages;


    //constructors
    public SystemDeveloper(String name) {
        super(name);
    }

    //methods
    @Override
    public void calculateSalary() {
        if (certificate != null) {
            int addOnSalary = 1000 * certificate.length;

            if (languages != null) {
                int addOnSalary1 = 1500 * languages.length;
                setSalary(25000 + addOnSalary + addOnSalary1);
            }
        }

    }

    public String DeveloperInformation(){
        StringBuilder stringBuilder = new StringBuilder();

        if (certificate == null || certificate.length == 0){
            return "No certificates";}
        for (String certificate : certificate){
            stringBuilder.append(certificate).append(" - ");}
        if (languages == null || languages.length == 0){
            return "No languages";}
        for (String languages : languages){
            stringBuilder.append(languages).append(" - ");
        }
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return "Certificate: "+  Arrays.toString(certificate)+ "Languages: " + Arrays.toString(languages) ;
    }

    //getters & setters
    public String[] getCertificate() {
        return certificate;
    }

    public void setCertificate(String[] certificate) {
        this.certificate = certificate;
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
