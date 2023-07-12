package org.lessons.java.security;

import java.util.Scanner;

/* ESERCIZIO:
Il programma deve fare quanto segue:
* salvare in opportune variabili il nome, cognome, colore preferito e data di nascita
di un utente suddivisa in giorno, mese e anno (in numero)
* generare (e stampare a video) una password concatenando nome, cognome, colore preferito
e somma di giorno, mese e anno di nascita, separate dal carattere -
*/
public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // definisco le variabili necessarie
        String name;
        String surname;
        String favColor;
        int dayOfBirth;
        int monthOfBirth;
        int yearOfBirth;
        int sumDayMonthYear;
        String insecurePassword;
        char dash = '-';

        // attribuisco i valori alle variabili
        name = "Pinco";
        surname = "Pallo";
        favColor = "magenta";
        dayOfBirth = 12;
        monthOfBirth = 5;
        yearOfBirth = 1994;

        // calcolo la somma di giorno, mese e anno di nascita dell'utente
        sumDayMonthYear = dayOfBirth + monthOfBirth + yearOfBirth;

        // genero la password e la stampo in console
        insecurePassword = name + dash + surname + dash + favColor + dash + sumDayMonthYear;
        System.out.println(insecurePassword);
    }
}
