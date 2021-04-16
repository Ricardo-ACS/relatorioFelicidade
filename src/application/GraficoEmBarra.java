package application;

import java.util.List;

import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import entities.Inover;


public class GraficoEmBarra extends JFrame{
    public GraficoEmBarra(List<Inover> listaFuncionarios){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Satisfacao Inovers");
        setSize(1280,720);
        setLocationRelativeTo(null);
        
        criarGraficoInovers(listaFuncionarios);
        
        setVisible(true);
    }
    
    public void criarGraficoInovers(List<Inover> listaFuncionarios){
        DefaultCategoryDataset barra = new DefaultCategoryDataset();
        double i = 0;
        int j = 0;
        for(Inover funcionario : listaFuncionarios){
            barra.setValue(funcionario.getMediaSatisfacao(),funcionario.getNome(),"");
            i += funcionario.getMediaSatisfacao();
            j++;
        }
        i = i/j;
        barra.setValue(i,"Media dos funcionarios","");
        
        JFreeChart grafico = ChartFactory.createBarChart("Grafico em Barra respectiva a media da satisfacao dos inovers","","Grau de satisfacao",barra,PlotOrientation.VERTICAL,true,false,false);
        ChartPanel painel = new ChartPanel(grafico);
        add(painel);
    }
}
