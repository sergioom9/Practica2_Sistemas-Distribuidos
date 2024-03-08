import java.rmi.Remote;
import java.rmi.RemoteException;

/*
	Declarar firma de métodos que serán sobrescritos
*/
public interface Interfaz extends Remote {
    float sumar(float numero1) throws RemoteException;
    float restar(float numero1, float numero2) throws RemoteException;
}
