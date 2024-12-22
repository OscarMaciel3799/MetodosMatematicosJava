import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        int numero1=25;
        float numero2=-25.3f;
        double numero3=3.52;

        System.out.println("Variable int numero1: "+ numero1);
        System.out.println("Variable float numero2: "+ numero2);
        System.out.println("Variable double numero3: "+ numero3);
        //Devuelve el valor absoluto de un número.
        System.out.println("Metodo abs=> abs(numero2) : "+abs(numero3)); //25.3

        //Devuelve el valor máximo entre dos números.
        System.out.println("Metodo max=> max(numero1,numero2) : "+max(numero1,numero2)); //25

        //Devuelve el valor mínimo entre dos números.
        System.out.println("Metodo min=> min(numero1,numero2) : "+min(numero1,numero2)); //-25.3

        //Devuelve el valor de a elevado a la potencia de b.
        System.out.println("Metodo pow=> pow(numero3,2) : "+pow(numero3,2)); //12.3904

        //Devuelve la raíz cuadrada de un número.
        System.out.println("Metodo sqrt=> sqrt(numero1,2) : "+sqrt(numero1)); //5

        //Redondea un número de punto flotante al entero más cercano.
        System.out.println("Metodo round=> round(numero2) : "+round(numero2)); //-25
        System.out.println("Metodo round=> round(numero3) : "+round(numero3)); //4

        //Devuelve el entero más pequeño que es mayor o igual que el número dado.
        System.out.println("Metodo ceil=> ceil(numero3) : "+ceil(numero3)); //4.0

        //Devuelve el entero más grande que es menor o igual que el número dado.
        System.out.println("Metodo floor=> floor(numero3) : "+floor(numero3)); //4.0

        //Devuelve el entero más grande que es menor o igual que el número dado.
        System.out.println("Metodo floor=> floor(numero3) : "+floor(numero3)); //3.0

        //Devuelve un número pseudoaleatorio entre 0.0 (inclusive) y 1.0 (exclusive).
        System.out.println("Metodo random=> random() : "+random()); //

        //Devuelve el seno de un ángulo en radianes.
        System.out.println("Metodo sin=> sin(30) : "+sin(30)); //-0.9880316240928618

        //Devuelve el coseno de un ángulo en radianes.
        System.out.println("Metodo cos=> cos(30) : "+cos(30)); //0.15425144988758405

        //Devuelve el tangente de un ángulo en radianes.
        System.out.println("Metodo tan=> tan(30) : "+tan(30)); //-6.405331196646276

        //Devuelve el logaritmo natural (base e) de un número.
        System.out.println("Metodo log=> log(30) : "+log(numero1)); //3.2188758248682006

        //Devuelve el logaritmo en base 10 de un número.
        System.out.println("Metodo log10=> log10(numero1) : "+log10(numero1)); //1.3979400086720377

        //Devuelve el valor de e elevado a la potencia de a.
        System.out.println("Metodo exp=> exp(2) : "+exp(2)); //7.38905609893065

    }
}