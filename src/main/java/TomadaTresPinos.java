public class TomadaTresPinos implements ITomada {
    private String tresPinos;

    @Override
    public String getTomada() {
        return tresPinos;
    }

    @Override
    public void setTomada(String tomada) {
        this.tresPinos = tomada;
    }
}
