public class Perro extends Sonidos implements modo_Mascoota {
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra");
    }

    @Override
    public String jugar() {
        return "El perro juega a atrapar la pelota";
    }

    @Override
    public String alimentar() {
        return "El perro es alimentado con croquetas";
    }
}