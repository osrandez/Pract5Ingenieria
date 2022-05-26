public class Sueldo {
    //suponemos que el tipo de trabajador y las ventas son datos correctos
//ya que se validan por la interfaz de entrada de datos
    public double calculaBruto(char tipoTrab, double ventas) {
        int fijo = 1000;
        double bruto;   //1
        if (tipoTrab == 'F') {  //2
            if (ventas >= 5000) {   //3
                bruto = fijo + ventas * 0.05;   //4
            } else {
                bruto = fijo;   //5
            }   //6
        } else {
            if (ventas <= 3000) {   //7
                bruto = ventas * 0.15;  //8
            } else {
                if (ventas <= 5000) {   //9
//mostramos operaciones por claridad
                    bruto = 3000 * 0.15 + (ventas - 3000) * 0.2;    //10
                } else {
                    bruto = 3000 * 0.15 + 2000 * 0.2 +  //11
                            (ventas - 5000) * 0.5;
                }   //12
            }   //13
        }//14
        return bruto;   //15
    }
    public double calculaRet(char tipoTrab, double bruto) {
        double ret; //1
        if ((tipoTrab == 'E')||(bruto <=1000)) {    //2-3
            ret = bruto * 0.05; //4
        } else {
            if (bruto <= 1200) {    //5
                ret = bruto * 0.15; //6
            } else {
                ret = bruto * 0.10; //7
            }   //8
        }   //9
        return ret; //10
    }
    public double calculaNeto(double bruto, double ret) {
        return bruto-ret;
    }
}