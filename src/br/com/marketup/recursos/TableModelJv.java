
package br.com.marketup.recursos;

import br.com.marketup.nogocio.Venda;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author rafae
 */
public class TableModelJv extends AbstractTableModel {
    
    private final List<Venda> dados = new ArrayList<>();
    private final String[] colunas = {"Pagamento","Tipo","Parcelas","Valor"};

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length; 
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        
        switch(coluna){
            
            case 0:
                return dados.get(linha).getFormadepagamento();
            case 1:
                return dados.get(linha).getTipo();
            case 2:
                return dados.get(linha).getParcela();
            case 3:
                return dados.get(linha).getValorpagamento();    
        }
        
        return null;
    }
    
    public void addRow(Venda venda){
        this.dados.add(venda);
        this.fireTableDataChanged();
  
    }
    
}
