package ro.fasttrackit.lab6.homework;

import java.util.Arrays;

/**
 * @author flo
 * @since 30.03.2022.
 */
public class Agenda {

    public static void main(String[] args) {
        int[] agenda = new int[10];

        System.out.println(Arrays.toString(agenda));

        System.out.println(add(agenda, 45));
        System.out.println(Arrays.toString(agenda));
        System.out.println(add(agenda, 46));
        System.out.println(add(agenda, 47));
        System.out.println(add(agenda, 48));
        System.out.println(add(agenda, 45));
        System.out.println(add(agenda, 45));
        System.out.println(add(agenda, 45));
        System.out.println(add(agenda, 45));
        System.out.println(add(agenda, 45));
        System.out.println(add(agenda, 45));
        System.out.println(Arrays.toString(agenda));
        System.out.println(add(agenda, 45));
        System.out.println(search(agenda, 48));
        System.out.println(search(agenda, 488));
    }

    private static int search(int[] agenda, int searched) {
        int i = 0;
        while(i < agenda.length && agenda[i] != searched) {
            i++;
        }
        if(i == agenda.length) {
            return -1;
        }
        return i;
    }

    // -35 cod de eroare pentru agenda e plina
    private static int add(int[] agenda, int newNumber) {
        int i = 0;
        while(i < agenda.length && agenda[i] != 0) {
            i++;
        }
        if(i == agenda.length) {
            return -35;
        }
        agenda[i] = newNumber;
        return i;
    }


}
