
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MundialQatar2022 mundial = new MundialQatar2022();
        // Simulación de resultados
        Equipo equipo1 = mundial.equipos.get(0);
        Equipo equipo2 = mundial.equipos.get(1);
        String resultado = mundial.resultadoPartido(equipo1, equipo2);
        Resultado partido = new Resultado(equipo1, equipo2, 1, 1); // Ajusta los resultados reales
        mundial.cargarResultado(partido);

        equipo1 = mundial.equipos.get(2);
        equipo2 = mundial.equipos.get(3);
        resultado = mundial.resultadoPartido(equipo1, equipo2);
        partido = new Resultado(equipo1, equipo2, 0, 2); // Ajusta los resultados reales
        mundial.cargarResultado(partido);
        equipo1 = mundial.equipos.get(0);
        equipo2 = mundial.equipos.get(1);
        Resultado partido2 = new Resultado(equipo1,equipo2,1,3);
        partido2 = new Resultado(equipo1,equipo2,2,0);
        mundial.cargarResultado(partido2);
        equipo1 = mundial.equipos.get(2);
        equipo2 = mundial.equipos.get(3);
        Resultado partido3 = new Resultado(equipo1,equipo2,0,1);
        partido3 = new Resultado(equipo1,equipo2,3,2);
        mundial.cargarResultado(partido3);
        mundial.imprimirResultados();
        mundial.recorrerTabla();
        mundial.equiposClasificados();
    }
}
