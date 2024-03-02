package carloslanza_lab7p2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class AdministrarProductos {
    private ArrayList<Producto> productos = new ArrayList<>();
    private File archivo = null;

    public AdministrarProductos(String path) {
        archivo = new File("./" + path);
    }

    public String getArchivoNombre() {
        return archivo.getName();
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            
            bw.write("id,name,category,price,aisle,bin\n");
            for (Producto p : productos) {
                bw.write(
                        p.getId() + "," + p.getName() + "," + 
                                p.getCategory() + "," + p.getPrice() + "," + p.getAisle() + "," + p.getBin() + "\n"
                 );
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }
    
    
    public void cargarArchivo() throws IOException {
        if (archivo.exists()) {
            BufferedReader reader = new BufferedReader(new FileReader(archivo));
            String linea = reader.readLine();
            while ((linea = reader.readLine()) != null) {
                
               String[] atributos;
               atributos = linea.split(",");
               
               
                Producto producto = new Producto(
                    Integer.parseInt(atributos[0]),
                    atributos[1],
                    Integer.parseInt(atributos[2]),
                    Double.parseDouble(atributos[3]),
                    Integer.parseInt(atributos[4]),
                    Integer.parseInt(atributos[5])
                );
                productos.add(producto);
            }
            reader.close();
        }
    }
}
