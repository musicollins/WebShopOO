package com.grit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Customer c1 = new Customer("Ralph", 19911116, 1111222233334444L);
        Customer c2 = new Customer("John", 19901115, 1111133332222444L);
        Customer c3 = new Customer("Anna", 19860107);
        c3.registerCreditCard(1111422233334444L);



    }
}
