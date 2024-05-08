package introducao;
public class estruturaif {
    public static void main(String[] args) {
        // a fução math.random só aceita double com tipo
        // alem de if e else java possui else if
        double x = Math.random();
        if(x > 0.5){
            System.out.println("ferias fria");

        } else {
            System.out.println("ferias quentes");
        }
    }
}
