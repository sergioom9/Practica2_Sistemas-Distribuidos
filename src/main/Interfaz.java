// Sergio Martin y Gonzalo Vazquez
package main;
import java.rmi.Remote;
import java.rmi.RemoteException;

/*
	Declarar firma de métodos que serán sobrescritos
*/
public interface Interfaz extends Remote {
    float sumar(float numero1, float numero2,float numero3) throws RemoteException;
    float restar(float numero1, float numero2) throws RemoteException;
    float multiplicar(float numero1, float numero2) throws RemoteException;
    float dividir(float numero1,float numero2) throws RemoteException;
    float raiz_cuadrada(float numero1) throws RemoteException;
}
