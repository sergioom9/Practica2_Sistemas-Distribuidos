package main;

import org.junit.jupiter.api.Test;
import main.Servidor;
import main.Interfaz;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InterfazTest {

    @Test
    void sumar() throws RemoteException, NotBoundException {

        //Arrange
        Servidor n1 = new Servidor();
        Registry registry = LocateRegistry.getRegistry("127.0.0.1", 1500);
        Interfaz interfaz = (Interfaz) registry.lookup("Calc");
        //Act
        float value = interfaz.sumar(10,10,10);
        float expectedvalue = 30;

        //Assertions
        assertEquals(expectedvalue,value);

    }

    @Test
    void restar() throws RemoteException, NotBoundException {
        //Arrange
        Servidor n1 = new Servidor();
        Registry registry = LocateRegistry.getRegistry("127.0.0.1", 1500);
        Interfaz interfaz = (Interfaz) registry.lookup("Calc");
        //Act
        float value = interfaz.restar(5, 10);
        float expectedvalue = -5;

        //Assertions
        assertEquals(expectedvalue,value);
    }

    @Test
    void multiplicar() throws RemoteException, NotBoundException{
        //Arrange
        Servidor n1 = new Servidor();
        Registry registry = LocateRegistry.getRegistry("127.0.0.1", 1500);
        Interfaz interfaz = (Interfaz) registry.lookup("Calc");
        //Act
        float value = interfaz.multiplicar(5,10);
        float expectedvalue = 50;

        //Assertions
        assertEquals(expectedvalue,value);

    }

    @Test
    void dividir() throws NotBoundException, RemoteException {
        //Arrange
        Servidor n1 = new Servidor();
        Registry registry = LocateRegistry.getRegistry("127.0.0.1", 1500);
        Interfaz interfaz = (Interfaz) registry.lookup("Calc");
        //Act
        float value = interfaz.dividir(0, 5);
        float expectedvalue =2;

        //Assertions
        assertEquals(expectedvalue,value);
    }


    @Test
    void raiz_cuadrada() throws NotBoundException, RemoteException {
        //Arrange
        Servidor n1 = new Servidor();
        Registry registry = LocateRegistry.getRegistry("127.0.0.1", 1500);
        Interfaz interfaz = (Interfaz) registry.lookup("Calc");
        //Act
        float value = interfaz.raiz_cuadrada(9);
        float expectedvalue = 3;

         value = interfaz.raiz_cuadrada(-2);
         expectedvalue = 2;

        //Assertions
        assertEquals(expectedvalue,value);
    }
    }
