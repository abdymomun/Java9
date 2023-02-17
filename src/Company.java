public class Company {
    String address;
    Java[] javaProgrammers;
    Android[] androidProgrammers;
    Go[] goProgrammers;
    String ownerName;

    public Company(String address, Java[] javaProgrammers, Android[] androidProgrammers, Go[] goProgrammers, String ownerName) {
        this.address = address;
        this.javaProgrammers = javaProgrammers;
        this.androidProgrammers = androidProgrammers;
        this.goProgrammers = goProgrammers;
        this.ownerName = ownerName;
    }
    public void outputToTheConsole() {
        System.out.println("Company address: " + address);
        System.out.println("Owner name: " + ownerName);
        System.out.println("Java programmers: ");
        for (Java java : javaProgrammers) {
            System.out.println(java.name + " age : " + java.age + " ,  Gender: " + java.gender + " , Gmail: " + java.email);
        }
        System.out.println("Android programmers: ");
        for (Android android : androidProgrammers) {
            System.out.println(android.name + " age : " + android.age + " , Gender: " + android.gender + " , Gmail: " + android.email);
        }
        System.out.println("Go programmers: ");
        for (Go go : goProgrammers) {
            System.out.println(go.name + " age : " + go.age + ", " + go.gender + " Gender: " +" , Gmail: "+ go.email);
        }
    }
}

