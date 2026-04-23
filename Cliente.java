import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Cliente {
    private int id;
    private String nombre;
    private String tipoServicio;
    private String horaLlegada;
    private boolean atendido;

    public Cliente(int id, String nombre, String tipoServicio) {
        this.id = id;
        this.nombre = nombre;
        this.tipoServicio = tipoServicio;
        this.atendido = false;

       
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        this.horaLlegada = dtf.format(LocalDateTime.now());
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public boolean isAtendido() {
        return atendido;
    }

    public void setAtendido(boolean atendido) {
        this.atendido = atendido;
    }

    @Override
    public String toString() {
        return "Turno #" + id + "  Cliente: " + nombre + "  Servicio: " + tipoServicio + "  Llegada: " + horaLlegada;
    }
}
