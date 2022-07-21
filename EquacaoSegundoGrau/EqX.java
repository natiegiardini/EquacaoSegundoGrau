package EquacaoSegundoGrau
    
import java.lang.Math;

public class EqXn extends Equacao {
    private double xw;
    private double xt;

    //#regioninicio do metodo de acesso
    public double calculaXn(Delta delta) {
        xw = (-delta.getB() - Math.sqrt(delta.getDelta())) / 2 * delta.getA();
        return xw;
    }
    
    public double calculaXp(Delta delta) {
        xw = (-delta.getB() + Math.sqrt(delta.getDelta())) / 2 * delta.getA();
        return xt;
    }
    public double getXn() {
        return xw;
    }

    public void setXn(double xw) {
        this.xw = xw;
    }

    public double getXp() {
        return xt;

    public void setXp(double xt) {
        this.xt = xt;
    }
    //#endregion



}
}


