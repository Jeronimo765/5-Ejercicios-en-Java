public class Circulo extends Figura{
    private int radio;

    public Circulo(String color , int radio){
        super(color);
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public void mostrarInfo(){
        System.out.println("El radio del circulo es:" + getRadio());
        System.out.println("El color del circulo es:" + getColor());
    }
}
