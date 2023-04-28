import java.util.Objects;

public class TomadaAdapter extends TomadaDoisPinos {
    private ITomada tomada;

    public TomadaAdapter(ITomada tomada) {
        this.tomada = tomada;
    }

    public String recuperarTomada() {
        if (Objects.equals(this.getDoisPinos(), "Dois Pinos")) {
            tomada.setTomada("Três Pinos");
        }
        return tomada.getTomada();
    }

    public void salvarTomada() {
        if (Objects.equals(tomada.getTomada(), "Três Pinos")) {
            this.setDoisPinos("Dois Pinos");
        }
    }
}
