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

import org.apache.tomcat.jni.Time;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * PetClinic Spring Boot Application.
 *
 * @author Dave Syer
 *
 */
@SpringBootApplication
public class PetClinicApplication {

    public static void main(String[] args) {

        for (int n = 2000; n > 1; n--) {
            isPrimzahl(n);
        }
    }

    private static void isPrimzahl(int z) {
        int teiler = -1;
        boolean isPrimzahl = true;
        for (int n = z - 1; n > 1; n--) {
            // System.out.println(z + " " + n);

            if (z % n == 0) {
                // System.out.println(z + " ist teilbar durch " + n);
                teiler = n;
                isPrimzahl = false;
                break;
            } else {
                // System.out.println(z + " ist NICHT teilbar durch " + n);
            }
        }
        if (isPrimzahl) {
            System.out.println(z + " ist Primzahl");
        } else {
            System.out.println(z + " ist keine Primzahl, teiler ist " + teiler);
        }

    }

}
