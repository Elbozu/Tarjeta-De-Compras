import java.util.ArrayList;
import java.util.List;

public class TarjetaDeCredito {
    private  double creditoAprobado;
    private double balance;
    private List<Compra> listaDeCompras;

    public TarjetaDeCredito(double creditoAprobado) {
        this.creditoAprobado = creditoAprobado;
        this.balance = creditoAprobado;
        this.listaDeCompras = new ArrayList<>();
    }

    public boolean verificarCompra(Compra compra){
        if(this.balance >= compra.getPrecio()){
            this.balance -= compra.getPrecio();
            this.listaDeCompras.add(compra);
            return true;
        }
        return false;
    }

    public double getCreditoAprobado() {
        return creditoAprobado;
    }

    public double getBalance() {
        return balance;
    }

    public List<Compra> getListaDeCompras() {
        return listaDeCompras;
    }
}
