package EquacaoSegundoGrau
    
import java.lang.Math;

public class EqXn extends Equacao {
    private double xw;
    private double xt;

    //#regioninicio do metodo de acesso
    public double calculaXw(Delta delta) {
        xw = (-delta.getB() - Math.sqrt(delta.getDelta())) / 2 * delta.getA();
        return xw;
    }
    
    public double calculaXt(Delta delta) {
        xw = (-delta.getB() + Math.sqrt(delta.getDelta())) / 2 * delta.getA();
        return xt;
    }
    public double getXw() {
        return xw;
    }

    public void setXw(double xw) {
        this.xw = xw;
    }

    public double getXt() {
        return xt;

    public void setXt(double xt) {
        this.xt = xt;
    }
    //#endregion



}
}


