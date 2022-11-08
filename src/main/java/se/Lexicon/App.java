package se.Lexicon;

public class App {
    public static void main(String[] args) {

        SalesPerson test = new SalesPerson("testSP testSP");

        String client = "client1";
        String client2 = "client2";
        test.setAcquiredClients(1);
        test.addClientToClients(client);
        test.addClientToClients(client2);

//_______________________________________________________________________
        SystemDeveloper test2 = new SystemDeveloper("testDev testDev");
        String cert = "cert";
        String cert1 = "cert1";
        String lang = "lang";
        String lang1 = "lang1";
        test2.addCertificates(cert);
        test2.addCertificates(cert1);
        test2.addLanguages(lang);
        test2.addLanguages(lang1);

//_______________________________________________________________________

        System.out.println(test.getInformation());
        System.out.println(test2.getInformation());
        System.out.println("______________________________________");
        System.out.println(test.salespersonInformation());    //   ??
        System.out.println(test2.DeveloperInformation());    //    ??
        System.out.println("______________________________________");
        System.out.println(test.toString());        // ??
        System.out.println(test2.toString());      // ??
    }
}