
package practico.pkg7;


public class Cliente {
    private long dni;
    private String apellido;
    private String nombre;
    private long [] numeros;
    private String ciudad;
    

    public Cliente(long dni, String apellido, String nombre, long numeros, String ciudad) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.numeros[0]= numeros;
        this.ciudad = ciudad;
    }
    
    public void getCliente(){
        System.out.println("Cliente: "+ apellido);
        System.out.println("Nombre: "+ nombre);
        System.out.println("Numeros: ");
        for (int i=0; i<numeros.length; i++)
        {
            System.out.println(numeros[i]);
        }
        System.out.println("Ciudad: " + ciudad);
    }
    public void agregarTel(long numeroNuevo){
        this.numeros[numeros.length +1 ] = numeroNuevo;
    }
    
    public void mostrarTelefonos (){
        System.out.println("Telefonos de: " + nombre + " " + apellido);
        for (int i=0;i<numeros.length;i++)
        {
            System.out.println(numeros[i]);
        }
    }

    public String getCiudad() {
        return ciudad;
    }
    public long getTelefonoP(){
        return   numeros[0];
    }
    public String getApellido(){
        return apellido;
    }
    public String getNombreCompleto(){
        return nombre + " " + apellido;
    }
    public long getDni(){
        return dni;
    }
}
