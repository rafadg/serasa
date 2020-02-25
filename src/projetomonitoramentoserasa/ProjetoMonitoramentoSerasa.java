package projetomonitoramentoserasa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import telas.MonitorSerasa;

public class ProjetoMonitoramentoSerasa {
    
    public static void main(String[] args) {
        String diretorio = ("C:\\ConsultaSerasa");
        Leitura l = new Leitura();
        MonitorSerasa tela = new MonitorSerasa(l.lerPlanilha());
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
    }
}
