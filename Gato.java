public class Gato extends Sonidos implements modo_Mascoota {
    @Override
    public void hacerSonido() {
        System.out.println("El gato maulla");
    }

    @Override
    public String jugar() {
        return "El gato juega con un ratoncito";
    }

    @Override
    public String alimentar() {
        return "El gato es alimentado con pescado";
    }
}