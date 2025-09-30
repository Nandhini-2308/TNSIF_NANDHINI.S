package com.tnsip.entity.java;

public class Customerexecuter {
    public static void main(String[] args) {
        Customer c1 = new Customer();

        // using setters
        c1.setId(1);
        c1.setCname("Nandhini");
        c1.setCity("Villupuram");

        // using getters
        System.out.println("id: " + c1.getId() + 
                           " cname: " + c1.getCname() + 
                           " city: " + c1.getCity());
    }
}
