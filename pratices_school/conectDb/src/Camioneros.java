public class Camioneros {
    private String nombre;
    private String dni;
    private int tel;
    private String direcion;
    private double salario;
    private String poblacion;

    // getter

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public int getTel() {
        return tel;
    }

    public String getDirrecion() {
        return direcion;
    }

    public double getSalario() {
        return salario;
    }

    public String getPoblacion() {
        return poblacion;
    }

    // setter

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public void setDirecion(String direcion) {
        this.direcion = direcion;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

}
