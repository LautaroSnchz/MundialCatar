import java.util.ArrayList;
import java.util.List;

public class MundialQatar2022 {
    public List<Equipo> equipos;
    public List<Resultado> resultados;

    public MundialQatar2022() {
        equipos = new ArrayList<>();
        for (EquipoNombre nombre : EquipoNombre.values()) {
            equipos.add(new Equipo(nombre));
        }
        resultados = new ArrayList<>();
    }

    public void cargarResultado(Resultado resultado) {
        resultados.add(resultado);
        resultado.actualizarEstadisticas();
    }

    public void imprimirResultados() {
        for (Resultado resultado : resultados) {
            System.out.println(resultado);
        }
    }

    public void recorrerTabla() {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("|     Equipo     |  J  |  G  |  E  |  P  |  GF  |  GE  |  Dif  |  Pts  |");
        System.out.println("-------------------------------------------------------------------------");
        for (Equipo equipo : equipos) {
            System.out.println("|  " + equipo + "  |");
        }
        System.out.println("-------------------------------------------------------------------------");
    }

    public String resultadoPartido(Equipo equipo1, Equipo equipo2) {
        int resultadoLocal = (int) (Math.random() * 5);
        int resultadoVisitante = (int) (Math.random() * 5);
        return "El resultado fue: " + equipo1.getNombre() + " " + resultadoLocal + " - " + resultadoVisitante + " " + equipo2.getNombre();
    }


    
     public void equiposClasificados(){
         System.out.println("Equipos clasificados");
         int primerPuesto = 0;
         int segundoPuesto = 0;
         EquipoNombre pp = null;
         EquipoNombre sp = null;
         int diferenciaPP = 0;
         int diferenciaSP = 0;
         
         for (Equipo var: equipos){
             int diferencia = var.getGolesFavor() - var.getGolesContra();
             int puntos = ((var.getGanados()*3)+(var.getEmpatados()));
             
             if (puntos > primerPuesto){
                 segundoPuesto = primerPuesto;
                 sp = pp;
                 primerPuesto = puntos;
                 pp = var.getNombre();
                 diferenciaPP = diferencia;
                 
             }
             else {
                 if(puntos == primerPuesto){
                     if (diferencia > diferenciaPP){
                         segundoPuesto = primerPuesto;
                         sp = pp;
                        primerPuesto = puntos;
                        pp = var.getNombre();
                        diferenciaPP = diferencia;
                     }
                     else{
                         segundoPuesto = puntos;
                         sp = var.getNombre();
                         diferenciaSP = diferencia;
                     }
                 }
                 else if((puntos < primerPuesto)&& (puntos > segundoPuesto)){
                     segundoPuesto = puntos; 
                     sp = var.getNombre();
                     diferenciaSP = diferencia;
                    }
                 else if(puntos == segundoPuesto) {
                     if(diferencia > diferenciaSP){
                         segundoPuesto = puntos;
                         sp = var.getNombre();
                         diferenciaSP = diferencia;
                     }
                 }
             }
             
         }
         
         System.out.println("Primer puesto: " + pp);
         System.out.println("Segundo puesto: " + sp);
     }
    
    
}
