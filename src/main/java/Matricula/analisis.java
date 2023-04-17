
package Matricula;

public class analisis {
    public static double Calculo_matricula(double PAT, double ES){
        double PAGMAT;
        PAGMAT = 50000;
        
        if (PAT > 2000000 && ES >3){
            PAGMAT = PAGMAT + (0.03*PAT);
        }
        return PAGMAT;
    }
}
