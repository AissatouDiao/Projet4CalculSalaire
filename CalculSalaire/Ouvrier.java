package pack1;

public class Ouvrier implements Visitable {
    private int heures;
    private int Salaire_horaire;
   
  Ouvrier(int heures, int Salaire_horaire) {
      super();
      this.heures = heures;
      this.Salaire_horaire = Salaire_horaire;
      
  }

  public double salaire() {
     double salaire= this.heures*this.Salaire_horaire;
      return salaire;
  }
  public double getsalaire()
  {
      return this.salaire();
      }

  @Override
  public double payer(Visiteur visiteur) {
      // TODO Auto-generated method stub
      return visiteur.CalculerSalaire(this);
  }
}
