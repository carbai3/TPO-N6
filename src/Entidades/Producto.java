
package Entidades;

public class Producto implements Comparable<Producto> {
    private int codigo;
    private String descripcion;
    private Double precio;
    private int stock;
    private String rubro;

    public Producto() {
    }

    public Producto(int codigo, String descripcion, Double precio, int stock, String rubro) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.rubro = rubro;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    @Override
       public String toString(){
   
       return codigo+" "+descripcion;
   }
    @Override
    public int compareTo(Producto t) {
        //0-->iguales
        //1-->mayor
        //-1-->menor
        if(this.codigo==t.codigo){
            
            return 0;
            
        }else if(this.codigo >t.codigo){
        
            return 1;
        }else {
        
            return -1;
        }
    }
}
