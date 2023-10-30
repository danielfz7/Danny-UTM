/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operacionesaritmeticas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.security.SecureRandom;



public class OperacionesAritmeticas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Elige un nivel de dificultad:");
        System.out.println("1 - Fácil");
        System.out.println("2 - Intermedio");
        System.out.println("3 - Difícil");
        
        int nivelDificultad = scanner.nextInt();
        
            int rangoMaximo;
            
            switch (nivelDificultad) {
                case 1:
                    rangoMaximo = 10;
                    break;
                case 2:
                    rangoMaximo = 20;
                    break;
                case 3:
                    rangoMaximo = 100;
                    break;
                default:
                    System.out.println("Nivel de dificultad no valido. se seleccionara el nivel facil por defecto.");
                    rangoMaximo = 10;
            }
        }
        
        int correctAnswer = 0;
        int totalQuestion = 10;
        
     
        }
    





