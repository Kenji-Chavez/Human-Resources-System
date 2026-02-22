package gm.rh.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data // genera los metodos get y set automaticamente
@NoArgsConstructor // constructor vacio
@AllArgsConstructor // constructor con todos los atributos
@ToString
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // llave primaria autoincrementable
    Integer idEmpleado;
    String nombre;
    String departamento;
    Double sueldo;

}
