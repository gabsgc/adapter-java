public class Carregador {
    ITomada tomada;
    TomadaAdapter tomadaAdapter;

    public Carregador() {
        tomada = new TomadaTresPinos();
        tomadaAdapter = new TomadaAdapter(tomada);
    }

    public void setTomada(String tresPinos) {
        tomada.setTomada(tresPinos);
        tomadaAdapter.salvarTomada();
    }

    public String getTomada() {
        return tomadaAdapter.recuperarTomada();
    }

    public String getDoisPinos() {
        return tomadaAdapter.getDoisPinos();
    }
}
