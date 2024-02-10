//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        int aleatorio = 0;

        aleatorio = (int) (Math.random() * 5 + 1);
        System.out.println(aleatorio);

        if (aleatorio == 1){
            System.out.println("Cada día es una nueva oportunidad" +
                               " para alcanzar tus sueños.");
        } else if (aleatorio == 2) {
            System.out.println("La felicidad se encuentra en las pequeñas" +
                    " cosas de la vida.");
        }else if (aleatorio == 3){
            System.out.println("Si quieres algo, lucha por ello hasta" +
                    " conseguirlo.");
        }else if (aleatorio == 4){
            System.out.println("La gratitud es la actitud que cambia tu vida.");
        }else if (aleatorio == 5){
            System.out.println("La belleza está en los ojos del que mira.");
        }
        else {System.out.println("La felicidad no es tener, sino ser.");}

    }
}

