package pack1;

public interface Visiteur {
    
   public double  CalculerSalaire(Manager manager);
   public double  CalculerSalaire(Commercial commercial);
   public double  CalculerSalaire(Ouvrier ouvrier);
}
