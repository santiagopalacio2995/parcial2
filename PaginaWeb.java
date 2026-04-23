import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PaginaWeb {
    private String url;
    private String titulo;
    private String fechaAcceso;

    public PaginaWeb(String url, String titulo) {
        this.url = url;
        this.titulo = titulo;
       
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        this.fechaAcceso = dtf.format(LocalDateTime.now());
    }

    public String getUrl() {
        return url;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getFechaAcceso() {
        return fechaAcceso;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + " | URL: " + url + " | Acceso: " + fechaAcceso;
    }
}