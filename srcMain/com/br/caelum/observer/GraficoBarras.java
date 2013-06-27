package com.br.caelum.observer;

import javax.swing.*;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * Created with IntelliJ IDEA.
 * User: jorge
 * Date: 6/23/13
 * Time: 9:30 AM
 * To change this template use File | Settings | File Templates.
 */
public class GraficoBarras implements Observador {
	private static final int HEIGHT = 270;
	private static final int WIDTH = 500;
	private DefaultCategoryDataset dataset;
	private JFrame frame = new JFrame();

	public GraficoBarras() {
		dataset = new DefaultCategoryDataset();
		JFreeChart chart =  ChartFactory.createBarChart("Carteira de Ações", "Siglas",
							"Quantidade", dataset, PlotOrientation.VERTICAL,
							false, true, false);
		
		ChartPanel chartPanel = new ChartPanel(chart);
		frame.setContentPane(chartPanel);
		frame.setSize(WIDTH, HEIGHT);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void mudancaQuantidade(String acao, Integer quantidade) {
		dataset.setValue(quantidade, "Quantidade", acao);
	}
}