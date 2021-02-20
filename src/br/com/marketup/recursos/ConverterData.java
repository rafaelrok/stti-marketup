
package br.com.marketup.recursos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Jorge
 */
public class ConverterData extends org.jdesktop.beansbinding.Converter{
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    @Override
    public Object convertForward(Object value) {
        Calendar c = (Calendar) value;
        return sdf.format(c.getTime());
    }

    @Override
    public Object convertReverse(Object value) {
        String str = (String) value;
        Calendar c = Calendar.getInstance();
        try {
            c.setTime(sdf.parse(str));
            return c;
        }catch (ParseException e){
            return null;
        }
    }
    
}