package com.company;
import java.util.Scanner;

public class Main {


    public static double RetornaAliquota(double dSalarioBase){
        double dAliquota = 0.00;

        if (dSalarioBase <= 1903.98)
            dAliquota = 0.00;
        else
        if ((dSalarioBase >= 1903.99) && (dSalarioBase <= 2826.65))
            dAliquota = 7.5;
        else
        if ((dSalarioBase >= 2826.66) && (dSalarioBase <= 3751.05))
            dAliquota = 15;
        else
        if ((dSalarioBase >= 3751.06) && (dSalarioBase <= 4664.68))
            dAliquota = 22.5;
        else
        if (dSalarioBase > 4664.68)
            dAliquota = 27.5;

        return dAliquota;
    }

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        double dRendaMensal = 0.00;
        int iQuantDep = 0;
        double dValorContrib = 0.00;
        double dPensao = 0.00;
        double dValorImposto = 0.00;
        double dAliquotaImposto = 0.00;


        //Capturar os dados
        System.out.println("Informe os dados abaixo");
        System.out.println("");
        System.out.print("Valor Mensal....");
        dRendaMensal = leitura.nextDouble();
        System.out.print("Qtde. de dependentes....");
        iQuantDep = leitura.nextInt();
        System.out.print("Valor de Contribuição....");
        dValorContrib = leitura.nextDouble();
        System.out.print("Valor Pensão Alimentícia....");
        dPensao = leitura.nextDouble();

        if (dRendaMensal>0){

            //Calçular o Imposto
            dValorImposto = (RetornaAliquota(dRendaMensal) * dRendaMensal);


        }
        System.out.print("Valor do Imposto...."+ dValorImposto);

    }


}
