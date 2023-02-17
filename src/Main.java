public class Main {
    public static void main(String[] args) {
Java java = new Java("Abdymomun",18,"Mels","Abdymomun@gmail.com");
Java java1 = new Java("Ruslan",22,"Mels","Rudlan99@gmail.com");
Java java2 = new Java("Matmusa",23,"Mels","MatmusaAbdubohobuulu@gmail.com");
Java java3 = new Java("Manas",28,"Mels","MAnas95@gmail.com");;
Java java4 = new Java("Erjigit",19,"Mels","Ergigit@gmail.com");
Java [] javas = {java,java1,java2,java3,java4};
Go go = new Go(" Stalbek ",36,"Mels","Stalbek@gmail.com");
Go go1 = new Go("Baktiar",29,"Mels","Baku@gmail,com");
Go [] gos = {go,go1};
Android android = new Android("Adilet ",23,"Mels ","Adilet@gmail.com ");
Android android1 = new Android("Abdumalik",24,"Mels","Malik@gmail.com");
Android android2 = new Android("Mirbel",15,"Mels","Mirbek@gmail.com ");
Android [] androids = {android,android1,android2};
Company company = new Company(" Бишкек Гражданский 119  ",javas,androids,gos,"Эсен Ниязов");
company.outputToTheConsole();
    }
}