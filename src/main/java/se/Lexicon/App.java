package se.Lexicon;

public class App {
    public static void main(String[] args) {

        SystemDeveloper test2 = new SystemDeveloper("testDev testDev");
        String[] cert = {"cert"};
        String[] cert1 = {"cert1"};
        String[] lang = {"lang"};
        String[] lang1 = {"lang1"};
        test2.setCertificate(cert);
        test2.setCertificate(cert1);
        test2.setLanguages(lang);
        test2.setLanguages(lang1);

//_______________________________________________________________________
        SalesPerson test = new SalesPerson("testSP testSP");

        String[] client = {"client"};
        String[] client2 = {"client2"};
        test.setAcquiredClients(1);
        test.setClients(client);
        test.setClients(client2);

//_______________________________________________________________________

        System.out.println(test.getInformation());
        System.out.println(test2.getInformation());
        System.out.println("______________________________________");
        System.out.println(test.salespersonInformation());
        System.out.println(test2.DeveloperInformation());
        System.out.println("______________________________________");
        System.out.println(test.toString());
        System.out.println(test2.toString());
    }
}