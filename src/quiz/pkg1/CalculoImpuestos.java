/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz.pkg1;

/**
 *
 * @author Byron
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculoImpuestos {

    private int cantidadCursos;
    private final List<String> nombresCursos;
    private final List<Double> montos;
    private final List<Double> impuestos;

    public CalculoImpuestos() {
        cantidadCursos = 0;
        nombresCursos = new ArrayList<>();
        montos = new ArrayList<>();
        impuestos = new ArrayList<>();
    }

    public int getCantidadCursos() {
        return cantidadCursos;
    }

    public void setCantidadCursos(int cantidadCursos) {
        this.cantidadCursos = cantidadCursos;
        nombresCursos.clear();
        montos.clear();
        impuestos.clear();
        for (int i = 0; i < cantidadCursos; i++) {
            nombresCursos.add(null);
            montos.add(0.0);
            impuestos.add(0.0);
        }
    }

    public void ingresarDatosCursos() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < cantidadCursos; i++) {
            System.out.print("Ingrese el nombre del curso " + (i + 1) + ": ");
            nombresCursos.set(i, scanner.nextLine());
            System.out.print("Ingrese el monto del curso " + (i + 1) + ": ");
            double montoCurso = scanner.nextDouble();
            montos.set(i, montoCurso);
            impuestos.set(i, montoCurso * 0.02);
        }
    }

    public void mostrarDatosCursos() {
        StringBuilder mensaje = new StringBuilder("Detalles de los cursos:\n");

        for (int i = 0; i < cantidadCursos; i++) {
            mensaje.append("Curso ").append(i + 1).append(": \n");
            mensaje.append("Nombre: ").append(nombresCursos.get(i)).append("\n");
            mensaje.append("Monto: $").append(montos.get(i)).append("\n");
            mensaje.append("Impuesto (2%): $").append(impuestos.get(i)).append("\n\n");
        }

        mensaje.append("Total Montos: $").append(calcularTotalMontos()).append("\n");
        mensaje.append("Total Impuestos: $").append(calcularTotalImpuestos()).append("\n");

        System.out.println(mensaje.toString());
    }

    public double calcularTotalMontos() {
        double totalMontos = 0.0;
        for (double monto : montos) {
            totalMontos += monto;
        }
        return totalMontos;
    }

    public double calcularTotalImpuestos() {
        double totalImpuestos = 0.0;
        for (double impuesto : impuestos) {
            totalImpuestos += impuesto;
        }
        return totalImpuestos;
    }

    public static void main(String[] args) {
        CalculoImpuestos calculoImpuestos = new CalculoImpuestos();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de cursos: ");
        int cantidadCursos = scanner.nextInt();
        calculoImpuestos.setCantidadCursos(cantidadCursos);

        calculoImpuestos.ingresarDatosCursos();

        calculoImpuestos.mostrarDatosCursos();
    }    }
