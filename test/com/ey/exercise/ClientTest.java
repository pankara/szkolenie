package com.ey.exercise;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ClientTest {

    @Test
    public void testLoginWithInvalidPassword() {
        Client client = new Client("test@example.com", 22);
        client.login("invalidPass");
        assertFalse(client.isLogged());
    }

    @Test
    public void testLoginWithValidPassword() {
        Client client = new Client("test@example.com", 22);
        client.login("Pa55w0rd!");
        assertTrue(client.isLogged());
    }

    @Test
    public void testDeleteAccountWhenUserNotLoggedIn() {
        Client client = new Client("test@example.com", 22);
        client.deleteAccount();
        assertFalse(client.isDeleted());
    }

    @Test
    public void testDeleteAccountWhenUserLoggedIn() {
        Client client = new Client("test@example.com", 22);
        client.login("Pa55w0rd!");
        client.deleteAccount();
        assertTrue(client.isDeleted());
    }

    @Test
    public void testLoginAfterDeletingAccount() {
        Client client = new Client("test@example.com", 22);
        client.login("Pa55w0rd!");
        client.deleteAccount();
        client.login("Pa55w0rd!");
        assertFalse(client.isLogged());
    }
}