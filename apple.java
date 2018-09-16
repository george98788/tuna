/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuna;

/**
 *
 * @author George
 */
public class apple {

    private int price;
    private int quantity;

    apple(int cost, int amount) {
        price = cost;
        quantity = amount;

        System.out.println("Apple constructed");
    }

    public void setPrice(int newPrice) {
        price = newPrice;

    }

    public void setQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String toString() {
        return String.format("The cost of and apple is %dp, we have %d avialable.", price, quantity);
    }
}
