
package practico.pkg7;

import java.util.HashMap;
import java.util.List;


public class Directorio{
    
    HashMap<Long,Cliente> clientes = new HashMap<>();
    
    public void agregarCliente (Cliente c){
        clientes.put(c.getTelefonoP(), c);
    }
    
    public Cliente buscarCliente(long n){
        if (clientes.containsKey(n))
        {
            return clientes.get(n);
        }
        return null;
    }
    
    public void buscarTelefono(String Apellido){
        for (Long k : clientes.keySet()){
            if (clientes.get(k).getApellido().equals(Apellido)){
                clientes.get(k).mostrarTelefonos();
            }
        }
    }
    
    public List<Cliente> buscarClientes (String Ciudad){
        List <Cliente> Cc = null;
        
        for (long k : clientes.keySet())
        {
            if(clientes.get(k).getCiudad().equals(Ciudad))
                Cc.add(clientes.get(k));
        }
        return Cc;
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
