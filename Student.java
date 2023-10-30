/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.operacionesaritmeticas;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Lucax
 */
class Student extends OperacionesAritmeticas{

    Student(String ingresar_nombre_del_estudiante, int par) {
    }

    private int getDifficulty() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public class Main {

    public static void main(String[] args) {
        Student student = new Student("Juan Pérez", 2);
        startQuiz(student);
    }

    public static void startQuiz(Student student) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        List<Question> questions = createQuestions(student.getDifficulty());
        int correctAnswers = 0;
        int incorrectAnswers = 0;
        int questionsToTest = 10;

        for (int i = 0; i < questionsToTest; i++) {
            Question question = questions.get(random.nextInt(questions.size()));
            System.out.println(question.getQuestionText());

            while (true) {
                System.out.print("Respuesta: ");
                int answer = scanner.nextInt();

                if (question.checkAnswer(answer)) {
                    System.out.println(getRandomPositiveFeedback());
                    correctAnswers++;
                    break;
                } else {
                    System.out.println(getRandomNegativeFeedback());
                    incorrectAnswers++;
                }
            }
        }

        int totalAnswers = correctAnswers + incorrectAnswers;
        double correctAnswersPercentage = (double) correctAnswers / totalAnswers * 100;

        if (correctAnswersPercentage < 75) {
            System.out.println("Por favor pide ayuda adicional a tu instructor");
        } else {
            System.out.println("Felicidades, estás listo para pasar al siguiente nivel!");
        }
    }

    private static List<Question> createQuestions(int difficulty) {
        List<Question> questions = new ArrayList<>();

        // Añadir preguntas aquí

        return questions;
    }

    private static String getRandomPositiveFeedback() {
        String[] positiveFeedback = {
                "¡Muy bien!",
                "Excelente.",
                "¡bBuen trabajo!",
                "Sigue asi!"
        };

        return positiveFeedback[new Random().nextInt(positiveFeedback.length)];
    }

    private static String getRandomNegativeFeedback() {
        String[] negativeFeedback = {
                "No. Por favor intenta de nuevo,",
                "Incorrecto. intenta una vez mas.",
                "No te rindas!",
                "No. sigue intentando."
        };

        return negativeFeedback[new Random().nextInt(negativeFeedback.length)];
    }
    }
    public class SupervisorDeRendimiento {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nombreEstudiante;
        int numPreguntas;
        int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0;
        double porcentajeCorrectas;

        System.out.println("Por favor ingrese su nombre:");
        nombreEstudiante = scanner.nextLine();

        System.out.println("Por favor ingrese el número de preguntas que desea realizar:");
        numPreguntas = scanner.nextInt();

        for (int i = 0; i < numPreguntas; i++) {
            System.out.println("Ingrese 1 para la respuesta correcta o 2 para la respuesta incorrecta:");
            int respuesta = scanner.nextInt();

            if (respuesta == 1) {
                respuestasCorrectas++;
            } else if (respuesta == 2) {
                respuestasIncorrectas++;
            } else {
                System.out.println("Entrada no válida, intente de nuevo.");
                i--;
            }
        }

        porcentajeCorrectas = (double) respuestasCorrectas / numPreguntas * 100;

        System.out.println("El porcentaje de respuestas correctas es: " + porcentajeCorrectas + "%");

        if (porcentajeCorrectas < 75) {
            System.out.println("Por favor pide ayuda adicional a tu instructor");
        } else {
            System.out.println("Felicidades, estás listo para pasar al siguiente nivel!");
        }
    }
}
}



