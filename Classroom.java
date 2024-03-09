public class Classroom {
    public static void main(String[] args) {
        Wilder JC = new Wilder("Jean-Claude",true);
        Wilder Henri = new Wilder("Henri", false);

        System.out.println(JC.WhoIam());
        System.out.println(Henri.WhoIam());
    }
}
