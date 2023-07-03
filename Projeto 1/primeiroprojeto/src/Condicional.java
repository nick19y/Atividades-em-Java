public class Condicional {
//    alt insert cria uma nova classe
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double ntoaDoFilme = 9.5;
        String tipoPlano = "plus";

        if(anoDeLancamento>=2022){
            System.out.println("Lançamento feito após o ano de 2022");
        } else{
            System.out.println("Filme retrô");
        }
//        comparação no java são ==
//        equals é ==
        if(incluidoNoPlano && tipoPlano.equals("plus")){
            System.out.println("Filme liberado");
        } else{
            System.out.println("Deve pagar a locação");
        }
//        int dia = 3;
//String nomeDia;
//
//switch (dia) {
//   case 1:
//      nomeDia = "domingo";
//      break;
//   case 2:
//      nomeDia = "segunda-feira";
//      break;
//   case 3:
//      nomeDia = "terça-feira";
//      break;
//   case 4:
//      nomeDia = "quarta-feira";
//      break;
//   case 5:
//      nomeDia = "quinta-feira";
//      break;
//   case 6:
//      nomeDia = "sexta-feira";
//      break;
//   case 7:
//      nomeDia = "sábado";
//      break;
//   default:
//      nomeDia = "Dia inválido";
//      break;
//}
//
//System.out.println("O dia " + dia + " é " + nomeDia);
//        switch case em java
    }
}
