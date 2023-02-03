import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

/**
 * PairOfDice
 */
public class PairOfDice {

    private int die1;

    private int die2;

    public PairOfDice() {
    }

    public PairOfDice(int die1, int die2) {
        this.die1 = die1;
        this.die2 = die2;
    }

    public int getDie1() {
        return this.die1;
    }

    public void setDie1(int die1) {
        this.die1 = die1;
    }

    public int getDie2() {
        return this.die2;
    }

    public void setDie2(int die2) {
        this.die2 = die2;
    }

    @Override
    public String toString() {

        return "{" + " die1='" + getDie1() + "'" + ", die2='" + getDie2() + "'" + "}";
    }

    public static void main(String[] args) {

       // PairOfDice pairOfDice = new PairOfDice();
       int  result = 0;
      
        do {
            
       
        Scanner scanner = new Scanner(System.in);

            System.out.println("Entrez la valeur du Dé 1");

            int de1 = scanner.nextInt();

            System.out.println("Entrez la valeur du Dé 2");

            int de2 = scanner.nextInt();

            result = de1 + de2;

            if (de1 < 0 || de2 < 0) {

                System.out.println("La valeur  du Dé 1 doit etre positif");

            }else 

            if(de1 >7 || de2 >7)
            {
                System.out.println("La valeur  du Dé 1 doit etre compris entre 0 et 6 ");

            }else 

            if(result==2)
            {   
                    System.out.println("Felicitation ");   
            }
            else 
            {
                System.out.println("La somme de Dé 1 et Dé 2 est different de 2");
            }
       
    }
 while (result !=2);

}
}