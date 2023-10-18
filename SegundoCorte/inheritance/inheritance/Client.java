package herencia;

import java.util.Date;

public class Client extends Herencia{
    private int idClient;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorCliente;

    public Client(Date fechaRegistro, boolean vip, String nombre) {
        super(nombre, genero, edad, direccion);
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    public int getIdClient() {
        return idClient;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    public boolean isVip(){
    return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Client{");
        sb.append("idClient=").append(idClient);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", vip=").append(vip);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
