public class Resolucao01 {

    int i = 0;
    public void imprimirFor() {
        System.out.println("\n\nfor");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + ", ");
        }
    }

    public void imprimeWhile() {
        int i = 0;
        System.out.println("\n\nwhile");
        while (i < 10) {
            System.out.print(i + ", ");
            i = i + 1; // i++ ou i+=1
        }
    }

    public void imprimeDoWhile() {
        int i = 0;
        System.out.println("\n\ndo-while");
        do {
            System.out.print(i + ", ");
            i++;
        } while (i < 10);
    }

    public void imprimeTudo() {

        System.out.println("\n\nfor");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + ", ");
        }
        System.out.println("\n\nwhile");
        while (i < 10) {
            System.out.print(i + ", ");
            i = i + 1; // i++ ou i+=1
        }
        System.out.println("\n\ndo-while");
        do {
            System.out.print(i + ", ");
            i++;
        } while (i < 10);

    }


}
