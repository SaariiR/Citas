package models;

import java.util.Date;
import javax.persistence.Entity;
import org.joda.time.DateTime;
import play.db.jpa.Model;

/**
 *
 * @author Sara Rodriguez Soto
 */
@Entity
public class Cliente extends Model{
 
    public String cliente;
    public String descripcion;
    public int precio;
    public Date fecha;
    public DateTime hora;
   
     @Override
    public String toString(){
        return String.format("%s %s", this.cliente, this.fecha , this.descripcion);
    }
 
}

