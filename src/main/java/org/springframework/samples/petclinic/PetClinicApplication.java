/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.samples.petclinic;

import java.util.Calendar;
import java.util.Scanner;

import org.apache.tomcat.jni.Time;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * PetClinic Spring Boot Application.
 *
 * @author Lion Wurdel
 *
 *         TODO: * Eingabe von Zahlen * Eingabe von - bis * Primzahlen in Liste
 *         merken und dann ausgeben * Richtung des Zählens
 *
 *         2 147 483 647
 */
// @SpringBootApplication
public class PetClinicApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // System.in is a standard input stream
        System.out.print("Enter start number- ");
        int start = sc.nextInt();
        System.out.print("Enter end number- ");
        int end = sc.nextInt();

        // int start = 10;
        // int end = 2;

        for (int n = start; n <= end; n++) {
             isPrimzahl(n);
        }
    }

    private static void isPrimzahl(int testZahl) {
        int teiler = -1;
        boolean isPrimzahl = true;

        int durchZwei = testZahl / 2;
        // System.err.println(testZahl + " "+ durchZwei);

        // for (int n = testZahl - 1; n > 1; n--) {
        for (int n = 2; n <= durchZwei; n++) {
            // System.out.println(z + " " + n);

            if (testZahl % n == 0) {
                // System.out.println(testZahl + " ist teilbar durch " + n);
                teiler = n;
                isPrimzahl = false;
                break;
            } else {
                // System.out.println(testZahl + " ist NICHT teilbar durch " + n);
            }
        }
        if (isPrimzahl) {
            System.out.println(testZahl + " ist Primzahl");
        } else {
            //System.out.println(testZahl + " ist keine Primzahl, teiler ist " + teiler);
        }

    }

}
