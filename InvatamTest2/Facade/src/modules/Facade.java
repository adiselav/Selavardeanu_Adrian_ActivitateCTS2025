package modules;

public class Facade {
    public void verificare(Ghiseu ghiseu) {
        Acte acte = new Acte();
        OperatorGhiseu operator = new OperatorGhiseu();
        if (ghiseu.isAesteLiber()) {
            if (operator.esteOperatorulLaGhiseu(ghiseu)) {
                if (acte.avetiActele(ghiseu)) {
                    System.out.println("Nu la mine, la colega");
                } else System.out.println("Nu aveti toate actele");
            } else System.out.println("Operator absent");
        } else System.out.println("Ghiseu ocupat");
    }
}
