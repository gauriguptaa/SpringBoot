package com.develop.smoothieOrders.Models;

import javax.persistence.*;

@Entity(name="orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long order_Id;
    @ManyToOne
    @JoinColumn(name="user_Id")
    private User user;
    @ManyToOne
    @JoinColumn(name="menu_Id")
    private Menu menu;

    public Orders(){

    }
    public Orders(User user, Menu menu) {
        this.user = user;
        this.menu = menu;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }


}
