package polymorphism;
public class Main {
    public static void main(String[] args) {
        LakiLaki tono = new LakiLaki();
        Manusia na    = new Manusia();
        tono.Job();
        tono.Job("GameDev");
        na.Job();
        na.Job("N/A");
    }
}
