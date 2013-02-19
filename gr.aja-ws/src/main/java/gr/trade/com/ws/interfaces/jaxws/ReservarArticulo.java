
package gr.trade.com.ws.interfaces.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "reservarArticulo", namespace = "http://interfaces.ws.com.trade.gr/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reservarArticulo", namespace = "http://interfaces.ws.com.trade.gr/", propOrder = {
    "number1",
    "number2"
})
public class ReservarArticulo {

    @XmlElement(name = "number1", namespace = "")
    private Integer number1;
    @XmlElement(name = "number2", namespace = "")
    private Integer number2;

    /**
     * 
     * @return
     *     returns Integer
     */
    public Integer getNumber1() {
        return this.number1;
    }

    /**
     * 
     * @param number1
     *     the value for the number1 property
     */
    public void setNumber1(Integer number1) {
        this.number1 = number1;
    }

    /**
     * 
     * @return
     *     returns Integer
     */
    public Integer getNumber2() {
        return this.number2;
    }

    /**
     * 
     * @param number2
     *     the value for the number2 property
     */
    public void setNumber2(Integer number2) {
        this.number2 = number2;
    }

}
