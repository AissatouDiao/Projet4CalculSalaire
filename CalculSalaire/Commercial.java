package pack1;

public class Commercial implements Visitable{

   
    private int primeVente;
 
  Commercial(int primeVente) {
      super();
      
      this.primeVente = primeVente;
      
  }

  public double salaire() {
     double salaire=this.primeVente;
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
