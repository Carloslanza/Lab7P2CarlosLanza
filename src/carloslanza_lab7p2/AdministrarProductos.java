package carloslanza_lab7p2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AdministrarProductos {
    private ArrayList<Producto> productos = new ArrayList<>();
    private File archivo = null;

    public AdministrarProductos(String path) {
        archivo = new File(path);
    }

    public String getArchivoNombre() {
        return archivo.getPath();
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
            
            bw.write("id,name,category,price,aisle,bin");
            for (Producto p : productos) {
                bw.write(
                        p.getId() + "," + p.getName() + "," + p.getCategory() + "," + 
                                p.getCategory() + "," + p.getPrice() + "," + p.getAisle() + "," + p.getBin() + "\n"
                 );
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }
    
    public void cargarArchivo() {
        Scanner sc = null;
        productos = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(",");
                while (sc.hasNext()) {
                    productos.add(new Producto(
                            sc.nextInt(),
                            sc.nextLine(),
                            sc.nextInt(),
                            sc.nextDouble(),
                            sc.nextInt(),
                            sc.nextInt()
                    ));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }
    }
}
