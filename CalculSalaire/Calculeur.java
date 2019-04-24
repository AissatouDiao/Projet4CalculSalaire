package pack1;

public class Calculeur implements Visiteur {

    @Override
    public double CalculerSalaire(Manager manager) {
     System.out.println("le salaire d'un manager");
        return manager.getsalaire();
    }

    @Override
    public double CalculerSalaire(Commercial commercial) {
        System.out.println("le salaire d'un commercial");
        return commercial.getsalaire();
    }

 

    @Override
    public double CalculerSalaire(Ouvrier ouvrier) {
        System.out.println("le salaire d'un manager");
        return ouvrier.getsalaire();
    }

}
