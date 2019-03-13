package com.example.prashant.mela_money;

class Mevent {

    private String title, description, amount;


    public Mevent(String title, String description, String amount) {
        this.title=title;
        this.description=description;
        this.amount=amount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
