
package practico.pkg7;

import java.util.HashMap;


public class Directorio{
    
    HashMap<Long,Cliente> clientes = new HashMap<>();
    
    public void agregarCliente (Cliente c){
        clientes.put(c.getTelefonoP(), c);
    }
    
    public void buscarCliente(long n){
        
        for (Long key : clientes.keySet()) {
            if (clientes.containsKey(n)){
                clientes.get(n).getCliente();
            }
            else{System.out.println("No existe el cliente");
            }
        }
    }
    
    public void buscarTelefono(String Apellido){
        for (Long k : clientes.keySet()){
            if (clientes.get(k).getApellido().equals(Apellido)){
                clientes.get(k).mostrarTelefonos();
            }
        }
    }
    
    public void buscarClientes (String Ciudad){
        System.out.println("Clientes que viven en " + Ciudad);
        for (long k : clientes.keySet())
        {
            if(clientes.get(k).getCiudad().equals(Ciudad))
                clientes.get(k).getNombreCompleto();
        }
    }
    
    public void borrarCliente(long dni){
        for (long k: clientes.keySet())
        {
            if(clientes.get(k).getDni() == dni){
                clientes.remove(k);        
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
