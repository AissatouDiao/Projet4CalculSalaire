package pack1;

public class Manager implements Visitable {
  private int indice;
  private int Salaire_base;
  private int prime;
  private double impot;
Manager(int indice, int salaire_base, int prime, double impot) {
    super();
    this.indice = indice;
    this.Salaire_base = salaire_base;
    this.prime = prime;
    this.impot= impot;
}

public double salaire() {
   double salaire= this.indice*this.Salaire_base+this.prime+this.impot;
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
