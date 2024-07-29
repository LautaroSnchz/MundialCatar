
public class Equipo {
    private EquipoNombre nombre;
    private int jugados;
    private int ganados;
    private int empatados;
    private int perdidos;
    private int golesFavor;
    private int golesContra;

    public Equipo(EquipoNombre nombre) {
        this.nombre = nombre;
        this.jugados = 0;
        this.ganados = 0;
        this.empatados = 0;
        this.perdidos = 0;
        this.golesFavor = 0;
        this.golesContra = 0;
    }

    public EquipoNombre getNombre() {
        return nombre;
    }

    public int getJugados() {
        return jugados;
    }

    public void setJugados(int jugados) {
        this.jugados = jugados;
    }

    public int getGanados() {
        return ganados;
    }

    public void setGanados(int ganados) {
        this.ganados = ganados;
    }

    public int getEmpatados() {
        return empatados;
    }

    public void setEmpatados(int empatados) {
        this.empatados = empatados;
    }

    public int getPerdidos() {
        return perdidos;
    }

    public void setPerdidos(int perdidos) {
        this.perdidos = perdidos;
    }

    public int getGolesFavor() {
        return golesFavor;
    }

    public void setGolesFavor(int golesFavor) {
        this.golesFavor = golesFavor;
    }

    public int getGolesContra() {
        return golesContra;
    }

    public void setGolesContra(int golesContra) {
        this.golesContra = golesContra;
    }
    

    public void actualizarEstadisticas(int golesFavor, int golesContra, boolean ganador, boolean empate) {
        jugados++;
        this.golesFavor += golesFavor;
        this.golesContra += golesContra;
        if (ganador) {
            ganados++;
        } else if (empate) {
            empatados++;
        } else {
            perdidos++;
        }
    }

    public int getPuntos() {
        return (ganados * 3) + empatados;
    }

    @Override
    public String toString() {
        return nombre + " | " + jugados + " | " + ganados + " | " + empatados + " | " + perdidos + " | " +
               golesFavor + " | " + golesContra + " | " + (golesFavor - golesContra) + " | " + getPuntos();
    }
}
