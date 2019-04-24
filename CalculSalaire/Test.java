package pack1;

public class Test{
public static void main(String[] args) {
    Calculeur A= new Calculeur();
    Manager Abou= new Manager(5,300000,10000,1.5);
    Commercial Serigne= new Commercial(100000);
    Ouvrier Ngor= new Ouvrier(50,10000);
    System.out.println(Abou.payer(A));
    System.out.println(Serigne.payer(A));
    System.out.println(Ngor.payer(A));
}
   
    
}
