package projetomonitoramentoserasa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Leitura {
    public ArrayList<Objeto> lerPlanilha(){
        try{
            Timer timer = new Timer();
            ArrayList<Objeto> objetos = new ArrayList<Objeto>();
            String linha = "";
            String diretorio = "C:\\ConsultaSerasa\\serasa.csv";
            BufferedReader buf = new BufferedReader(new FileReader(diretorio));
            while((linha = buf.readLine()) != null){
                String[] textoSeparado = linha.split(";");
                Objeto objeto = new Objeto(textoSeparado[0], textoSeparado[1]);
                objetos.add(objeto);
            }
            return objetos;
        }catch(Exception e){
            System.out.println("error!");
            return null;
        }
    }
}
