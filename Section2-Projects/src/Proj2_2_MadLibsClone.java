import java.util.Scanner;

public class Proj2_2_MadLibsClone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre1;
        String materia;
        String sustantivo1;
        String adjetivo1;
        String sustantivo2;
        String adjetivo2;
        int numero;
        String pregunta;
        String respuesta;
        String nombre2;
        String frase;
        String adjetivo3;

        System.out.println("Ingrese un nombre de mujer: ");
        nombre1 = sc.nextLine();
        System.out.println("Ingrese el nombre de una materia: ");
        materia = sc.nextLine();
        System.out.println("Ingrese un sustantivo: ");
        sustantivo1 = sc.nextLine();
        System.out.println("Ingrese un adjetivo: ");
        adjetivo1 = sc.nextLine();
        System.out.println("Ingrese otro sustantivo: ");
        sustantivo2 = sc.nextLine();
        System.out.println("Ingrese otro adjetivo: ");
        adjetivo2 = sc.nextLine();
        System.out.println("Ingrese un numero: ");
        numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese una pregunta (con puntuación): ");
        pregunta = sc.nextLine();
        System.out.println("Ingrese la respuesta a la pregunta: ");
        respuesta = sc.nextLine();
        System.out.println("Ingrese otro nombre de mujer: ");
        nombre2 = sc.nextLine();
        System.out.println("Ingrese una frase: ");
        frase = sc.nextLine();
        System.out.println("Ingrese un adjetivo en femenino: ");
        adjetivo3 = sc.nextLine();

        System.out.println();
        System.out.println(nombre1 + " estaba preocupada. Tenía que tomar un examen en la " +
                "clase de " + materia + ", pero ella dejó su " + sustantivo1 + " " + adjetivo1 +
                " en su " + sustantivo2 + " " + adjetivo2 + " y no pudo estudiar.\nDurante el " +
                "examen no sabía la respuesta a la pregunta número " + numero + ", '" + pregunta
                + "' Ella pensó y esribió '" + respuesta + "'. No tenía que preocuparse.\n Ella " +
                "pasó el examen y su maestra, " + nombre2 + ", le dijo '" + frase + "' y ella " +
                "estaba muy " + adjetivo3);


    }
}
