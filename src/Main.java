public class Main {
    public static void main(String[] args) {
        Course cis109 = new Course("cis109", "Intro to CIS");
        Section cis109Section1 = cis109.createSection("Fall 2017", "BSC", "M W F 9-9:50");
        Section cis109Section2 = cis109.createSection("Fall 2017", "BSC", "M W F 10-10:50");
    }
}
