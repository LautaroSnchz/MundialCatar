public class Resultado {
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private int resultadoLocal;
    private int resultadoVisitante;

    public Resultado(Equipo equipoLocal, Equipo equipoVisitante, int resultadoLocal, int resultadoVisitante) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.resultadoLocal = resultadoLocal;
        this.resultadoVisitante = resultadoVisitante;
    }

    public void actualizarEstadisticas() {
        equipoLocal.actualizarEstadisticas(resultadoLocal, resultadoVisitante, resultadoLocal > resultadoVisitante, resultadoLocal == resultadoVisitante);
        equipoVisitante.actualizarEstadisticas(resultadoVisitante, resultadoLocal, resultadoVisitante > resultadoLocal, resultadoLocal == resultadoVisitante);
    }

    @Override
    public String toString() {
        return equipoLocal.getNombre() + " " + resultadoLocal + " - " + resultadoVisitante + " " + equipoVisitante.getNombre();
    }
}
