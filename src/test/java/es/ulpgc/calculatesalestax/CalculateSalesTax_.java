package es.ulpgc.calculatesalestax;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculateSalesTax_ {
    private CalculateSales calculateSales;
    private double SCTAX;
    private double ALTAX;
    private double GATAX;
    private double KYTAX;

    @Before
    public void setUp() {
        calculateSales = new CalculateSales();
        SCTAX = 2.5;
        ALTAX = 3.2;
        GATAX = 2.4;
        KYTAX = 4.1;
    }

    @Test
    public void name() {
        assertThat(calculateSales.ClaculateSalesTax("SC",2.5)).isEqualTo(2.5 * SCTAX);
    }

    public class CalculateSales implements es.ulpgc.calculatesalestax.CalculateSales {

        public double ClaculateSalesTax(String state, double price){
            switch (state){
                case "SC": return price * SCTAX;
                case "AL": return price * ALTAX;
                case "GA": return price * GATAX;
                case "KY": return price * KYTAX;
            }
            return price;
        }

    }
}
