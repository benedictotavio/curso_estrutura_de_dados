package numero;
public class Numero {
    private float value;

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        if (value < 0) {
            value = 0;
            msg("valor menos que zero!");
        } else if (value > 40 && value < 60) {
            value = value < 50 ? 40 : 60;
            msg("Valor no intervalo de 40 a 60");
            System.out.println(value);
        } else if (value > 100) {
            value = 100;
            msg("valor maior que 100");
        }
        this.value = value;
        msg("Novo valor atribuido!");
    }

    public Numero(float value) {
        this.value = value;
    }

    public Numero() {
    }

    private void msg(String msg) {
        System.out.println(msg);
    }

}
