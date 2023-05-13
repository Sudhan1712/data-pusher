package com.subash.data.pusher.view;

public class Account {

    private String name;
    private String emailId;
    private String accountId;
    private String webSite;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", emailId='" + emailId + '\'' +
                ", accountId='" + accountId + '\'' +
                ", webSite='" + webSite + '\'' +
                '}';
    }
}
