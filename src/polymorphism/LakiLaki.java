package polymorphism;
public class LakiLaki extends Manusia{
    @Override
    public void Job(){
        System.out.println("Job: Pengangguran");
    }
    @Override
    public void Job(String pekerjaan){
        System.out.println("Job: " + pekerjaan);
    }
}
