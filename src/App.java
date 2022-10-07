public class App {
    public static void main(String[] args) throws Exception {
        calculaImprimeConta(80, "Pedro");
        calculaImprimeConta(50, "André");
        calculaImprimeConta(30, "Montanha");
        calculaImprimeConta(100,"Amanda");

        }


    public static void calculaImprimeConta(double conta, String nome){
        double gorjeta = conta*0.1;
        double couvert = conta * 0.2;
        double total = conta + gorjeta + couvert;
        System.out.println("Discriminação Conta do " + nome);
        System.out.println("Total consumido R$ " + conta);
        System.out.println("Gorjeta " + gorjeta);
        System.out.println("Couvert" + couvert);
        System.out.println("Total geral do " + nome + "R$" + total);
        System.out.println("");


    }
}
