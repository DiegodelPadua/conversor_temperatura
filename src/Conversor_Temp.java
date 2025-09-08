import java.util.Scanner;
public class Conversor_Temp {
    public double Celsius;
    public double Fahrenheit;
    public double Kelvin;

    public void obterDadosdeTemperatura () {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius: ");
        Celsius = leitor.nextDouble();



    }
    public void conbverterTemperatura(){

        Fahrenheit = ( Celsius * 1.8) + 32;
        Kelvin = Celsius + 273.1;

        exibirTemperaturas();



    }
    public void exibirTemperaturas(){
    System.out.println(Celsius + "ºC equivalem a: ");
        System.out.println(Fahrenheit + "ºF (Fahrenheit)");
        System.out.println(Kelvin + "ºK (Kelvin)");

    }


}
